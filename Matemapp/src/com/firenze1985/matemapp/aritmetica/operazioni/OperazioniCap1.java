/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.operazioni;

import java.util.HashMap;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firenze1985.matemapp.Capitolo;
import com.firenze1985.matemapp.ModificaTesto;

/**
 * @author Administrator
 *
 */
public class OperazioniCap1 extends Capitolo {

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Operazione", "Capitolo 1: cosa è una operazione");
		//
		ModificaTesto.inserisciTesto(getLinear(), new TextView(getContext()), "Abbiamo già trovato questa parola: operazione. Ci siamo dati già una definizione, o meglio ci siamo affidati ai tuoi ricordi. Diamo una definizione rigororsa su ciò che intendiamo per operazione tra due numeri:");
        //
		String testo1 = "Una operazione tra due numeri è un procedimento che associa due numeri posti in un certo ordine, chiamati termini, a un terzo numero chiamato risultato.";
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("operazione", Typeface.BOLD);
        hashmap.put("procedimento", Typeface.BOLD);
        hashmap.put("termini", Typeface.BOLD);
        hashmap.put("risultato", Typeface.BOLD);
        hashmap.put("in un certo ordine", Typeface.ITALIC);
        ModificaTesto.inserisciDefinizioneNuovoModo(getLinear(), new TextView(getContext()), getContext(), testo1, hashmap);
        //
        testo1 = "Abbiamo visto già con gli insiemi che non esistono soltanto le operazioni già affrontate alle elementari: ne esistono tante altre. Così come potremmo inventarne noi una nuova.";
		ModificaTesto.inserisciTesto(getLinear(), new TextView(getContext()), testo1);
		//
		testo1 = "Proviamo davvero, inventiamo un'operazione: l'operazione creanumero. Funziona così: prendiamo due numeri, li affianchiamo e li invertiamo rispetto a come li avevamo in partenza.\nDiamo anche un simbolo a questa nuova operazione, ad esempio &.\n\nFacciamo quindi alcuni esempi:\n13 & 67 = 6713\n88 & 24 = 2488\n19 & 80 = 8019";
		hashmap = new HashMap<String, Integer>();
        hashmap.put("creanumero", Typeface.ITALIC);
        hashmap.put("&", Typeface.BOLD);
        hashmap.put("13 & 67", Typeface.NORMAL);
        hashmap.put("88 & 24", Typeface.NORMAL);
        hashmap.put("19 & 80", Typeface.NORMAL);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
		ModificaTesto.inserisciStacco(getLinear(), new TextView(getContext()));
        //
        testo1 = "Come puoi ben capire, il termine operazione significa semplicemente prendi due elementi, trasformali con una regola ben precisa e ottieni un terzo elemento. Non è nostro compito, per il momento, inventare nuove operazioni: ci limiteremo ad affinare quelle operazioni matematiche già viste.";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("prendi due elementi, trasformali con una regola ben precisa e ottieni un terzo elemento", Typeface.ITALIC);
        hashmap.put("regola precisa", Typeface.BOLD);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
		ModificaTesto.inserisciStacco(getLinear(), new TextView(getContext()));
		//
		testo1 = "- hai imparato cosa significa fare una operazione\n\n- hai imparato come creare una nuova operazione";
		ModificaTesto.inserisciTestoConRiquadroConclusivo(getLinear(), new TextView(getContext()), getContext(), testo1);
		return getAndroidView();
	}
}
