/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.frazioni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.firenze1985.matemapp.Capitolo;
import com.firenze1985.matemapp.EserciziListAdapter;
import com.firenze1985.matemapp.R;

/**
 * @author Administrator
 *
 */
public class FrazioniCap6 extends Capitolo {
	
	View androidView;
	ExpandableListView listView;
	private List<String> listaEsercizi;
    private HashMap<String, List<String>> hashMapPassaggiEsercizi;
		
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        setAndroidView(inflater.inflate(R.layout.argomentolistaesercizi_layout, container, false));
        setListView((ExpandableListView) getAndroidView().findViewById(R.id.idListaEsercizi));

        prepareListData();
        EserciziListAdapter adapter = new EserciziListAdapter(getContext(), getListaEsercizi(), getHashMapPassaggiEsercizi());
 
        getListView().setAdapter(adapter);
        
        return getAndroidView();
		
	}
	
	public FrazioniCap6() {
	}
	
	public FrazioniCap6(String stringaPassata) {
		new FrazioniCap6();
		//testoDaLeggere = stringaPassata;
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		setListaEsercizi(new ArrayList<String>());
		setHashMapPassaggiEsercizi(new HashMap<String, List<String>>());

		// Adding child data
		getListaEsercizi().add("Squadre");
		getListaEsercizi().add("Now Showing");
		getListaEsercizi().add("Coming Soon..");

		// Adding child data
		List<String> top250 = new ArrayList<String>();		
		top250.add("The Shawshank Redemption"); top250.add("The Godfather");
		top250.add("The Godfather: Part II"); top250.add("Pulp Fiction");
		top250.add("The Good, the Bad and the Ugly");
		top250.add("The Dark Knight"); top250.add("12 Angry Men");

		
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(0), top250); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(1), top250); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(2), top250); // Header, Child data
	}

	

	/**
	 * @return the listaEsercizi
	 */
	public List<String> getListaEsercizi() {
		return listaEsercizi;
	}

	/**
	 * @param listaEsercizi the listaEsercizi to set
	 */
	public void setListaEsercizi(List<String> listaEsercizi) {
		this.listaEsercizi = listaEsercizi;
	}

	/**
	 * @return the hashMapPassaggiEsercizi
	 */
	public HashMap<String, List<String>> getHashMapPassaggiEsercizi() {
		return hashMapPassaggiEsercizi;
	}

	/**
	 * @param hashMapPassaggiEsercizi the hashMapPassaggiEsercizi to set
	 */
	public void setHashMapPassaggiEsercizi(
			HashMap<String, List<String>> hashMapPassaggiEsercizi) {
		this.hashMapPassaggiEsercizi = hashMapPassaggiEsercizi;
	}

	/**
	 * @return the android
	 */
	public View getAndroidView() {
		return androidView;
	}

	/**
	 * @param android the android to set
	 */
	public void setAndroidView(View androidView) {
		this.androidView = androidView;
	}

	/**
	 * @return the listView
	 */
	public ExpandableListView getListView() {
		return listView;
	}

	/**
	 * @param listView the listView to set
	 */
	public void setListView(ExpandableListView listView) {
		this.listView = listView;
	}
}
