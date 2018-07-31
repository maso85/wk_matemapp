/**
 * 
 */
package com.firenze1985.matemapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Administrator
 *
 */
public class ModificaTesto {
	static String BACKGROUND_DEFINIZIONE = "#e8fc74";

	/**
	 * Metodo che inserisce un nuovo testo. La grandezza del testo è di default a 14DP
	 * @param testo
	 */
	public static void inserisciTesto(LinearLayout linear, TextView textView, String testo) {
        textView.setText(testo);
        if (linear != null) {
        	linear.addView(textView);
        }
	}
	
	/**
	 * Metodo che inserisce un nuovo testo, completamente in grassetto. La grandezza del testo è di default a 14DP
	 * @param testo
	 */
	public static void inserisciTestoInGrassetto(LinearLayout linear, TextView textView, String testo) {
        textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
        if(linear != null){
        	linear.addView(textView);
        }
	}
	
	/**
	 * Metodo che inserisce un testo con una parte in grassetto, specificando l'inizio (compreso) e la fine (esclusa).
	 * La grandezza del testo è di default a 14DP
	 * @param testo
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 */
	public static void inserisciTestoConParteInGrassetto(LinearLayout linear, TextView textView, String testo, int inizioBoldCompreso, int fineBoldEscluso) {
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), inizioBoldCompreso, fineBoldEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		textView.setText(str);
        if (linear != null){
        	linear.addView(textView);
        }

	}
	
	/**
	 * Metodo che <b>prepara</b> il testo con una parte in grassetto. Da usare in caso di piu' parti in grassetto in un testo.
	 * @param testo
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 */
	private static void preparaTestoConParteInGrassetto(SpannableStringBuilder str, String testo, int inizioBoldCompreso, int fineBoldEscluso) {
		str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), inizioBoldCompreso, fineBoldEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);		
	}
	/**
	 * Metodo che inserisce il titolo, di grandezza 25DP di default
	 * @param testo
	 */
	public static void inserisciTitolo(LinearLayout linear, TextView textView, String testo) {
		textView.setText(testo);
		textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
		if(linear != null){
			linear.addView(textView);
		}
	}
	
	/**
	 * Metodo che inserisce un nuovo testo con la possibilita di modificare la grandezza. Tramite il parametro <i>isBold</i> possiamo
	 * mettere in grassetto l'intero testo
	 * @param testo
	 * @param tipoGrandezza
	 * @param grandezza
	 * @param isBold
	 */
	public static void inserisciTestoGrandezzaPersonalizzata(LinearLayout linear, TextView textView, String testo,int tipoGrandezza, float grandezza, boolean isBold) {
		textView.setText(testo);
		textView.setTextSize(tipoGrandezza,grandezza);
		// se isBold e' true, allora rendiamo in grassetto l'intero testo
		if (isBold) {
	        textView.setTypeface(null, Typeface.BOLD);
		}
		if (linear != null){
			linear.addView(textView);		
		}
	}
	
	/**
	 * Metodo che inserisce il titolo di un paragrafo, aggiungendo un padding top personalizzato in px
	 * @param testo
	 */
	public static void inserisciTitoloParagrafo(LinearLayout linear, TextView textView, String testo, int paddingTop){
		textView.setPadding(0, paddingTop, 0, 0);
		textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
		if (linear != null){
			linear.addView(textView);		
		}
	}
	
	/**
	 * Metodo che inserisce il titolo di un paragrafo, aggiungendo un padding top di default a 15px
	 * @param testo
	 */
	public static void inserisciTitoloParagrafo(LinearLayout linear, TextView textView, String testo) {
		inserisciTitoloParagrafo(linear, textView, testo, 15);
	}
	
	/**
	 * Metodo uno stacco, impostato di default a 4px
	 */
	public static void inserisciStacco(LinearLayout linear, TextView textView) {
		textView.setPadding(0, 4, 0, 0);
		if (linear != null){
			linear.addView(textView);
		}
	}
	
	/**
	 * Metodo che inserisce un testo completamente personalizzabile: bold, corsivo, sottolineato. Possibilità di 
	 * usare una o più di queste funzioni sia completamente che parzialmente.
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
	public static void inserisciTestoPersonalizzato(LinearLayout linear, TextView textView, String testo, 
			boolean isBold, boolean isTotalBold, int inizioBoldCompreso, int fineBoldEscluso, 
			boolean isCorsivo, boolean isTotalCorsivo, int inizioCorsivoCompreso, int fineCorsivoEscluso, 
			boolean isSottolineato, boolean isTotalSottolineato, int inizioSottolineatoCompreso, int fineSottolineatoCompreso ) {
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
        if (linear != null){
        	linear.addView(textView);
        }
	}
	
	/**
	 * Metodo che inserisce un nuovo testo, completamente in grassetto. La grandezza del testo è di default a 14DP
	 * @param testo
	 */
	public static void inserisciTestoInCorsivo(LinearLayout linear, TextView textView, String testo) {
        textView.setText(testo);
        textView.setTypeface(null, Typeface.ITALIC);
        if (linear != null){
        	linear.addView(textView);
        }
	}
	
	/**
	 * Metodo che inserisce un testo con una parte in grassetto, specificando l'inizio (compreso) e la fine (esclusa).
	 * La grandezza del testo è di default a 14DP
	 * @param testo
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 */
	public static void inserisciTestoConParteInCorsivo(LinearLayout linear, TextView textView, String testo, int inizioCorsivoCompreso, int fineCorsivoEscluso) {
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.ITALIC), inizioCorsivoCompreso, fineCorsivoEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		textView.setText(str);
        if (linear != null){
        	linear.addView(textView);
        }

	}
	/**
	 * Metodo che inserisce un testo colorato, passando in input il colore in formato #FF8877
	 * @param testo
	 * @param colore
	 */
	public static void inserisciTestoColorato(LinearLayout linear, TextView textView, String testo, String colore) {
		textView.setText(testo);
		textView.setTextColor(Color.parseColor(colore));
		if (linear != null){
			linear.addView(textView);
		}
	}
	
	/**
	 * Metodo che restituisce un testo in <i>formato definizione</i> ossia con un background colore differente.
	 * @param testo
	 */
	public static void inserisciDefinizione(LinearLayout linear, TextView textView, Context context, String testo, HashMap mappaPartiInGrassetto) {
		Iterator i = mappaPartiInGrassetto.entrySet().iterator();
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		while (i.hasNext()) {
	        Map.Entry mappa = (Map.Entry)i.next();
	        preparaTestoConParteInGrassetto(str, testo, ((Integer)mappa.getKey()).intValue(), ((Integer)mappa.getValue()).intValue());
		}
		//
		TextView textStacco = new TextView(context);
		inserisciStacco(linear,textStacco);
		//
		textView.setPadding(4, 0, 4, 0);    
		textView.setText(str);
		textView.setBackgroundColor(Color.parseColor(BACKGROUND_DEFINIZIONE));
		if (linear != null) {
			linear.addView(textView);
		}
		//
		textStacco = new TextView(context);
		inserisciStacco(linear,textStacco);
		//
		
	}
	
	/**
	 * Metodo che restituisce un testo con più parti in grassetto, passate attraverso un <i>HashMap</i> 
	 * @param testo
	 * @param mappaPartiInGrassetto
	 */
	public static void inserisciTestoConPiuPartiInGrassetto(LinearLayout linear, TextView textView, String testo, HashMap mappaPartiInGrassetto) {
		Iterator i = mappaPartiInGrassetto.entrySet().iterator();
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		while (i.hasNext()) {
	        Map.Entry mappa = (Map.Entry)i.next();
	        preparaTestoConParteInGrassetto(str, testo, ((Integer)mappa.getKey()).intValue(), ((Integer)mappa.getValue()).intValue());
		}
		textView.setText(str);
		if (linear != null){
			linear.addView(textView);
		}

	}
	/**
	 * Metodo che inserisce un riquadro rosso #880000
	 * @param testo
	 */
	public static void inserisciTestoConRiquadro(LinearLayout linear, TextView textView, String testo) {
		GradientDrawable gd = new GradientDrawable();
        gd.setColor(Color.parseColor("#FFFFFF")); // Changes this drawbale to use a single color instead of a gradient
        gd.setStroke(2, Color.parseColor("#880000"));
		textView.setPadding(4, 0, 4, 0);    
        textView.setBackground(gd);
        textView.setText(testo);
        if (linear != null){
        	linear.addView(textView);
        }
	}
	
	/**
	 * Metodo che restituisce un testo colorato, settato anche a bold
	 * @param testo
	 * @param colore
	 */
	public static void inserisciTestoColoratoInGrassetto(LinearLayout linear, TextView textView, String testo, String colore) {
		textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
		textView.setTextColor(Color.parseColor(colore));
		if (linear != null){
			linear.addView(textView);
		}
	}
	
	/**
	 * Metodo che restituisce un testo con un riquadro, anteposto dalla parola <i>Conclusioni</i>
	 */
	public static void inserisciTestoConRiquadroConclusivo(LinearLayout linear, TextView textView, String testo) {
		inserisciTestoColoratoInGrassetto(linear, textView, "Conclusioni", "#880000");
		GradientDrawable gd = new GradientDrawable();
        gd.setColor(Color.parseColor("#FFFFFF")); // Changes this drawbale to use a single color instead of a gradient
        gd.setStroke(3, Color.parseColor("#880000"));
		textView.setPadding(4, 0, 4, 0);    
        textView.setBackground(gd);
        textView.setText(testo);
        textView.setTextColor(Color.parseColor("#880000"));
        if (linear != null){
        	linear.addView(textView);
        }
		
	}
	
    public static void preparaTesto(LinearLayout linear, TextView textView, SpannableStringBuilder builder, String text, String textToBold, int tipologiaModifica){

        if(textToBold.length() > 0 && !textToBold.trim().equals("")){
        	
            //for counting start/end indexes
            String testText = text.toLowerCase(Locale.ITALY);
            String testTextToBold = textToBold.toLowerCase(Locale.ITALY);
            int startingIndex = testText.indexOf(testTextToBold);
            int endingIndex = startingIndex + testTextToBold.length();
            //for counting start/end indexes

            if(startingIndex < 0 || endingIndex <0){
                //
            }
            else if(startingIndex >= 0 && endingIndex >=0){
                builder.setSpan(new StyleSpan(tipologiaModifica), startingIndex, endingIndex, 0);
            }
        }
    }
    
    public static void inserisciTestoPersonalizzato(LinearLayout linear, TextView textView, String testo, HashMap<String, Integer> mappaParolaModifica) {
		Iterator i = mappaParolaModifica.entrySet().iterator();
        SpannableStringBuilder builder = new SpannableStringBuilder();
        builder.append(testo);
		while (i.hasNext()) {
	        Map.Entry mappa = (Map.Entry)i.next();
	        preparaTesto(linear, textView, builder, testo,((String)mappa.getKey()), ((Integer)mappa.getValue()).intValue());
		}
        
		textView.setText(builder);
		if (linear != null){
			linear.addView(textView);
		}
    }
    
	/**
	 * Metodo che restituisce un testo in <i>formato definizione</i> ossia con un background colore differente.
	 * @param testo
	 */
	public static void inserisciDefinizioneNuovoModo(LinearLayout linear, TextView textView, Context context, String testo, HashMap<String,Integer> mappaPartiInGrassetto) {
		Iterator i = mappaPartiInGrassetto.entrySet().iterator();
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		while (i.hasNext()) {
	        Map.Entry mappa = (Map.Entry)i.next();
	        preparaTesto(linear, textView, str, testo,((String)mappa.getKey()), ((Integer)mappa.getValue()).intValue());
		}
		//
		TextView textStacco = new TextView(context);
		inserisciStacco(linear,textStacco);
		//
		textView.setPadding(4, 0, 4, 0);    
		textView.setText(str);
		textView.setBackgroundColor(Color.parseColor(BACKGROUND_DEFINIZIONE));
		linear.addView(textView);
		//
		textStacco = new TextView(context);
		inserisciStacco(linear,textStacco);
		//
	}
	
	/**
	 * Metodo che restituisce un'immagine, opportunamente salvata all'interno della cartella <b>drawable</b>
	 * @param immagine
	 */
	public static void inserisciImmagine(LinearLayout linear, int immagine, Context context) {
		ImageView myImage = new ImageView(context);
        myImage.setImageResource(immagine);
        linear.addView(myImage);
        
	}
	
	
}
