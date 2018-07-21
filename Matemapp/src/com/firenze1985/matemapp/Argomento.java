/**
 * 
 */
package com.firenze1985.matemapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Administrator
 *
 */
public class Argomento extends Fragment {
	
	protected TextView textView;
	String titoloArgomento;
	String titoloParagrafo;
	View androidView;
	LinearLayout linear;
	String BACKGROUND_DEFINIZIONE = "#e8fc74";
	
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
	
	
	/**
	 * @return the titoloArgomento
	 */
	public String getTitoloArgomento() {
		return titoloArgomento;
	}
	/**
	 * @param titoloArgomento the titoloArgomento to set
	 */
	public void setTitoloArgomento(String titoloArgomento) {
		this.titoloArgomento = titoloArgomento;
	}
	/**
	 * @return the titoloParagrafo
	 */
	public String getTitoloParagrafo() {
		return titoloParagrafo;
	}
	/**
	 * @param titoloParagrafo the titoloParagrafo to set
	 */
	public void setTitoloParagrafo(String titoloParagrafo) {
		this.titoloParagrafo = titoloParagrafo;
	}
	
	
	
	/**
	 * @return the androidView
	 */
	public View getAndroidView() {
		return androidView;
	}
	/**
	 * @param androidView the androidView to set
	 */
	public void setAndroidView(View androidView) {
		this.androidView = androidView;
	}
	/**
	 * @return the linear
	 */
	public LinearLayout getLinear() {
		return linear;
	}
	/**
	 * @param linear the linear to set
	 */
	public void setLinear(LinearLayout linear) {
		this.linear = linear;
	}
	
	
	
	/* ************************************ METODI PERSONALIZZATI ******************************************************/
	
	/**
	 * Metodo che setta il classico layout di una pagina di un argomento
	 * @param inflater
	 * @param container
	 * @param titolo
	 * @param paragrafo
	 */
	protected void settaggioViewLayoutTitoliPaginaClassica(LayoutInflater inflater, ViewGroup container, String titolo, String paragrafo){
		setAndroidView(inflater.inflate(R.layout.argomento_layout, container, false));
		setLinear((LinearLayout)getAndroidView().findViewById(R.id.idLinearLayoutArgomento));
		inizializzaTitoloArgomentoTitoloParagrafo(titolo, paragrafo);
	        		
	}
	/**
	 * Metodo che setta titolo di argomento e titolo di paragrafo in pagina, creando anche un piccolo stacco
	 * @param linear
	 * @param titolo
	 * @param paragrafo
	 */
	protected void inizializzaTitoloArgomentoTitoloParagrafo(String titolo, String paragrafo) {
		setTitoloArgomento(titolo);
		setTitoloParagrafo(paragrafo);
		inserisciTitolo(getTitoloArgomento());
	    inserisciTitoloParagrafo(getTitoloParagrafo());
		inserisciStacco();	       
	}
	
	/**
	 * Metodo che (ri)crea ogni volta una nuova textView. Da richiamare ogni volta che si crea un metodo del tipo 
	 */
	protected void inizializzaTextView() {
		setTextView(new TextView(getContext()));
	}
	
	/**
	 * Metodo che inserisce un nuovo testo. La grandezza del testo è di default a 14DP
	 * @param testo
	 */
	protected void inserisciTesto(String testo) {
		inizializzaTextView();
        textView.setText(testo);
        getLinear().addView(textView);
	}
	
	/**
	 * Metodo che inserisce un nuovo testo, completamente in grassetto. La grandezza del testo è di default a 14DP
	 * @param testo
	 */
	protected void inserisciTestoInGrassetto(String testo) {
		inizializzaTextView();
        textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
        getLinear().addView(textView);
	}
	
