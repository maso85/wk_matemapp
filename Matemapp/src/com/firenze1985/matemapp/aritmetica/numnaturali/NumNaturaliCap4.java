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

import com.firenze1985.matemapp.Capitolo;
import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.utility.MathSymbol;

/**
 * @author Administrator
 *
 */
public class NumNaturaliCap4 extends Capitolo {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Numeri Naturali", "Capitolo 4: oltre i numeri naturali");
		
		String testo1 = "Chiudiamo con un argomento che, per il momento, vogliamo solo accennare ma che affronteremo con maggior cura in futuro. Riprendiamo in mano la semiretta orientata vista nel capitolo precedente:";
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		inserisciTestoPersonalizzato(testo1, hashmap);
		inserisciStacco();
		//
		inserisciImmagine(R.drawable.retta_orientata_num_naturali_5);
		inserisciStacco();
		//
		testo1 = "Dunque: una delle qualità di un buon matematico è la curiosità. Non fermarsi a ciò che vede ma cercare di andare oltre.";
		hashmap = new HashMap<String,Integer>();
		hashmap.put("curiosità", Typeface.ITALIC);
		hashmap.put("oltre", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, hashmap);
		//
		inserisciTesto("Potremmo farci due domande:");
		testo1 = "1) cosa c'è a sinistra dello 0 ?\n2) cosa c'è tra un numero naturale e il suo successivo?";
		hashmap = new HashMap<String,Integer>();
		hashmap.put("sinistra", Typeface.ITALIC);
		inserisciDefinizioneNuovoModo(testo1, hashmap);
		//
		testo1 = "A queste due domande, probabilmente, alcuni sanno già rispondere. Ma non è una gara. Dobbiamo arrivarci tutti, ma sopratutto dobbiamo capire tutti";
		hashmap = new HashMap<String,Integer>();
		hashmap.put("capire", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, hashmap);
		//
		testo1 = "Per ora ci basta sapere questo: sia a sinistra dello 0 che tra un numero naturale e il suo successivo sono presenti dei numeri. Sono altri numeri. Numeri che non sono naturali. Che appartengono, pertanto, a insiemi più grandi che conterranno sia i naturali che loro. Saranno degli insiemi chiave, perchè nella prossima unità ci troveremo a un certo punto ad affrontare alcune situazioni nelle quali dovremo fermarci e riflettere: lì dovremo fare un passo importante e cominciare a diventare matematici.";
		hashmap = new HashMap<String,Integer>();
		hashmap.put("sinistra dello 0", Typeface.ITALIC);
		hashmap.put("tra un numero naturale e il suo successivo", Typeface.ITALIC);
		hashmap.put("altri", Typeface.ITALIC);
		hashmap.put("non sono naturali", Typeface.ITALIC);
		hashmap.put("loro", Typeface.ITALIC);
		hashmap.put("chiave", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, hashmap);
		//
		inserisciStacco();
		inserisciTestoColoratoInGrassetto("Siamo arrivati alla fine di questa unità: prosegui alla pagina successiva per svolgere gli esercizi!", "#009900");
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai capito che per essere un buon matematico devi avere una buona dose di curiosità\n\n- hai intuito che i numeri naturali non sono gli unici numeri");
		return getAndroidView();
	}
}
