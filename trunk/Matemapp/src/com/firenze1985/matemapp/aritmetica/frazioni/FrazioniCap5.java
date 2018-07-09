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
public class FrazioniCap5 extends Fragment {
	
	String testoDaLeggere = "Quinta!";
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View android = inflater.inflate(R.layout.argomento_layout, container, false);
        ((TextView)android.findViewById(R.id.idTestoFragment)).setText(testoDaLeggere);
        return android;
	}
	
	public FrazioniCap5() {
	}
	
	public FrazioniCap5(String stringaPassata) {
		new FrazioniCap5();
		//testoDaLeggere = stringaPassata;
	}
}
