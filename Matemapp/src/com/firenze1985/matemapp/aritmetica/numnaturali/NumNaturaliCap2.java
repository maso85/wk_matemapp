package com.firenze1985.matemapp.aritmetica.numnaturali;

import java.util.HashMap;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Argomento;

/**
 * @author Administrator
 *
 */
public class NumNaturaliCap2 extends Argomento {

	
	/* (non-Javadoc)
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Numeri Naturali", "Capitolo 2: le rappresentazioni dei numeri");
		String testo1 = "Ti sei mai chiesto perchè si chiama insieme dei numeri naturali?";
		HashMap<String, Integer> mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("naturali", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciStacco();
		inserisciTesto("La risposta è abbastanza intuitiva: sono i numeri che si trovano in natura. Più precisamente, sono quei numeri che ci permettono di identificare le quantità: 3 mele, 8 penne, 4 smartphone, 17 gol.");
		testo1 = "Domanda successiva: chi ha deciso che uno si scrive 1, che cinque si scrive 5, che sedici si scrive 16, che centoventisei si scrive 126 ?";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("uno", Typeface.ITALIC);
		mappaParolaModifica.put("cinque", Typeface.ITALIC);
		mappaParolaModifica.put("sedici", Typeface.ITALIC);
		mappaParolaModifica.put("centoventisei", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		testo1 = "Siamo noi che siamo abituati a usare questo linguaggio. Queste regole. Questa rappresentazione. Ma abbiamo davvero capito cosa facciamo?";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("linguaggio", Typeface.ITALIC);
		mappaParolaModifica.put("regole", Typeface.ITALIC);
		mappaParolaModifica.put("rappresentazione", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciTesto("Facciamo una cosa: azzeriamo la nostra mente su questi concetti e ripartiamo da zero. Sperando di arrivare a capire meglio!");
		inserisciStacco();
		testo1 = "Innanzitutto, tutti i numeri sono formati da cifre. Una cifra è un elemento del seguente insieme:\n\nC={0, 1, 2, 3, 4, 5, 6, 7, 8, 9}\n\nUna cifra quindi è uno di quei dieci elementi. Uno di quei simboli.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("cifre", Typeface.BOLD);
		mappaParolaModifica.put("cifra", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		inserisciTesto("Se queste cifre, questi simboli, li mettiamo uno di fianco all'altro che succede? Come si legge l'elemento creato?");
		inserisciTesto("Prendiamo la cifra 1 e la cifra 8. Se li affianchiamo otteniamo 18. Che noi sappiamo essere diciotto. Abbiamo creato un numero a due cifre.");
		inserisciTesto("Cambia se invertiamo l'ordine? Beh, otteniamo 81 che noi sappiamo essere ottantuno. Nettamente differente da diciotto. Cosa è cambiato pertanto da 18 a 81 ?");
		testo1 = "Ciò che è cambiato è l'ordine delle cifre. Più tecnicamente diremo che è cambiata la posizione.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("ordine", Typeface.ITALIC);
		mappaParolaModifica.put("posizione", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);		
		testo1 = "Abbiamo la parola chiave: il nostro modo di rappresentare i numeri si chiama infatti posizionale. Ossia, per rappresentare tutti i numeri possibili noi disponiamo di soli dieci simboli, ossia le cifre: mescolando assieme tali cifre e dando un senso alla posizione di ognuna di loro, riusciamo a scrivere tutti i numeri.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("posizionale", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato la definizione di numero\n\n- hai imparato cosa è l'insieme N dei numeri naturali\n\n- hai imparato a rappresentare l'insieme N");
		return getAndroidView();

	}
}
