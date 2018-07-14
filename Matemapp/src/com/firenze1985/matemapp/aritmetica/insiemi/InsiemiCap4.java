/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.insiemi;

import java.util.HashMap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.firenze1985.matemapp.Argomento;
/**
 * @author Administrator
 *
 */
public class InsiemiCap4 extends Argomento {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Insiemi", "Capitolo 4: operazioni tra insiemi");
	
		inserisciTesto("Siamo arrivati all'ultimo capitolo relativo agli insiemi.");
		inserisciTestoConParteInGrassetto("Abbiamo capito cosa sono, abbiamo imparato a rappresentarli: adesso impareremo a eseguire operazioni tra loro", 90, 100);
		inserisciTestoConParteInGrassetto("Ricorda che con operazione si intende mettere insieme due oggetti e ricavarne un terzo. Così come siamo abituati a farle tra i numeri, è possibile farne anche tra insiemi? Certo. Vediamo di quali operazioni stiamo parlando.", 38, 87);
		inserisciStacco();
		inserisciTesto("Prendiamo due insiemi:\nA={1, 2, 3, 4, 5}\nB={2, 4, 6, 8, 10}");
		inserisciTesto("Ci accorgiamo che questi due insiemi hanno alcuni elementi in comune. Definiamo allora l'insieme C come l'insieme degli elementi in comune, ovvero:\nC={2, 4}");
		inserisciTestoConParteInGrassetto("Abbiamo eseguito un'operazione tra due insiemi, chiamata intersezione.", 57, 69);
		HashMap<Integer, Integer> mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(39, 51);
		mappaPartiInGrassetto.put(88, 93);
		mappaPartiInGrassetto.put(124, 140);
		mappaPartiInGrassetto.put(155, 164);
		inserisciDefinizione("Dati due insiemi A e B, si definisce C intersezione tra A e B come l'insieme formato da tutti gli elementi che appartengono sia ad A che a B.\n\nIn simboli: C = A \u2229 B", mappaPartiInGrassetto);
		
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato la definizione di sottoinsieme\n\n"
				+ "- hai imparato la differenza tra sottoinsieme proprio e improprio");
		return getAndroidView();
	}
}
