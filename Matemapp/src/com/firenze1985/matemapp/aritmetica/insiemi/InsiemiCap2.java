/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.insiemi;

import java.util.HashMap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Capitolo;

/**
 * @author Administrator
 *
 */
public class InsiemiCap2 extends Capitolo {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Insiemi", "Capitolo 2: rappresentazione degli insiemi");
		
		inserisciTesto("Abbiamo preso confidenza con alcune definizioni e simbologie legate agli insiemi. Impariamone subito un'altra:");
		HashMap<Integer,Integer> mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(2, 14);
		mappaPartiInGrassetto.put(34, 55);
		mappaPartiInGrassetto.put(103, 106);
		inserisciDefinizione("La cardinalità di un insieme è il numero degli elementi di quell'insieme. La cardinalità si indica con |A| dove A è il nome dell'insieme", mappaPartiInGrassetto);
		inserisciTesto("Per esempio: la cardinalità dell'insieme delle note musicali è 7. La cardinalità dell'insieme delle regioni italiane è 20.");
		inserisciTestoConParteInGrassetto("Fintanto che riusciamo a contare tutti gli elementi di un insieme non abbiamo problemi.", 33, 38);
		inserisciTestoConParteInGrassetto("Tali insiemi, si dice, hanno cardinalità finita.", 29, 47);
		inserisciTesto("Invece la cardinalità dell'insieme dei numeri dispari?");
		inserisciTesto("Di questo insieme non possiamo dare un numero esatto che possa indicare quanti elementi possiede: sono infiniti!");
		inserisciTestoConParteInGrassetto("Tali insiemi, si dice, hanno cardinalità infinita", 29, 49);
		inserisciTesto("Adesso pensa all'insieme degli abitanti di Marte: sapresti dirmi qual è la sua cardinalità? Non ha elementi, quindi la sua cardinalità è zero.");
		inserisciTestoConParteInGrassetto("Se un insieme ha zero elementi, tale insieme si dice insieme vuoto", 53, 66);		
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(41, 42);
		mappaPartiInGrassetto.put(55, 58);
		inserisciTestoConPiuPartiInGrassetto("L'insieme vuoto si indica con il simbolo \u2205, oppure con { }.", mappaPartiInGrassetto);		
		inserisciStacco();
		inserisciTestoConParteInGrassetto("Vediamo adesso alcuni modi di rappresentare gli insiemi.", 30, 43);
		inserisciTesto("Ovvero come descrivere e raccontare agli altri, a tutti gli altri, di quale insieme stiamo parlando.");
		inserisciStacco();
		inserisciTesto("Supponiamo di dover rappresentare l'insieme delle note musicali.");
		inserisciTesto("Un modo che potrebbe permettere a tutti di capire di quale insieme stiamo parlando potrebbe essere quello di scrivere tutti gli elementi che appartengono a quell'insieme. Nel nostro caso quindi potremmo scrivere come segue:");
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(0, 0);
		inserisciDefinizione("N={do, re, mi, fa, sol, la, si}", mappaPartiInGrassetto);
		inserisciTestoConParteInGrassetto("Questo tipo di rappresentazione si chiama per elencazione.", 46, 57);
		inserisciStacco();
		inserisciTesto("Facciamo un nuovo esempio: rappresentiamo l'insieme di tutti i numeri pari");
		inserisciTesto("Proviamo a farlo con la rappresentazione appena imparata?\nN={2, 4, 6, 8, 10, 12, 14, ...}\nAbbiamo un problema: quei puntini indicano che non abbiamo finito di elencare.");
		inserisciTesto("Ma potremmo mai finire di elencare gli elementi di un insieme di questo tipo? No. Tale insieme infatti ha cardinalità infinita");
		inserisciTesto("Per insiemi di questo tipo, pertanto, dobbiamo inventarci un modo alternativo di rappresentarli. Potremmo per esempio ciò che hanno in comune tutti gli elementi di tale insieme. L'idea è giusta, ecco come potremmo quindi rappresentare l'insieme dei numeri pari:");
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(0, 0);
		inserisciDefinizione("N={x | x è un numero pari}", mappaPartiInGrassetto);
		inserisciTesto("Che si legge:");
		inserisciTestoInCorsivo("L'insieme N è dato da tutti gli elementi x tali che x è un numero pari");
		inserisciTestoConParteInGrassetto("Questo tipo di rappresentazione si chiama per caratteristica.", 46, 60);
		inserisciStacco();
		inserisciTestoConParteInGrassetto("Infine esiste un terzo modo di rappresentare gli insiemi, che sicuramente avrai già visto negli anni scorsi: il diagramma di Eulero-Venn", 109, 136);
		inserisciTesto("Questo tipo di rappresentazione è molto intuitiva: si disegna una linea chiusa (ricorda un sacchetto) e all'interno vi scriviamo gli elementi presenti. Una sorta di rappresentazione per caratteristica, però molto più grafica");
		inserisciTestoConParteInCorsivo("Pur non essendo molto matematico come tipo di rappresentazione, risulta utile sopratutto perchè intuitivo. Sappi però che, più andrai avanti, e meno utilizzerai questa rappresentazione.", 22, 32);
		inserisciStacco();
		inserisciTestoConParteInGrassetto("Forse adesso ti starai chiedendo: come faccio a capire quale rappresentazione conviene?", 78, 86);
		inserisciTesto("Non c'è una regola precisa, ma possiamo darti un'indicazione:");
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(31, 37);
		mappaPartiInGrassetto.put(77, 88);
		mappaPartiInGrassetto.put(95, 109);
		mappaPartiInGrassetto.put(229, 238);
		mappaPartiInGrassetto.put(282, 297);
		inserisciDefinizione("Per gli insiemi di cardinalità finita si può scegliere di rappresentarli per elencazione o per caratteristica. Ovviamente più è grande l'insieme e meno converrà la rappresentazione per elencazione.\n\n"
				+ "Per gli insiemi di cardinalità infinita invece si consiglia la rappresentazione per caratteristica.", mappaPartiInGrassetto);
		
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato la definizione di cardinalità di un insieme\n\n"
				+ "- hai imparato come rappresentare gli insiemi");
		return getAndroidView();
	}
}
