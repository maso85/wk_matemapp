/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.frazioni;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Argomento;

/**
 * @author Administrator
 *
 */
public class FrazioniCap2 extends Argomento {
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Le frazioni", "Capitolo 2");

		inserisciTesto("secondo capitolo dell'argomento frazioni");
       
        return getAndroidView();
	}
	
}
