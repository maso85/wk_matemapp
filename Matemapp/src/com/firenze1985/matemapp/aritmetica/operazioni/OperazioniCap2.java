/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.operazioni;

import java.util.HashMap;

import android.R;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firenze1985.matemapp.Capitolo;
import com.firenze1985.matemapp.ModificaTesto;
import com.firenze1985.matemapp.utility.MathSymbol;

/**
 * @author Administrator
 *
 */
public class OperazioniCap2 extends Capitolo {
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Operazione", "Capitolo 2: l'addizione");
		//
		ModificaTesto.inserisciTesto(getLinear(), new TextView(getContext()), "Cominciamo con la prima operazione: l'addizione");
        //
		String testo1 = "Sai sicuramente fare le addizioni: 14 + 5, 16 + 7, 19 + 8. Anche con numeri pi� grandi magari, come 189 + 443 oppure 5.587 + 4.821, ma ti sei mai chiesto realmente che cosa significa sommare?";
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("14 + 5", Typeface.ITALIC);
        hashmap.put("16 + 7", Typeface.ITALIC);
        hashmap.put("19 + 8", Typeface.ITALIC);
        hashmap.put("189 + 443", Typeface.ITALIC);
        hashmap.put("5.587 + 4.821", Typeface.ITALIC);
        hashmap.put("sommare", Typeface.ITALIC);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
        //
        testo1 = "Riprendiamo in mano la semiretta orientata utilizzata in precedenza";
		ModificaTesto.inserisciTesto(getLinear(), new TextView(getContext()), testo1);
		//
		ModificaTesto.inserisciImmagine(getLinear(), com.firenze1985.matemapp.R.drawable.retta_orientata_num_naturali_7, getContext());
		//
		testo1 = "Questa semiretta, ricordiamoci, rappresenta tutti i numeri naturali. Cerchiamo di utilizzarla: cosa significa fare due pi� tre?";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("due pi� tre", Typeface.ITALIC);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
        testo1 = "Posizioniamoci sulla semiretta esattamente sul punto 2. Ora, noi gi� sappiamo il risultato di quella somma, ovvero 5. Riflettiamo: cosa possiamo fare per andare da 2 a 5?";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("gi� sappiamo", Typeface.ITALIC);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
        testo1 = "Non � molto difficile: se partiamo da 2 e facciamo 3 balzi verso destra, ognuno grande una unit�, arriviamo esattamente a 5.";
        hashmap = new HashMap<String, Integer>();
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
        testo1 = "Abbiamo a questo punto capito cosa significa sommare:\n\n2 + 3 = 5\n\nOgnuno di questi simboli ha un suo preciso ruolo nel procedimento eseguito con la semiretta orientata:";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("2 + 3 = 5", Typeface.BOLD);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
        testo1 = "2 � il punto di partenza.\n+ significa che dovr� fare dei balzi verso destra.\n3 � il numero dei balzi da compiere.\n5 � il punto di arrivo.";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("2", Typeface.BOLD);
        hashmap.put("punto di partenza", Typeface.ITALIC);        
        hashmap.put("+", Typeface.BOLD);
        hashmap.put("verso destra", Typeface.ITALIC);
        hashmap.put("3", Typeface.BOLD);
        hashmap.put("numeri dei balzi", Typeface.ITALIC);
        hashmap.put("5", Typeface.BOLD);
        hashmap.put("punto di arrivo", Typeface.ITALIC);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
        testo1 = "Probabilmente non hai mai affrontato le addizioni in questo modo: esatto? O magari s�. In ogni caso, sommare significa esattamente questo: mettersi sulla semiretta orientata e compiere una serie di balzi, ognuno di una unit�, verso destra.";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("mettersi sulla semiretta orientata e compiere una serie di balzi, ognuno di una unit�, verso destra", Typeface.ITALIC);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
        testo1 = "Diamo adesso un nome tecnico agli attrezzi utilizzati:";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("attrezzi", Typeface.ITALIC);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
		//
        testo1 = "L'operazione si chiama addizione, e ha il simbolo +.\nI due termini dell'operazione si chiamano addendi, rispettivamente primo addendo e secondo addendo.\nIl risultato dell'addizione si chiama somma.";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("addizione", Typeface.BOLD);
        hashmap.put("+", Typeface.BOLD);
        hashmap.put("addendi", Typeface.BOLD);
        hashmap.put("primo addendo", Typeface.BOLD);
        hashmap.put("secondo addendo", Typeface.BOLD);
        hashmap.put("somma", Typeface.BOLD);
        ModificaTesto.inserisciDefinizioneNuovoModo(getLinear(), new TextView(getContext()), getContext(), testo1, hashmap);
		//
        testo1 = "Detto tra noi, non � fondamentale imparare questi termini. Puoi benissimo imparare a fare le addizioni senza conoscere i termini tecnici di ci� che stai utilizzando: un bravo pilota pu� pure non conoscere la meccanica che c'� dietro al motore della sua auto. Certo, se la conosce ne pu� discutere con i meccanici, pu� cercare di saperne di pi�, sicuramente diventa maggiormente padrone del mezzo.\nE cos� tu: se cominci fin da subito a utilizzare i termini tecnici della matematica potrai comprendere meglio in futuro argomenti pi� complessi, potrai confrontarti con i tuoi compagni parlando la stessa lingua.\n"+MathSymbol.E_MAIUSCOLO_ACCENTATA+" un esempio stupido quello che ti facciamo, ma supponi di trovarti con tre tuoi amici che frequentano scuole diverse o anche semplicemente classi diverse e dovete lavorare sulle addizioni: tu il primo termine lo chiami primo addendo, uno dei tuoi amici lo chiama il primo numero da sommare mentre l'altro dei tuoi amici lo chiama quello a sinistra del +; capisci bene che fareste uno sforzo notevole per capirvi. Invece se utilizziamo tutti gli stessi termini, ci capiamo alla svelta e concentriamo le nostre energie sulla comprensione di ci� che dobbiamo fare.";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("non � fondamentale", Typeface.ITALIC);
        hashmap.put("parlando la stessa lingua", Typeface.ITALIC);
        hashmap.put("primo addendo", Typeface.ITALIC);
        hashmap.put("il primo numero da sommare", Typeface.ITALIC);
        hashmap.put("quello a sinistra del +", Typeface.ITALIC);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
        //      
 		ModificaTesto.inserisciStacco(getLinear(), new TextView(getContext()));
 		//
 		testo1 = "Torniamo a concentrarci sull'operazione di addizione: dunque, abbiamo capito cosa significa fare un'addizione. Ma allora, potresti obiettare, perch� tutte le somme non le facciamo con la semiretta orientata?\nLa risposta � semplice: prova a fare 37 + 61 con la semiretta orientata. Devi costruire una semiretta orientata bella lunga, inoltre tenere il conto di 61 balzi non � semplicissimo. Ecco che allora ci siamo dovuti inventare un procedimento alternativo perch� per sommare i numeri a pi� cifre la semiretta orientata non conviene pi�.";
        hashmap = new HashMap<String, Integer>();
        hashmap.put("procedimento alternativo", Typeface.BOLD);
        hashmap.put("non conviene", Typeface.BOLD);
        ModificaTesto.inserisciTestoPersonalizzato(getLinear(), new TextView(getContext()), testo1, hashmap);
        //     
		ModificaTesto.inserisciStacco(getLinear(), new TextView(getContext()));
		//
        testo1 = "- hai imparato cosa significa fare un'addizione\n\n- hai imparato i termini tecnici dell'addizione\n\n- hai imparato perch";
		ModificaTesto.inserisciTestoConRiquadroConclusivo(getLinear(), new TextView(getContext()), getContext(), testo1);
		return getAndroidView();
	}
}
