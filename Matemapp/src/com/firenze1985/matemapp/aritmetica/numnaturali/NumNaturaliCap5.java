/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.numnaturali;

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
import com.firenze1985.matemapp.utility.MathSymbol;

/**
 * @author Administrator
 *
 */
public class NumNaturaliCap5 extends Capitolo {

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
	
	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		setListaEsercizi(new ArrayList<String>());
		setHashMapPassaggiEsercizi(new HashMap<String, List<String>>());

		// Adding child data
		getListaEsercizi().add("Completamento frasi");
		getListaEsercizi().add("Il sistema posizionale");
		getListaEsercizi().add("La semiretta orientata");
		getListaEsercizi().add("Compito di realtà");
		// Adding child data

		// completamento frasi
		List<String> lista0 = new ArrayList<String>();		
		lista0.add("Nell'insieme dei numeri naturali ogni numero ha un ............... tranne lo 0.");
		lista0.add("La cardinalità dell'insieme dei numeri naturali è .............. ");
		lista0.add("Una cifra è un elemento dell'insieme C={..........}");
		lista0.add("Il nostro sistema di rappresentazione dei numeri si dice .............. ossia in base alla .............. delle cifre, queste ultime assumono un significato differente.");
		lista0.add("Unità semplice, decine di unità, centinaia di unità fanno parte della prima ...........");
		lista0.add("Un modo di rappresentare l'insieme dei numeri naturali è mediante una ............. ............");
		lista0.add("Sulla semiretta orientata, la freccia posta all'estremo ......... indica in quale verso crescono i numeri.");
		
		// appartiene / non appartiene
		List<String> lista1 = new ArrayList<String>();		
		lista1.add("Esercizio 1:\n\nPrepara una tabella con un numero sufficiente di colonne (scopri tu di quante ne hai bisogno) che riassuma i discorsi affrontati per la rappresentazione posizionale di un numero: ci sono varie classi, ogni classe ha un numero preciso di ordini. Un suggerimento: puoi pensare alle classi come delle colonnone, suddividendo poi ogni colonnona in 3 colonne più piccole.");
		lista1.add("Esercizio 2:\n\nTenendo presente la tabella preparata nell'esercizio precedente, incasellare correttamente i seguenti numeri: 15, 18, 198, 108, 450, 405, 885, 570, 90.");
		lista1.add("Esercizio 3:\n\nTenendo presente la tabella preparata nell'esercizio precedente, incasellare correttamente i seguenti numeri: 741, 1.020, 1.002, 1.348, 4.995, 1.936, 10.085, 51.003, 70.700");
		lista1.add("Esercizio 4:\n\nTenendo presente la tabella preparata nell'esercizio precedente, incasellare correttamente i seguenti numeri: 15.150, 20.480, 30.500, 478.500, 151.205, 998.155, 102.055, 6.656.044, 1.225.480");

		// sottoinsiemi
		List<String> lista2 = new ArrayList<String>();		
		lista2.add("Esercizio 1:\n\nDisegna una semiretta orientata cercando di utilizzare l'intero lato corto del foglio del quaderno, scegliendo opportunamente l'unità in modo tale da arrivare a rappresentare tutti i numeri da 0 a 12.");
		lista2.add("Esercizio 1:\n\nDisegna una semiretta orientata cercando di utilizzare l'intero lato corto del foglio del quaderno, scegliendo opportunamente l'unità in modo tale da arrivare a rappresentare tutti i numeri da 0 a 8.");
		lista2.add("Esercizio 1:\n\nDisegna una semiretta orientata cercando di utilizzare l'intero lato corto del foglio del quaderno, scegliendo opportunamente l'unità in modo tale da arrivare a rappresentare tutti i numeri da 0 a 6.");
		lista2.add("Esercizio 1:\n\nDisegna una semiretta orientata cercando di utilizzare l'intero lato corto del foglio del quaderno, scegliendo opportunamente l'unità in modo tale da arrivare a rappresentare tutti i numeri da 0 a 15.");
		lista2.add("Esercizio 1:\n\nDisegna una semiretta orientata cercando di utilizzare l'intero lato corto del foglio del quaderno, scegliendo opportunamente l'unità in modo tale da arrivare a rappresentare tutti i numeri da 0 a 16.");
		lista2.add("Esercizio 6:\n\nUna volta che hai disegnato queste semirette, rispondi a queste domande: in quale semiretta sei riuscito a utilizzare un'unità più grande? In quale semiretta hai utilizzato, invece, l'unità più piccola? Motiva entrambe le risposte.");
		
		// intersezione e unione
		List<String> lista3 = new ArrayList<String>();		
		lista3.add("Compito 1:\n\n");
		lista3.add("Compito 2:\n\nConsidera i due insiemi A={0, 2, 4, 6} B={2, 3, 4, 5, 6}.\n\nTrova:\nC = A "+MathSymbol.UNIONE+ " B\nD = A "+MathSymbol.INTERSEZIONE+" B.");
		
		
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(0), lista0); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(1), lista1); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(2), lista2); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(3), lista3); // Header, Child data
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