	/**
	 * Metodo che inserisce un testo con una parte in grassetto, specificando l'inizio (compreso) e la fine (esclusa).
	 * La grandezza del testo è di default a 14DP
	 * @param testo
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 */
	protected void inserisciTestoConParteInGrassetto(String testo, int inizioBoldCompreso, int fineBoldEscluso) {
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), inizioBoldCompreso, fineBoldEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		inizializzaTextView();
		textView.setText(str);
        getLinear().addView(textView);

	}
	
	/**
	 * Metodo che <b>prepara</b> il testo con una parte in grassetto. Da usare in caso di piu' parti in grassetto in un testo.
	 * @param testo
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 */
	private void preparaTestoConParteInGrassetto(SpannableStringBuilder str, String testo, int inizioBoldCompreso, int fineBoldEscluso) {
		str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), inizioBoldCompreso, fineBoldEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);		
	}
	/**
	 * Metodo che inserisce il titolo, di grandezza 25DP di default
	 * @param testo
	 */
	protected void inserisciTitolo(String testo) {
		inizializzaTextView();
		textView.setText(testo);
		textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
		getLinear().addView(textView);
	}
	
	/**
	 * Metodo che inserisce un nuovo testo con la possibilita di modificare la grandezza. Tramite il parametro <i>isBold</i> possiamo
	 * mettere in grassetto l'intero testo
	 * @param testo
	 * @param tipoGrandezza
	 * @param grandezza
	 * @param isBold
	 */
	protected void inserisciTestoGrandezzaPersonalizzata(String testo,int tipoGrandezza, float grandezza, boolean isBold) {
		inizializzaTextView();
		textView.setText(testo);
		textView.setTextSize(tipoGrandezza,grandezza);
		// se isBold e' true, allora rendiamo in grassetto l'intero testo
		if (isBold) {
	        textView.setTypeface(null, Typeface.BOLD);
		}
		getLinear().addView(textView);		
	}
	
	/**
	 * Metodo che inserisce il titolo di un paragrafo, aggiungendo un padding top personalizzato in px
	 * @param testo
	 */
	protected void inserisciTitoloParagrafo(String testo, int paddingTop){
		inizializzaTextView();
		textView.setPadding(0, paddingTop, 0, 0);
		textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
		getLinear().addView(textView);		
	}
	
	/**
	 * Metodo che inserisce il titolo di un paragrafo, aggiungendo un padding top di default a 15px
	 * @param testo
	 */
	protected void inserisciTitoloParagrafo(String testo) {
		inserisciTitoloParagrafo(testo, 15);
	}
	
	/**
	 * Metodo uno stacco, impostato di default a 4px
	 */
	protected void inserisciStacco() {
		inizializzaTextView();
		textView.setPadding(0, 4, 0, 0);
		getLinear().addView(textView);
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
	protected void inserisciTestoPersonalizzato(String testo, 
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
        getLinear().addView(textView);
	}
	
	/**
	 * Metodo che inserisce un nuovo testo, completamente in grassetto. La grandezza del testo è di default a 14DP
	 * @param testo
	 */
	protected void inserisciTestoInCorsivo(String testo) {
		inizializzaTextView();
        textView.setText(testo);
        textView.setTypeface(null, Typeface.ITALIC);
        getLinear().addView(textView);
	}
	
	/**
	 * Metodo che inserisce un testo con una parte in grassetto, specificando l'inizio (compreso) e la fine (esclusa).
	 * La grandezza del testo è di default a 14DP
	 * @param testo
	 * @param inizioBoldCompreso
	 * @param fineBoldEscluso
	 */
	protected void inserisciTestoConParteInCorsivo(String testo, int inizioCorsivoCompreso, int fineCorsivoEscluso) {
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.ITALIC), inizioCorsivoCompreso, fineCorsivoEscluso, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		inizializzaTextView();
		textView.setText(str);
        getLinear().addView(textView);

	}
	/**
	 * Metodo che inserisce un testo colorato, passando in input il colore in formato #FF8877
	 * @param testo
	 * @param colore
	 */
	protected void inserisciTestoColorato(String testo, String colore) {
		inizializzaTextView();
		textView.setText(testo);
		textView.setTextColor(Color.parseColor(colore));
		getLinear().addView(textView);
	}
	
	/**
	 * Metodo che restituisce un testo in <i>formato definizione</i> ossia con un background colore differente.
	 * @param testo
	 */
	protected void inserisciDefinizione(String testo, HashMap<Integer,Integer> mappaPartiInGrassetto) {
		Iterator i = mappaPartiInGrassetto.entrySet().iterator();
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		while (i.hasNext()) {
	        Map.Entry mappa = (Map.Entry)i.next();
	        preparaTestoConParteInGrassetto(str, testo, ((Integer)mappa.getKey()).intValue(), ((Integer)mappa.getValue()).intValue());
		}
		inserisciStacco();
		inizializzaTextView();
		textView.setPadding(4, 0, 4, 0);    
		textView.setText(str);
		textView.setBackgroundColor(Color.parseColor(BACKGROUND_DEFINIZIONE));
		getLinear().addView(textView);
		inserisciStacco();
	}
	
	/**
	 * Metodo che restituisce un testo con più parti in grassetto, passate attraverso un <i>HashMap</i> 
	 * @param testo
	 * @param mappaPartiInGrassetto
	 */
	protected void inserisciTestoConPiuPartiInGrassetto(String testo, HashMap mappaPartiInGrassetto) {
		Iterator i = mappaPartiInGrassetto.entrySet().iterator();
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		while (i.hasNext()) {
	        Map.Entry mappa = (Map.Entry)i.next();
	        preparaTestoConParteInGrassetto(str, testo, ((Integer)mappa.getKey()).intValue(), ((Integer)mappa.getValue()).intValue());
		}
		inizializzaTextView();
		textView.setText(str);
		getLinear().addView(textView);

	}
	/**
	 * Metodo che inserisce un riquadro rosso #880000
	 * @param testo
	 */
	protected void inserisciTestoConRiquadro(String testo) {
		inizializzaTextView();
		GradientDrawable gd = new GradientDrawable();
        gd.setColor(Color.parseColor("#FFFFFF")); // Changes this drawbale to use a single color instead of a gradient
        gd.setStroke(2, Color.parseColor("#880000"));
		textView.setPadding(4, 0, 4, 0);    
        textView.setBackground(gd);
        textView.setText(testo);
        getLinear().addView(textView);
	}
	
	/**
	 * Metodo che restituisce un testo colorato, settato anche a bold
	 * @param testo
	 * @param colore
	 */
	protected void inserisciTestoColoratoInGrassetto(String testo, String colore) {
		inizializzaTextView();
		textView.setText(testo);
        textView.setTypeface(null, Typeface.BOLD);
		textView.setTextColor(Color.parseColor(colore));
		getLinear().addView(textView);
	}
	
	/**
	 * Metodo che restituisce un testo con un riquadro, anteposto dalla parola <i>Conclusioni</i>
	 */
	protected void inserisciTestoConRiquadroConclusivo(String testo) {
		inserisciTestoColoratoInGrassetto("Conclusioni", "#880000");
		inizializzaTextView();
		GradientDrawable gd = new GradientDrawable();
        gd.setColor(Color.parseColor("#FFFFFF")); // Changes this drawbale to use a single color instead of a gradient
        gd.setStroke(3, Color.parseColor("#880000"));
		textView.setPadding(4, 0, 4, 0);    
        textView.setBackground(gd);
        textView.setText(testo);
        textView.setTextColor(Color.parseColor("#880000"));
        getLinear().addView(textView);
		
	}
	
    protected static void preparaTesto(SpannableStringBuilder builder, String text, String textToBold, int tipologiaModifica){

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
    
    protected void inserisciTestoPersonalizzato(String testo, HashMap<String, Integer> mappaParolaModifica) {
		inizializzaTextView();
		Iterator i = mappaParolaModifica.entrySet().iterator();
        SpannableStringBuilder builder = new SpannableStringBuilder();
        builder.append(testo);
		while (i.hasNext()) {
	        Map.Entry mappa = (Map.Entry)i.next();
	        preparaTesto(builder, testo,((String)mappa.getKey()), ((Integer)mappa.getValue()).intValue());
		}
        
		textView.setText(builder);
		getLinear().addView(textView);
    }
    
	/**
	 * Metodo che restituisce un testo in <i>formato definizione</i> ossia con un background colore differente.
	 * @param testo
	 */
	protected void inserisciDefinizioneNuovoModo(String testo, HashMap<String,Integer> mappaPartiInGrassetto) {
		Iterator i = mappaPartiInGrassetto.entrySet().iterator();
		SpannableStringBuilder str = new SpannableStringBuilder(testo);
		while (i.hasNext()) {
	        Map.Entry mappa = (Map.Entry)i.next();
	        preparaTesto(str, testo,((String)mappa.getKey()), ((Integer)mappa.getValue()).intValue());
		}
		inserisciStacco();
		inizializzaTextView();
		textView.setPadding(4, 0, 4, 0);    
		textView.setText(str);
		textView.setBackgroundColor(Color.parseColor(BACKGROUND_DEFINIZIONE));
		getLinear().addView(textView);
		inserisciStacco();
	}
	
}
