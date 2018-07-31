package com.firenze1985.matemapp.aritmetica.numnaturali;

import java.util.HashMap;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Capitolo;
import com.firenze1985.matemapp.utility.MathSymbol;

/**
 * @author Administrator
 *
 */
public class NumNaturaliCap2 extends Capitolo {

	
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
		testo1 = "Innanzitutto, tutti i numeri sono formati da cifre. Cos'� una cifra?";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("cifre", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		testo1 = "Una cifra � un elemento del seguente insieme:\n\nC={0, 1, 2, 3, 4, 5, 6, 7, 8, 9}";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("cifra", Typeface.BOLD);
		inserisciDefinizioneNuovoModo(testo1, mappaParolaModifica);
		inserisciTesto("Una cifra quindi � uno di quei dieci elementi. Uno di quei simboli.");
		inserisciTesto("Se tali cifre, tali simboli, li mettiamo uno di fianco all'altro che succede? Come si legge l'elemento creato?");
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
		mappaParolaModifica.put("chiave", Typeface.BOLD);
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
		inserisciTesto("A cosa ci serve tutto questo? Vediamo.");
		//
		//
		testo1 = "Quando alle elementari hai imparato l'alfabeto, per caso hai imparato prima la F, poi la N, poi la Z, poi la C, poi la A ? Certo che no. vi siete dati un ordine. Ecco, lo stesso ragionameto vale anche per i numeri naturali. Cos� come l'insieme delle lettere, anche l'insieme dei numeri naturali � ordinato.";	
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("ordine", Typeface.ITALIC);
		mappaParolaModifica.put("ordinato", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		inserisciTesto("Possiamo pertanto affermare quanto segue:");
		//
		testo1 = "Nell'insieme dei numeri naturali ogni elemento (tranne lo 0) � minore del suo successivo e maggiore del suo precedente.";	
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("minore", Typeface.ITALIC);
		mappaParolaModifica.put("maggiore", Typeface.ITALIC);
		inserisciDefinizioneNuovoModo(testo1, mappaParolaModifica);
		//
		inserisciTesto("Possiamo adesso confrontare due numeri. Quanti casi possibili ci sono? Che il primo sia pi� grande, che il secondo sia pi� grande, oppure che siano uguali. Che simboli utilizziamo?");
		//
		testo1 = "Per scrivere che 7 � maggiore di 4 scriveremo\n7 \u003E 4.\nPer scrivere che 6 � minore di 14 scriveremo\n6 \u003C 14.\nPer scrivere che 5 � uguale a 5 scriveremo\n5 = 5.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("7 � maggiore di 4", Typeface.ITALIC);
		mappaParolaModifica.put("7 \u003E 4", Typeface.BOLD);
		mappaParolaModifica.put("6 � minore di 14", Typeface.ITALIC);
		mappaParolaModifica.put("6 \u003C 14", Typeface.BOLD);
		mappaParolaModifica.put("5 � uguale a 5", Typeface.ITALIC);
		mappaParolaModifica.put("5 = 5", Typeface.BOLD);
		inserisciDefinizioneNuovoModo(testo1, mappaParolaModifica);
		//
		testo1 = "Capito questo, possiamo ordinare i numeri naturali sia in ordine crescente ossia dal pi� piccolo al pi� grande, sia in ordine decrescente ossia dal pi� grande al pi� piccolo.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("ordine crescente", Typeface.BOLD);
		mappaParolaModifica.put("dal pi� piccolo al pi� grande", Typeface.ITALIC);
		mappaParolaModifica.put("ordine decrescente", Typeface.BOLD);
		mappaParolaModifica.put("dal pi� grande al pi� piccolo", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		inserisciTesto("Ad esempio, se abbiamo i numeri 14, 18, 6, 7, 21 e li vogliamo ordinare in ordine crescente otteniamo:\n\n6 7 14 18 21.\n\nSe invece vogliamo ordinarli in ordine decrescente allora otteniamo:\n\n21 18 14 7 6");		
		//
		testo1 = "Questo discorso sull'ordinamento lo avremmo potuto fare anche nella pagina precedente esatto? Forse.\nFintanto che si parla di numeri piccoli non � complicato. Ma quando i numeri sono grandi come facciamo a capire chi � pi� grande di chi?\n\nSupponiamo di dover confrontare 3.402 con 1.989; dobbiamo cercare di stabilire chi sia il pi� grande. Come si procede?\nLa prima cosa da confrontare sono le cifre nella posizione pi� elevata, in questo caso le unit� di migliaia. Il primo numero in tale posizione ha un 3, il secondo numero ha un 1: abbiamo gi� individuato chi sia il pi� grande tra i due, ovvero il primo numero.\nDobbiamo confrontare anche le altre cifre? No, e non � un consiglio: � un obbligo. Una volta individuato quale sia il pi� grande dobbiamo fermarci, altrimenti rischiamo di fare errori e portare solo confusione.\nProvate per curiosit� a proseguire: confrontiamo le centinaia di unit� adesso. Il primo numero ha 4 in quella posizione, il secondo numero ha 9. Che significa? Che siamo uno a uno? Non ha molto senso.\nImmaginiamola cos�: � una serie di calci di rigore in cui il primo che segna vince. Una volta che una squadra vince, non � che si prosegue. Qui � lo stesso discorso: partendo dalle cifre poste nella posizione pi� elevata, una volta che abbiamo stabilito quale dei due numeri sia il pi� grande ci dobbiamo fermare, perch� abbiamo raggiunto il nostro scopo.\nScriviamo quindi 3.402 "+MathSymbol.MAGGIORE_STRETTO+" 1.989";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("cifre nella posizione pi� elevata", Typeface.ITALIC);
		mappaParolaModifica.put("uno a uno", Typeface.ITALIC);
		mappaParolaModifica.put("il primo che segna vince", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		inserisciTesto("Se i numeri sono molto pi� grandi? Nessuna paura: il nostro metodo funziona con tutti i numeri. Ed � veloce, perch� appena trovi due cifre differenti nella stessa posizione sai gi� rispondere: chi segna per primo vince.");
		testo1 = "Prendi il numero 3.940.302.119 e il numero 3.987.102.166; Partendo dalle cifre nella posizione pi� elevata, devi confrontare 3 con 3. Niente da fare, le due cifre coincidono: dobbiamo proseguire. Confronta adesso le cifre alla seconda posizione pi� elevata: sono entrambi 9. Prosegui alla terza posizione: il primo numero ha un 4, il secondo un 8.\nBasta, ti puoi fermare, hai gi� concluso:\n3.940.302.119 "+MathSymbol.MINORE_STRETTO+" 3.987.102.166\n\nCome si leggono i numeri? Cosa rappresentano? Non sono domande utili ai fini del nostro scopo di adesso. Il nostro scopo di adesso � capire chi sia il pi� grande. Se poi rappresentano i conti in banca di due industriali o il numero di abitanti di due continenti, � rilevante?\nNo. Stai cominciando a diventare sempre pi� matematico: che siano soldi o abitanti o globuli rossi, la procedura per stabilire chi sia pi� grande � la stessa. Questo che hai fatto adesso si chiama modellizzare un problema.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("Non sono domande utili", Typeface.ITALIC);
		mappaParolaModifica.put("Il nostro scopo di adesso � capire chi sia il pi� grande", Typeface.BOLD);
		mappaParolaModifica.put("matematico", Typeface.ITALIC);
		mappaParolaModifica.put("modellizzare un problema", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		//
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato cosa � una cifra\n\n- hai imparato il sistema posizionale\n\n- hai imparato come rappresentare un numero\n\n- hai imparato le classi e gli ordini del nostro sistema posizionale\n\n- hai imparato i simboli di maggiore, minore, uguale\n\n- hai imparato a confrontare i numeri per stabilire chi sia il pi� grande\n\n- hai imparato a ordinare i numeri in ordine crescente o decrescente");
		return getAndroidView();

	}
}
