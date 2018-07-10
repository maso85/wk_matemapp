/**
 * 
 */
package com.firenze1985.matemapp;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Administrator
 *
 */
public class Argomento extends Fragment {
	
	TextView textView;
	
	/**
	 * @return the textView
	 */
	public TextView getTextView() {
		return textView;
	}
	/**
	 * @param textView the textView to set
	 */
	public void setTextView(TextView textView) {
		this.textView = textView;
	}
	
	
	private void inizializzaTextView() {
		setTextView(new TextView(getContext()));
	}
	/**
	 * funzione che inserisce un nuovo testo. La grandezza del testo è di default a 14DP
	 * @param linear
	 * @param testo
	 */
	protected void inserisciTesto(LinearLayout linear, String testo) {
		inizializzaTextView();
        textView.setText(testo);
        linear.addView(textView);
	}
	
	/**
	 * funzione che inserisce un nuovo testo, completamente in grassetto. La grandezza del testo è di default a 14DP
	 * @param linear
	 * @param testo
	 */
	protected void inserisciTestoInGrassetto(LinearLayout linear, String testo) {
		inizializzaTextView();
        textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
        linear.addView(textView);
	}
	
	/**
	 * funzione che inserisce un testo con una parte in grassetto, specificando l'inizio (compreso) e la fine (esclusa).
	 * La grandezza del testo è di default a 14DP
	 * @param linear
	 * @param testo
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 */
	protected void inserisciTestoConParteInGrassetto(LinearLayout linear, String testo, int inizioBoldCompreso, int fineBoldEscluso) {
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), inizioBoldCompreso, fineBoldEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		inizializzaTextView();
		textView.setText(str);
        linear.addView(textView);

	}
	
	/**
	 * funzione che inserisce il titolo, di grandezza 25DP di default
	 * @param linear
	 * @param testo
	 */
	protected void inserisciTitolo(LinearLayout linear, String testo) {
		inizializzaTextView();
		textView.setText(testo);
		textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
		linear.addView(textView);
	}
	
	/**
	 * funzione che inserisce un nuovo testo con la possibilita di modificare la grandezza. Tramite il parametro <i>isBold</i> possiamo
	 * mettere in grassetto l'intero testo
	 * @param linear
	 * @param testo
	 * @param tipoGrandezza
	 * @param grandezza
	 * @param isBold
	 */
	protected void inserisciTestoGrandezzaPersonalizzata(LinearLayout linear, String testo,int tipoGrandezza, float grandezza, boolean isBold) {
		inizializzaTextView();
		textView.setText(testo);
		textView.setTextSize(tipoGrandezza,grandezza);
		// se isBold e' true, allora rendiamo in grassetto l'intero testo
		if (isBold) {
	        textView.setTypeface(null, Typeface.BOLD);
		}
		linear.addView(textView);		
	}
	
	/**
	 * funzione che inserisce il titolo di un paragrafo, aggiungendo un padding top personalizzato in px
	 * @param linear
	 * @param testo
	 */
	protected void inserisciTitoloParagrafo(LinearLayout linear, String testo, int paddingTop){
		inizializzaTextView();
		textView.setPadding(0, paddingTop, 0, 0);
		textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
		linear.addView(textView);		
	}
	
	/**
	 * funzione che inserisce il titolo di un paragrafo, aggiungendo un padding top di default a 15px
	 * @param linear
	 * @param testo
	 */
	protected void inserisciTitoloParagrafo(LinearLayout linear, String testo) {
		inserisciTitoloParagrafo(linear, testo, 15);
	}
	
	/**
	 * inserisce uno stacco, impostato di default a 4px
	 * @param linear
	 */
	protected void inserisciStacco(LinearLayout linear) {
		inizializzaTextView();
		textView.setPadding(0, 4, 0, 0);
		linear.addView(textView);
	}
	
	/**
	 * funzione che inserisce un testo completamente personalizzabile: bold, corsivo, sottolineato. Possibilità di 
	 * usare una o più di queste funzioni sia completamente che parzialmente.
	 * @param linear
	 * @param testo
	 * @param isBold
	 * @param isTotalBold
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 * @param isCorsivo
	 * @param isTotalCorsivo
	 * @param inizioCorsivoCompreso
	 * @param fineCorsivoEscluso
	 * @param isSottolineato
	 * @param isTotalSottolineato
	 * @param inizioSottolineatoCompreso
	 * @param fineSottolineatoCompreso
	 */
	protected void inserisciTestoPersonalizzato(LinearLayout linear, String testo, 
			boolean isBold, boolean isTotalBold, int inizioBoldCompreso, int fineBoldEscluso, 
			boolean isCorsivo, boolean isTotalCorsivo, int inizioCorsivoCompreso, int fineCorsivoEscluso, 
			boolean isSottolineato, boolean isTotalSottolineato, int inizioSottolineatoCompreso, int fineSottolineatoCompreso ) {
		inizializzaTextView();
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		// gestione isBold
		if (isBold) {
			if (isTotalBold) {
		        textView.setTypeface(null, Typeface.BOLD);
			} else {
				str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), inizioBoldCompreso, fineBoldEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);				
			}
		}
		
		// gestione isCorsivo
		if (isCorsivo) {
			if (isTotalCorsivo) {
				textView.setTypeface(null, Typeface.ITALIC);
			} else {
				str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.ITALIC), inizioCorsivoCompreso, fineCorsivoEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);				
			}
		}
		
		// gestione isSottolineato
		if (isSottolineato) {
			if (isTotalSottolineato) {
				textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);		
			} else {
				str.setSpan(new UnderlineSpan(), inizioSottolineatoCompreso, fineSottolineatoCompreso, 0);
			}
		}
		
		// inserimento testo in view e in linear
		textView.setText(str);
        linear.addView(textView);
	}
	/**
	 * funzione che inserisce un nuovo testo, completamente in grassetto. La grandezza del testo è di default a 14DP
	 * @param linear
	 * @param testo
	 */
	protected void inserisciTestoInCorsivo(LinearLayout linear, String testo) {
		inizializzaTextView();
        textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
        linear.addView(textView);
	}
	
	/**
	 * funzione che inserisce un testo con una parte in grassetto, specificando l'inizio (compreso) e la fine (esclusa).
	 * La grandezza del testo è di default a 14DP
	 * @param linear
	 * @param testo
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 */
	protected void inserisciTestoConParteInCorsivo(LinearLayout linear, String testo, int inizioBoldCompreso, int fineBoldEscluso) {
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), inizioBoldCompreso, fineBoldEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		inizializzaTextView();
		textView.setText(str);
        linear.addView(textView);

	}
	
}
