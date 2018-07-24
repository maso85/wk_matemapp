/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.frazioni;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Capitolo;

/**
 * @author Administrator
 *
 */
public class FrazioniCap1 extends Capitolo {
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Le frazioni", "Capitolo 1");
		
        inserisciTestoConParteInGrassetto("\u00C8 possibile che, durante alcune lezioni di matematica, tu abbia già sentito parlare di questa parola strana: frazioni",109, 117);
        inserisciTesto("Ma che cosa è una frazione?");
        inserisciTesto("Tieni bene a mente questa frase:");
        String testoPersonalizzato = "una frazione è un modo alternativo di scrivere un numero decimale, ossia un numero con la virgola";
        inserisciTestoPersonalizzato(testoPersonalizzato, true, true, 0, 0, true, false, 83, testoPersonalizzato.length(), false, false, 0, 0);
        inserisciStacco();
        testoPersonalizzato = "Esatto. Proprio così. Una frazione non è altro che un numero ma scritto in una lingua differente.";
        inserisciTestoPersonalizzato(testoPersonalizzato, false, false, 0, 0, true, false, 81, 87, false, false, 0, 0);
        inserisciTestoGrandezzaPersonalizzata("vediamo che combina grandezza a 14", TypedValue.COMPLEX_UNIT_DIP, 14, false);
        inserisciTestoConParteInGrassetto("Supercalifragilistichespiralidoso", 4, 5);
        inserisciStacco();
        inserisciTestoGrandezzaPersonalizzata("vediamo che combina grandezza a 12", TypedValue.COMPLEX_UNIT_DIP, 12, false);
        inserisciTestoGrandezzaPersonalizzata("vediamo che combina grandezza a 13", TypedValue.COMPLEX_UNIT_DIP, 13, false);
        inserisciTestoGrandezzaPersonalizzata("vediamo che combina grandezza a 14", TypedValue.COMPLEX_UNIT_DIP, 14, false);
        inserisciTestoGrandezzaPersonalizzata("vediamo che combina grandezza a 15", TypedValue.COMPLEX_UNIT_DIP, 15, false);
        inserisciTestoGrandezzaPersonalizzata("vediamo che combina grandezza a 17", TypedValue.COMPLEX_UNIT_DIP, 17, true);
        return getAndroidView();
	}

}