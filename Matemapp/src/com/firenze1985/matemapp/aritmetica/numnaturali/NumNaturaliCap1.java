/**
 * 
 */
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
public class NumNaturaliCap1 extends Argomento {

	/* (non-Javadoc)
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Numeri Naturali", "Capitolo 1: l'insieme dei numeri naturali");
		inserisciTesto("Addentriamoci in questo nuovo argomento partendo dal precedente.");
		String testo1 = "Abbiamo appena affrontato l'argomento insiemi: un insieme è un raggruppamento di oggetti che hanno determinate caratteristiche in comune";
		HashMap<String, Integer> mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("insiemi", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciStacco();
		inserisciTesto("");
		testo1 = "Fin dai tempi antichi l'uomo ha avuto bisogno di raggruppare e organizzare. A partire da questo ragionamento, si è cercato di applicare questi concetti ai numeri.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("numeri", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciStacco();
		inserisciTesto("Prova a rispondere: cosa è un numero?");
		inserisciStacco();
		inserisciTesto("Non è per niente facile rispondere: sappiamo rappresentarli, abbiamo a che fare con loro tutti i giorni...ma non sappiamo dire cosa sono!");
		inserisciTesto("Chi prima di noi ha studiato questi argomenti, si è posto le stesse domande ed è riuscito a trovare una strategia per rispondere:");
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("numero naturale", Typeface.BOLD);
		mappaParolaModifica.put("insieme dei numeri naturali", Typeface.BOLD);
		mappaParolaModifica.put("successivo", Typeface.BOLD);
		mappaParolaModifica.put("precedente", Typeface.BOLD);
		mappaParolaModifica.put("più piccolo", Typeface.BOLD);
		inserisciDefinizioneNuovoModo("Un numero naturale è un elemento di un insieme chiamato appunto insieme dei numeri naturali. Questi elementi hanno le seguenti caratteristiche:\n- ogni numero naturale ha un suo successivo\n\n- ogni numero naturale (tranne lo 0) ha un suo precedente\n- lo 0 è il più piccolo elemento dell'insieme dei numeri naturali", mappaParolaModifica);
		inserisciStacco();
		inserisciTesto("Ribadiamo quindi: un numero naturale non è nient'altro che un elemento di un insieme, che ha quelle caratteristiche descritte sopra.");
		testo1 = "Piano piano (ma non adesso, non mettiamo troppa carne al fuoco!) vedremo che questo insieme non ci basterà, sarà troppo piccolo per alcune nostre esigenze: dovremo piano piano ingrandirlo. Per adesso non badare molto a questa frase ma...tienila a mente!";	
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("basterà", Typeface.ITALIC);
		mappaParolaModifica.put("ingrandirlo", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciStacco();
		inserisciTesto("Proviamo ad applicare quanto appreso in precedenza ai concetti di adesso. Come possiamo rappresentare l'insieme dei numeri naturali?");
		inserisciTesto("Innanzitutto, dobbiamo dare una lettera maiuscola: N.");
		inserisciTesto("Per quanto riguarda la rappresentazione, pensiamo a questo: quale sarà la cardinalità di N?");
		inserisciTesto("Dato che ogni numero ha un suo successivo: 1 ha come successivo 2, che ha come successivo 3, che ha come successivo 4...non finiamo mai: cardinalità infinita");
		inserisciTesto("Se ben ricordi, allora, in questo caso è preferibile usare la rappresentazione per caratteristica");
		HashMap<Integer, Integer> mappaInizioFine = new HashMap<Integer, Integer>();
		mappaInizioFine.put(9, 9);
		inserisciDefinizione("N={x|x è un numero naturale", mappaInizioFine);
		inserisciTesto("Nessuno ci vieta di rappresentare il nostro insieme per elencazione:");
		inserisciDefinizione("N={0, 1, 2, 3, 4, 5, 6....}", mappaInizioFine);
		inserisciTesto("Dobbiamo solo usare l'accorgimento dei 3 puntini di sospensione, per indicare che si prosegue all'infinito");
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato la definizione di numero\n\n- hai imparato cosa è l'insieme N dei numeri naturali\n\n- hai imparato a rappresentare l'insieme N");
		return getAndroidView();

	}
}
