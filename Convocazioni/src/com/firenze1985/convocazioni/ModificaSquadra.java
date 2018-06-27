/**
 * 
 */
package com.firenze1985.convocazioni;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firenze1985.db.DatabaseHelper;

/**
 * @author Daniele
 *
 */
public class ModificaSquadra extends SquadraActivity {

	
	
	/* *************************************** DICHIARAZIONE VARIABILI ***************************** */
	Button buttonRemove;
	DatabaseHelper databaseHelper;
	/* ********************************************************************************************** */
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.creasquadra_layout);
		
	    // RECUPERO NOME SQUADRA CLICCATO COME CHILD DELLO SMISTATORE MULTISQUADRA	    
		String nomeSquadraString = getIntent().getStringExtra("nomeSquadraString");
		setTextIn((EditText)findViewById(R.id.idEditTextInserisciGiocatore));
		
		// SETTAGGIO NOME SQUADRA
		((EditText)findViewById(R.id.idEditTextNomeSquadra)).setText(nomeSquadraString);
		setContainer((LinearLayout)findViewById(R.id.idContenitoreElencoGiocatori));
		
		// ALERT MESSAGGIO SQUADRA SALVATA
	    final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);

		// TEXTVIEW NUMERO GIOCATORI
		setNumeroGiocatori((TextView) findViewById(R.id.idTextViewNumeroGiocatori));
		aggiornaTextViewNumeroGiocatori();

		// RECUPERO ELENCO DEI GIOCATORI    	    
		setDatabaseHelper(new DatabaseHelper(getApplicationContext()));
		SQLiteDatabase db = getDatabaseHelper().getWritableDatabase();
		LinkedHashMap<String,List<String>> hashMapStringRecuperate = new LinkedHashMap<String,List<String>>();
		// come parametro devo passare cio' che leggo nel child su cui clicco
		Cursor uuu = getDatabaseHelper().getSquadra(nomeSquadraString);
        // Adding child data
        List<String> child = new ArrayList<String>();
        try
		{
			while (uuu.moveToNext())
			{
				String indice = uuu.getString(2);
				//String usernameAdmin = uuu.getString(1);
				child.add(indice);
				//listaString.add(usernameAdmin);
				hashMapStringRecuperate.put(""+uuu.getPosition(), child);
			    LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				final View addView = layoutInflater.inflate(R.layout.row, null);
			    TextView textOut = (TextView)addView.findViewById(R.id.textout);
			    textOut.setText(indice);
			    setContatore(getContatore()+1);
			    getTextIn().setText("");
			    getTextViewHashMap().put(textOut.getText().toString(), textOut);
			    Button buttonRemove = (Button)addView.findViewById(R.id.idBottoneEliminaGiocatore);
			    buttonRemove.setOnClickListener(new OnClickListener(){

		    	@Override
		    	public void onClick(View v) {
			    	TextView textOut = (TextView)addView.findViewById(R.id.textout);	    	 
			    	((LinearLayout)addView.getParent()).removeView(addView);
			    	getTextViewHashMap().remove(textOut.getText().toString());
			    	setContatore(getContatore()-1);
					aggiornaTextViewNumeroGiocatori();
			    }});
		    
		     	getContainer().addView(addView);
				aggiornaTextViewNumeroGiocatori();
			}
		}
		finally
		{
			uuu.close();
		}
	    //
        
        
		// gestione bottone aggiungi giocatore
		setButtonAdd((Button)findViewById(R.id.idBottoneAggiungiGiocatore));
		getButtonAdd().setOnClickListener(aggiungiGiocatore());
		//  
		
		
		// gestione bottone salva
	  	setButtonSalva((Button)findViewById(R.id.idBottoneSalva));
	  	getButtonSalva().setOnClickListener(salvaSquadra(builder1, true));
	  	//
	  	  	
	}
	


	/* ************************************** GETTER E SETTER ********************************* */
	/**
	 * @return the buttonRemove
	 */
	public Button getButtonRemove() {
		return buttonRemove;
	}

	/**
	 * @param buttonRemove the buttonRemove to set
	 */
	public void setButtonRemove(Button buttonRemove) {
		this.buttonRemove = buttonRemove;
	}

	/**
	 * @return the databaseHelper
	 */
	public DatabaseHelper getDatabaseHelper() {
		return databaseHelper;
	}

	/**
	 * @param databaseHelper the databaseHelper to set
	 */
	public void setDatabaseHelper(DatabaseHelper databaseHelper) {
		this.databaseHelper = databaseHelper;
	}
	/* *************************************************************************************** */

}
