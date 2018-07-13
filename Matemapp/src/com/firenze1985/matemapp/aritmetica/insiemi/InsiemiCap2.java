/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.insiemi;

import java.util.HashMap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Argomento;

/**
 * @author Administrator
 *
 */
public class InsiemiCap2 extends Argomento {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Insiemi", "Capitolo 2: rappresentazione degli insiemi");
		
		
		/*
		inserisciTesto("Cosa è un insieme? Proviamo a darci un'idea");
		inserisciTestoPersonalizzato("Possiamo immaginare a un insieme come a un raggruppamento di oggetti che hanno qualcosa in comune.",
				true, false, 43, 57, 
				true, false, 79, 98, 
				false, false, 0, 0);
		inserisciTesto("Pensa ad esempio alla tua classe: puoi creare un insieme dei tuoi compagni che portano gli occhiali, oppure un insieme dei tuoi compagni che hanno le scarpe colorate, oppure ancora un insieme di tutti i maschi che scrivono con la mano sinistra");
		inserisciTesto("Sono insiemi? Per quello che ci siamo detti poco fa sì. Ogni gruppo di oggetti (in questo caso persone) creato ha una caratteristica in comune");
		inserisciTesto("Proviamo allora a dare una definizione un po' più rigorosa, usando alcuni termini specifici che siano comunque semplici e comprensibili:");
		HashMap<Integer,Integer> mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(3, 10);
		mappaPartiInGrassetto.put(54, 68);
		mappaPartiInGrassetto.put(110, 127);
		inserisciDefinizione("Un insieme è una collezione di elementi che hanno una caratteristica in comune, in cui possiamo stabilire con assoluta certezza se un elemento appartiene o meno all'insieme", mappaPartiInGrassetto);
		inserisciTestoConParteInCorsivo("Facciamo un attimo attenzione alla seconda parte della definizione, quella relativa alla assoluta certezza",
				89, 107);
		inserisciTesto("Che significa? Facciamo un esempio per capire meglio: supponi che il vostro insegnante chieda a ognuno di voi di creare l'insieme dei piatti preferiti.");
		inserisciTesto("Cosa capiterà? Che tu, magari, avrai inserito alcuni piatti che alcuni tuoi compagni invece non hanno inserito perchè per il loro gusto non sono piacevoli. E viceversa, loro potranno aver inserito piatti che a te non piaccono per niente!");
		inserisciTesto("Chi ha ragione? Tu? Loro?");
		inserisciTesto("In realtà...nessuno! Questo perchè l'esercizio proposto contiene un errore di fondo: l'insieme dei piatti preferiti è soggettivo. Pertanto ognuno di noi creerà una lista differente dagli altri.");
		inserisciTesto("Più tecnicamente, si dice che la caratteristica essere un piatto preferito è soggettiva. "
				+ "Ovvero, ognuno di noi ha i suoi piatti preferiti, in base ai propri gusti. "
				+ "Quindi questa caratteristica fa cambiare, da soggetto a soggetto (ecco perchè si dice soggettiva), "
				+ "la costruzione della collezione di elementi");
		inserisciTesto("Ecco che quindi non abbiamo creato un insieme.");
		inserisciStacco();
		inserisciTesto("Se invece il tuo insegnante vi chiede di costruire l'insieme di tutte le regioni italiane...cosa succede?");
		inserisciTesto("Stavolta tu e tutti i tuoi compagni avrete creato lo stesso insieme.");
		inserisciTesto("Questo perchè la caratteristica essere o meno una regione italiana è oggettiva. Ovvero, ogni persona fornisce la stessa risposta");
		*/
		return getAndroidView();

	}
}
