/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.frazioni;

import com.firenze1985.matemapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author Administrator
 *
 */
public class FrazioniCap6 extends Fragment {
	
	String testoDaLeggere = "Sesta e ultima pagina";
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View android = inflater.inflate(R.layout.argomento_layout, container, false);
        ((TextView)android.findViewById(R.id.idTestoFragment)).setText(testoDaLeggere);
        return android;
	}
	
	public FrazioniCap6() {
	}
	
	public FrazioniCap6(String stringaPassata) {
		new FrazioniCap6();
		//testoDaLeggere = stringaPassata;
	}
}
