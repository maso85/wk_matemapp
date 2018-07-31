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
        TextView text = new TextView(getContext());
        
		ModificaTesto.inserisciTesto(getLinear(), new TextView(getContext()), "Abbiamo già trovato questa parola: operazione. Ci siamo dati già una definizione, o meglio ci siamo affidati ai tuoi ricordi. Diamo una definizione rigororsa su ciò che intendiamo per operazione tra due numeri:");
        String testo1 = "Una operazione tra due numeri è un procedimento che associa due numeri in un certo ordine, chiamati termini, a un terzo numero chiamato risultato.";
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("operazione", Typeface.BOLD);
        hashmap.put("procedimento", Typeface.BOLD);
        hashmap.put("termini", Typeface.BOLD);
        hashmap.put("risultato", Typeface.BOLD);
        hashmap.put("in un certo ordine", Typeface.ITALIC);
        //inserisciDefinizioneNuovoModo(testo1, hashmap);
        ModificaTesto.inserisciDefinizioneNuovoModo(getLinear(), new TextView(getContext()), getContext(), testo1, hashmap);

        
       
        return getAndroidView();
	}
}
