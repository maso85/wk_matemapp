/**
 * 
 */
package com.firenze1985.matemapp;

import android.support.v4.app.Fragment;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Administrator
 *
 */
public class Argomento extends Fragment {
	
	/**
	 * funzione che inserisce un nuovo testo
	 * @param linear
	 * @param testo
	 */
	protected void inserisciTesto(LinearLayout linear, String testo) {
		TextView textView = new TextView(getContext());
        textView.setText(testo);
        linear.addView(textView);
	}
}
