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
public class NumNaturaliCap3 extends Capitolo {

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Numeri Naturali", "Capitolo 3: la retta dei numeri");
			
			String testo1 = "Dopo aver parlato dell'insieme dei numeri naturali e aver compreso il sistema posizionale, torniamo a concentrarci sul primo concetto: un insieme, come abbiamo visto, lo possiamo rappresentare per elencazione, per caratteristica o tramite il diagramma di Eulero-Venn.\nPer quanto riguarda i numeri naturali conviene utilizzare anche un'ulteriore rappresentazione: la semiretta orientata.";
			HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
			hashmap.put("conviene", Typeface.BOLD);
			hashmap.put("semiretta orientata", Typeface.BOLD);
			inserisciTestoPersonalizzato(testo1, hashmap);
			//
			testo1 = "Intanto, cos'è una semiretta?"+MathSymbol.E_MAIUSCOLO_ACCENTATA+" una retta che ha un inizio ma non ha una fine. Giusto per completezza, una retta è una linea dritta che non ha nè un inizio nè una fine.\nLa parola orientata significa che la nostra semiretta ha una precisa orientazione: più si va verso destra e più i numeri crescono. Il successivo di un numero n pertanto lo troveremo alla sua destra; il suo precedente, invece, alla sua sinistra.";
			hashmap = new HashMap<String,Integer>();
			hashmap.put("semiretta", Typeface.BOLD);
			hashmap.put("orientata", Typeface.BOLD);
			hashmap.put("successivo", Typeface.ITALIC);
			hashmap.put("precedente", Typeface.ITALIC);
			inserisciTestoPersonalizzato(testo1, hashmap);
			//
			testo1 = "Abbiamo detto che la nostra semiretta ha un inizio: questo inizio coincide con lo 0, ossia con il più piccolo numero naturale. Per indicare, poi, che i numeri si estendono in maniera infinita verso destra, inseriamo nell'estremo destro della semiretta una freccia orientata. Ecco perchè appunto si dice orientata.";
			hashmap = new HashMap<String,Integer>();
			hashmap.put("freccia orientata", Typeface.ITALIC);
			inserisciTestoPersonalizzato(testo1, hashmap);
			//
			inserisciTesto("Se hai seguito bene le nostre indicazioni, il disegno che trovi qui sotto dovrebbe esserti estremamente chiaro:");
			inserisciStacco();
			inserisciImmagine(R.drawable.retta_orientata_num_naturali);
			inserisciStacco();
			//
			testo1 = "Questa semiretta teniamola bene a mente perchè potrà aiutarci quando parleremo di operazioni tra i numeri naturali, specie nelle fasi iniziali.";
			hashmap = new HashMap<String,Integer>();
			hashmap.put("operazioni tra i numeri naturali", Typeface.BOLD);
			inserisciTestoPersonalizzato(testo1, hashmap);
			//
			inserisciStacco();
			inserisciTestoConRiquadroConclusivo("- hai imparato a rappresentare i numeri sulla semiretta orientata");
			return getAndroidView();
		}
}
