package com.firenze1985.matemapp.aritmetica.numnaturali;

import java.util.HashMap;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Argomento;

/**
 * @author Administrator
 *
 */
public class NumNaturaliCap2 extends Argomento {

	
	/* (non-Javadoc)
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Numeri Naturali", "Capitolo 2: le rappresentazioni dei numeri");
		//
		String testo1 = "Ti sei mai chiesto perch� si chiama insieme dei numeri naturali?";
		HashMap<String, Integer> mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("naturali", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciStacco();
		inserisciTesto("La risposta � abbastanza intuitiva: sono i numeri che si trovano in natura. Pi� precisamente, sono quei numeri che ci permettono di identificare le quantit�: 3 mele, 8 penne, 4 smartphone, 17 gol.");
		//
		testo1 = "Domanda successiva: chi ha deciso che uno si scrive 1, che cinque si scrive 5, che sedici si scrive 16, che centoventisei si scrive 126 ?";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("uno", Typeface.ITALIC);
		mappaParolaModifica.put("cinque", Typeface.ITALIC);
		mappaParolaModifica.put("sedici", Typeface.ITALIC);
		mappaParolaModifica.put("centoventisei", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		testo1 = "Siamo noi che siamo abituati a usare questo linguaggio. Queste regole. Questa rappresentazione. Ma abbiamo davvero capito cosa facciamo?";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("linguaggio", Typeface.ITALIC);
		mappaParolaModifica.put("regole", Typeface.ITALIC);
		mappaParolaModifica.put("rappresentazione", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciTesto("Facciamo una cosa: azzeriamo la nostra mente su questi concetti e ripartiamo da zero. Sperando di arrivare a capire meglio!");
		inserisciStacco();
		//
		testo1 = "Innanzitutto, tutti i numeri sono formati da cifre. Una cifra � un elemento del seguente insieme:\n\nC={0, 1, 2, 3, 4, 5, 6, 7, 8, 9}\n\nUna cifra quindi � uno di quei dieci elementi. Uno di quei simboli.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("cifre", Typeface.BOLD);
		mappaParolaModifica.put("cifra", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciTesto("Se queste cifre, questi simboli, li mettiamo uno di fianco all'altro che succede? Come si legge l'elemento creato?");
		inserisciTesto("Prendiamo la cifra 1 e la cifra 8. Se li affianchiamo otteniamo 18. Che noi sappiamo essere diciotto. Abbiamo creato un numero a due cifre.");
		inserisciTesto("Cambia se invertiamo l'ordine? Beh, otteniamo 81 che noi sappiamo essere ottantuno. Nettamente differente da diciotto. Cosa � cambiato pertanto da 18 a 81 ?");
		//
		testo1 = "Ci� che � cambiato � l'ordine delle cifre. Pi� tecnicamente diremo che � cambiata la posizione.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("ordine", Typeface.ITALIC);
		mappaParolaModifica.put("posizione", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);		
		//
		testo1 = "Abbiamo la parola chiave: il nostro modo di rappresentare i numeri si chiama infatti posizionale. Ossia, per rappresentare tutti i numeri possibili noi disponiamo di soli dieci simboli, ossia le cifre: mescolando assieme tali cifre e dando un senso alla posizione di ognuna di loro, riusciamo a scrivere tutti i numeri.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("posizionale", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciStacco();
		//
		testo1 = "Perci�, in base alla posizione assunta, una cifra cambia il suo significato.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("significato", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciStacco();
		inserisciTesto("Ma quante sono queste posizioni?Vediamo di scoprirlo.");
		inserisciTesto("0, 1, 2, ... fino a 9 sono le cifre che abbiamo a disposizione. Ma essi stessi rappresentano a tutti gli effetti dei numeri. Ricordati che i numeri sono rappresentati da una o pi� cifre. Pertanto questi sono i numeri rappresentati da una sola cifra.");
		//
		testo1 = "Per il resto, come proseguiamo? Il numero dieci come lo rappresentiamo?";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("dieci", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		testo1 = "Diamo un nome alle cose, intanto. I primi dieci numeri si dicono unit� del primo ordine. Inoltre il numero 1 viene chiamato unit� semplice.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("unit� del primo ordine", Typeface.BOLD);
		mappaParolaModifica.put("unit� semplice", Typeface.BOLD);		
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		testo1 = "Aggiungendo una unit� al numero 9 otteniamo il numero dieci che in simboli scriviamo con 10. Abbiamo dovuto cominciare a utilizzare due cifre. Ecco cosa abbiamo scoperto: dieci unit� semplici formano una decina di unit�; pi� semplicemente parleremo di decine.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("decina di unit�", Typeface.BOLD);
		mappaParolaModifica.put("decine", Typeface.BOLD);		
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		testo1 = "Una decina viene anche chiamata unit� del secondo ordine. Teniamo a mente questa definizione perch� ci aiuter�.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("unit� del secondo ordine", Typeface.BOLD);		
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		testo1 = "Proseguiamo allora: 10, 11, 12....97, 98, 99. Abbiamo concluso l'elenco dei numeri a 2 cifre, dobbiamo proseguire e usarne una terza. Ecco che quindi ragionando esattamente come prima possiamo dire che dieci decine formano un centinaio di unit�, pi� semplicemente parleremo di centinaia";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("centinaio di unit�", Typeface.BOLD);
		mappaParolaModifica.put("centinaia", Typeface.BOLD);		
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		testo1 = "Una centinaia viene chiamata anche unit� del terzo ordine.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("unit� del terzo ordine", Typeface.BOLD);		
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		testo1 = "Abbiamo concluso il primo raggruppamento di cifre, che chiameremo classe. Per adesso abbiamo descritto la prima classe, chiamata classe delle unit�";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("classe", Typeface.BOLD);
		mappaParolaModifica.put("prima classe", Typeface.NORMAL);
		mappaParolaModifica.put("classe delle unit�", Typeface.BOLD);
		//
		testo1 = "Come si prosegue? Presto detto: 10 centinaia formano una unit� di migliaia, chiamata anche unit� del quarto ordine.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("unit� di migliaia", Typeface.BOLD);		
		mappaParolaModifica.put("unit� del quarto ordine", Typeface.BOLD);		
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		testo1 = "10 unit� di migliaia formano una decina di migliaia, chiamata anche unit� del quinto ordine.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("unit� del quinto ordine", Typeface.BOLD);		
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//		
		testo1 = "Non proseguiamo oltre altrimenti non finiamo pi�! Ti basti sapere che la classe successiva si chiama milione, e quella dopo ancora si chiama miliardo.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("milione", Typeface.BOLD);		
		mappaParolaModifica.put("miliardo", Typeface.BOLD);
		mappaParolaModifica.put("classe", Typeface.ITALIC);		
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		inserisciTesto("Dopo questa lunga, ma doverosa, spiegazione sulla posizione delle cifre cerchiamo di applicare quanto imparato: proviamo a capire cosa rappresenta ogni cifra del numero 7845326");
		//7845326
		inserisciTesto("Intanto...pi� il numero � formato da tante cifre, pi� � facile confondersi. Ci siamo inventati allora un modo per cercare di non perdersi. Ogni 3 cifre inseriamo un punto. In modo tale da raggruppare i vari ordini di ogni classe. Riscriviamo quindi il numero 7845326 in maniera corretta, ovvero 7.845.326: molto pi� leggibile, non trovi?");
		inserisciTesto("");
		testo1 = "Questo numero pertanto � formato da 7 unit� di milione, 8 centinaia di migliaia, 4 decine di migliaia, 5 unit� di migliaia, 3 centinaia di unit�, 2 decine di unit� e 6 unit� semplici.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("unit� di milione", Typeface.ITALIC);
		mappaParolaModifica.put("centinaia di migliaia", Typeface.ITALIC);
		mappaParolaModifica.put("decine di migliaia", Typeface.ITALIC);
		mappaParolaModifica.put("unit� di migliaia", Typeface.ITALIC);
		mappaParolaModifica.put("centinaia di unit�", Typeface.ITALIC);
		mappaParolaModifica.put("decine di unit�", Typeface.ITALIC);
		mappaParolaModifica.put("unit� semplici", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//		
		testo1 = "Pi� andremo avanti e pi� snelliremo questa dicitura. Per adesso stiamo imparando e quindi � giusto e doveroso fare i precisini.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("snelliremo", Typeface.ITALIC);
		mappaParolaModifica.put("precisini", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//		
		
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato cosa � una cifra\n\n- hai imparato il sistema posizionale\n\n- hai imparato come rappresentare un numero\n\n- hai imparato le classi e gli ordini del nostro sistema posizionale");
		return getAndroidView();

	}
}
