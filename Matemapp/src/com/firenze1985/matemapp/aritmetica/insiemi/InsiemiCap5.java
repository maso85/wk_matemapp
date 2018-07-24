/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.insiemi;

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
public class InsiemiCap5 extends Capitolo {

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
		getListaEsercizi().add("Appartiene & non appartiene");
		getListaEsercizi().add("Sottoinsiemi");
		getListaEsercizi().add("Intersezione & Unione");
		getListaEsercizi().add("Compito di realtà");
		// Adding child data

		// completamento frasi
		List<String> lista0 = new ArrayList<String>();		
		lista0.add("Un insieme che non contiene elementi è detto insieme ................");
		lista0.add("L'operazione di .............. tra due insiemi A e B genera un insieme C che ha come elementi che appartengono sia ad A che a B");
		lista0.add("La cardinalità di un insieme è il numero degli .................... che appartengono a quell'insieme");
		lista0.add("Quando un insieme ha un numero limitato di elementi, si dice che la sua cardinalità è ...............");
		lista0.add("Quando noi immaginiamo a due sacchetti rovesciati all'interno di un terzo sacchetto, stiamo facendo una ................... tra i due sacchetti");
		lista0.add("Quando un insieme A è contenuto nell'insieme B, si dice che A è ............... di B. In simboli : ...........");
		lista0.add("Se un insieme ha cardinalità infinita, la rappresentazione corretta è quella per .................");
		
		// appartiene / non appartiene
		List<String> lista1 = new ArrayList<String>();		
		lista1.add("Esercizio 1:\n\nSia N={x|x è un mio compagno di classe che è maschio}. Elencare tutti gli elementi che appartengono a questo insieme. Utilizza i simboli appropriati. (Ricorda di usare una lettera minuscola per gli elementi).");
		lista1.add("Esercizio 2:\n\nSia C={x|x è una persona vivente nata nel 1483}. Elencare tutti gli elementi che appartengono a questo insieme. Utilizza i simboli appropriati. (Ricorda di usare una lettera minuscola per gli elementi).");
		lista1.add("Esercizio 3:\n\nSia D={x|x è un numero dispari minore di 12}. Quale è la cardinalità di D? Utilizza i simboli appropriati.");
		lista1.add("Esercizio 4:\n\nSia S={x|x è una squadra di calcio di Serie A}. La squadra Real Madrid appartiene all'insieme S? Utilizza i simboli appropriati.");

		// sottoinsiemi
		List<String> lista2 = new ArrayList<String>();		
		lista2.add("Esercizio 1:\n\nSia H={1, 4, 7, 10, 12}. Scrivi almeno 4 distinti sottoinsiemi di H.");
		lista2.add("Esercizio 2:\n\nSia C={x|x è un numero pari}. Scrivi almeno 3 sottoinsiemi distinti di C.");
		lista2.add("Esercizio 3:\n\nSia K={x|x è un erbivoro}. Scrivi, rappresentandoli per elencazione, almeno 2 sottoinsiemi distinti di K");
		lista2.add("Esercizio 4:\n\nSia U={1,2,3,4}. Scrivi almeno un sottoinsieme proprio e almeno un sottoinsieme improprio di U.");
		lista2.add("Esercizio 5:\n\nSia T="+MathSymbol.INSIEME_VUOTO+". Quanti sottoinsiemi impropri ha l'insieme T? Motiva la risposta.");
		
		// intersezione e unione
		List<String> lista3 = new ArrayList<String>();		
		lista3.add("Esercizio 1:\n\nConsidera i due insiemi A={1, 2, 3} B={2, 4, 6}.\n\nTrova:\nC = A "+MathSymbol.UNIONE+ " B\nD = A "+MathSymbol.INTERSEZIONE+" B.");
		lista3.add("Esercizio 2:\n\nConsidera i due insiemi A={0, 2, 4, 6} B={2, 3, 4, 5, 6}.\n\nTrova:\nC = A "+MathSymbol.UNIONE+ " B\nD = A "+MathSymbol.INTERSEZIONE+" B.");
		lista3.add("Esercizio 3:\n\nConsidera i due insiemi A={0, 10, 20, 30} B={5}.\n\nTrova:\nC = A "+MathSymbol.UNIONE+ " B\nD = A "+MathSymbol.INTERSEZIONE+" B.");
		lista3.add("Esercizio 4:\n\nConsidera i due insiemi A={x|x è un numero pari} B={2, 6, 10}.\n\nTrova:\nC = A "+MathSymbol.UNIONE+ " B\nD = A "+MathSymbol.INTERSEZIONE+" B.");
		lista3.add("Esercizio 5:\n\nConsidera i due insiemi A={11, 22, 33, 44} B={5, 10, 15}.\n\nTrova:\nC = A "+MathSymbol.UNIONE+ " B\nD = A "+MathSymbol.INTERSEZIONE+" B.");
		lista3.add("Esercizio 6:\n\nConsidera i due insiemi A={x|x è un numero pari} B={x|x è un numero naturale minore di 4}.\n\nTrova:\nC = A "+MathSymbol.UNIONE+ " B\nD = A "+MathSymbol.INTERSEZIONE+" B.");
		lista3.add("Esercizio 7:\n\nConsidera i due insiemi A={x|x è un multiplo di 2} B={x|x è un multiplo di 3}.\n\nTrova:\nC = A "+MathSymbol.UNIONE+ " B\nD = A "+MathSymbol.INTERSEZIONE+" B.");
		
		// intersezione e unione
		List<String> lista4 = new ArrayList<String>();		
		lista4.add("Compito 1:\n\nGuarda la tua stanza: libreria, cassetti, armadio. Ognuno di questi spazi fa da contenitore a una serie di insiemi. Scrivi gli insiemi che 'vedi' nella tua stanza.\nCerca di capire se ci sono rappresentazioni più convenienti rispetto ad altre.\nCerca di capire se alcuni insiemi che hai rappresentato risultano essere intersezione o unione di altri due.");
		lista4.add("Compito 2:\n\nFate un sondaggio in classe: quali sport ognuno di voi ha praticato? Create una tabella in cui per ogni riga segnate un nominativo e i relativi sport praticati: ognuno di voi rappresenta un insieme, mentre gli sport risultano essere gli elementi.\nUna volta fatto questo, cercate di fare un'intersezione tra più insiemi possibili: cosa rappresenta? Cosa scoprirete facendo ciò?\nInfine cercate di scoprire se ci sono persone che non hanno svolto gli stessi sport: come fare a esprimere questo con i concetti matematici studiati?");
		
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(0), lista0); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(1), lista1); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(2), lista2); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(3), lista3); // Header, Child data
		getHashMapPassaggiEsercizi().put(getListaEsercizi().get(4), lista4); // Header, Child data
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
