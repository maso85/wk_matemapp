/**
 * 
 */
package com.firenze1985.convocazioni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.firenze1985.db.DatabaseHelper;

/**
 * @author Daniele
 *
 */
public class SmistatoreMultiSquadra extends GenericActivity {

	/* ************************************* OVERRIDE OBBLIGATORI ********************************* */
	@Override
	public void setMainActivity(Class arg0) {
		this.mainActivity = arg0;
	}

	@Override
	public void setCurrentActivity(BaseActivity arg0) {
		this.currentActivity = arg0;
	}

	@Override
	public void setSuperParameter() {
		setMainActivity(MenuPrincipale.class);
		setCurrentActivity(this);
	}	
	/* ******************************************************************************************** */
	
	
	/* ********************************** DICHIARAZIONE VARIABILI ************************* */
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	/* ************************************************************************************ */
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.smistatoremultisquadra_layout);

		setExpListView((ExpandableListView) findViewById(R.id.idSmistatoreMultiSquadraListaEspandibile));

		// preparing list data
		prepareListData();

		// crea la TUA expandableListAdapter, vedi esempio in preferiti
		List<String> listaFinta = new ArrayList<String>();
		listaFinta.add("Squadre");
		setListAdapter(new MyExpandableListAdapter(this, listaFinta,
				listDataChild));

		// setting list adapter
		expListView.setAdapter(listAdapter);

		final Object smistatoreIntent = getIntent().getSerializableExtra(
				"smistatoreIntent");

		expListView
				.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

					@Override
					public boolean onChildClick(ExpandableListView parent,
							View v, int groupPosition, int childPosition,
							long id) {
						Intent intent = new Intent(getApplicationContext(),
								(Class<?>) smistatoreIntent);
						RelativeLayout layout = (RelativeLayout) v;
						TextView textView = (TextView) layout.getChildAt(0);
						String nomeSquadraString = textView.getText()
								.toString();
						intent.putExtra("nomeSquadraString", nomeSquadraString);
						startActivity(intent);

						return true;
					}

				});
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Squadre");
		// listDataHeader.add("Now Showing");
		// listDataHeader.add("Coming Soon..");

		Context context = getApplicationContext();
		DatabaseHelper databaseHelper = new DatabaseHelper(context);
		SQLiteDatabase db = databaseHelper.getWritableDatabase();
		LinkedHashMap<String, List<String>> hashMapStringRecuperate = new LinkedHashMap<String, List<String>>();
		// come parametro devo passare cio' che leggo nel child su cui clicco
		Cursor uuu = databaseHelper.getElencoSquadre();
		// Adding child data
		List<String> top250 = new ArrayList<String>();
		/*
		 * top250.add("The Shawshank Redemption"); top250.add("The Godfather");
		 * top250.add("The Godfather: Part II"); top250.add("Pulp Fiction");
		 * top250.add("The Good, the Bad and the Ugly");
		 * top250.add("The Dark Knight"); top250.add("12 Angry Men");
		 */
		try {
			while (uuu.moveToNext()) {
				String indice = uuu.getString(0);
				// String usernameAdmin = uuu.getString(1);
				top250.add(indice);
				// listaString.add(usernameAdmin);
				hashMapStringRecuperate.put("" + uuu.getPosition(), top250);
			}
		} finally {
			uuu.close();
		}
		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
	}
	
	
	/* ******************************************** GETTER E SETTER *********************************** */
	/**
	 * @return the listAdapter
	 */
	public ExpandableListAdapter getListAdapter() {
		return listAdapter;
	}

	/**
	 * @param listAdapter
	 *            the listAdapter to set
	 */
	public void setListAdapter(ExpandableListAdapter listAdapter) {
		this.listAdapter = listAdapter;
	}

	/**
	 * @return the expListView
	 */
	public ExpandableListView getExpListView() {
		return expListView;
	}

	/**
	 * @param expListView
	 *            the expListView to set
	 */
	public void setExpListView(ExpandableListView expListView) {
		this.expListView = expListView;
	}

	/**
	 * @return the listDataHeader
	 */
	public List<String> getListDataHeader() {
		return listDataHeader;
	}

	/**
	 * @param listDataHeader
	 *            the listDataHeader to set
	 */
	public void setListDataHeader(List<String> listDataHeader) {
		this.listDataHeader = listDataHeader;
	}

	/**
	 * @return the listDataChild
	 */
	public HashMap<String, List<String>> getListDataChild() {
		return listDataChild;
	}

	/**
	 * @param listDataChild
	 *            the listDataChild to set
	 */
	public void setListDataChild(HashMap<String, List<String>> listDataChild) {
		this.listDataChild = listDataChild;
	}
	/* ************************************************************************************************ */
}
