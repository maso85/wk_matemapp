/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.somma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Capitolo;

/**
 * @author Administrator
 *
 */
public class SommaCap1 extends Capitolo {

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Somma", "Capitolo 1");
        
        inserisciTesto("sono nel capitolo della somma");
        inserisciTesto("e quindi vedo un capitolo diverso");
       
        return getAndroidView();
	}
	
	public SommaCap1() {
	}
	
	public SommaCap1(String stringaPassata) {
		new SommaCap1();
		//testoDaLeggere = stringaPassata;
	}

}
