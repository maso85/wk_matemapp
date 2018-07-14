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
public class InsiemiCap3 extends Argomento {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Insiemi", "Capitolo 3: i sottoinsiemi");
	
		inserisciTesto("Proseguiamo con un nuovo esempio:");
		inserisciTesto("Considera A come l'insieme dei tuoi compagni di classe e B come l'insieme dei tuoi compagni di classe che sono figli unici.");
		inserisciTesto("Esiste una qualche relazione tra i due insiemi? Sì: ogni elemento dell'insieme B appartiene sicuramente all'insieme A (ma non viceversa!)");
		inserisciTestoConParteInGrassetto("In tal caso si dice che B è sottoinsieme di A", 24, 45);
		HashMap<Integer, Integer> mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(40, 52);
		mappaPartiInGrassetto.put(115, 122);
		inserisciDefinizione("Dati due insiemi A e B, si dice che B è sottoinsieme di A se ogni elemento di B appartiene anche ad A.\n\n In simboli: B \u2282 A", mappaPartiInGrassetto);
		inserisciTesto("Giusto per prendere pratica, due esempi: l'insieme delle vocali è contenuto nell'insieme delle lettere dell'alfabeto; l'insieme degli squali è contenuto nell'insieme dei pesci.");
		inserisciStacco();
		inserisciTesto("Facciamo giusto una precisazione: prendiamo l'insieme delle note musicali. Possiamo dire che l'insieme vuoto è contenuto nell'insieme delle note musicali? Inoltre, possiamo dire che l'insieme delle note musicali è contenuto nell'insieme delle note musicali (cioè contenuto in se stesso)?");
		inserisciTesto("La risposta è sì ad entrambe le domande. Ma sono due casi limite, che dobbiamo puntualizzare.");
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(21, 43);
		mappaPartiInGrassetto.put(122, 142);
		inserisciDefinizione("Un insieme B si dice sottoinsieme improprio di A se B è l'insieme vuoto oppure se B coincide con A.\n\nUn insieme D si dice sottoinsieme proprio di C se ogni elemento di D appartiene anche a C e se esiste almeno un elemento di C che non appartiene a D.", mappaPartiInGrassetto);
		inserisciTesto("Ad esempio: l'insieme V delle vocali è un sottoinsieme proprio dell'insieme L delle lettere dell'alfabeto: infatti ogni elemento di V appartiene a L, ma esiste almeno un elemento (pensa a una qualunque consonante) di L che non appartiene a V. L'insieme fatto dalle tue braccia e le tue gambe è un sottoinsieme improprio dell'insieme dei tuoi arti: infatti i due insiemi coincidono.");		
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato la definizione di sottoinsieme\n\n"
				+ "- hai imparato la differenza tra sottoinsieme proprio e improprio");
		return getAndroidView();
	}
}
