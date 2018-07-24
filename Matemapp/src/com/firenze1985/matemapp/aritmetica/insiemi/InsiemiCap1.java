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
public class InsiemiCap1 extends Capitolo {

	/* (non-Javadoc)
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Insiemi", "Capitolo 1: introduzione al concetto di insieme");
		
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
		inserisciTestoConParteInGrassetto("Facciamo un attimo attenzione alla seconda parte della definizione, quella relativa alla assoluta certezza",
				89, 106);
		inserisciTesto("Che significa? Facciamo un esempio per capire meglio: supponi che il vostro insegnante chieda a ognuno di voi di creare l'insieme dei piatti preferiti.");
		inserisciTesto("Cosa capiterà? Che tu, magari, avrai inserito alcuni piatti che alcuni tuoi compagni invece non hanno inserito perchè per il loro gusto non sono piacevoli. E viceversa, loro potranno aver inserito piatti che a te non piaccono per niente!");
		inserisciTesto("Chi ha ragione? Tu? Loro?");
		inserisciTesto("In realtà...nessuno! Questo perchè l'esercizio proposto contiene un errore di fondo: l'insieme dei piatti preferiti non è uguale per tutti. Pertanto ognuno di noi creerà una lista differente dagli altri.");
		inserisciTestoConParteInGrassetto("Più tecnicamente, si dice che la caratteristica essere un piatto preferito è soggettiva. "
				+ "Ovvero, ognuno di noi ha i suoi piatti preferiti, in base ai propri gusti. "
				+ "Quindi questa caratteristica fa cambiare, da soggetto a soggetto (ecco perchè si dice soggettiva), "
				+ "la costruzione della collezione di elementi", 77, 87);
		inserisciTesto("Ecco che quindi non abbiamo creato un insieme.");
		inserisciStacco();
		inserisciTesto("Se invece il tuo insegnante vi chiede di costruire l'insieme di tutte le regioni italiane...cosa succede?");
		inserisciTesto("Stavolta tu e tutti i tuoi compagni avrete creato lo stesso insieme.");
		inserisciTestoConParteInGrassetto("Questo perchè la caratteristica essere o meno una regione italiana è oggettiva. "
				+ "Ovvero, ogni persona fornisce la stessa risposta", 69,78);
		inserisciStacco();
		inserisciTestoConParteInGrassetto("Come presto imparerai, in matematica siamo pigri. Non abbiamo molta voglia di scrivere. "
				+ "Ecco che una volta capito un concetto, dobbiamo imparare alcuni simboli che ci permettono di accorciare le frasi.", 136,159);
		inserisciTesto("Immaginiamo di dover scrivere ad esempio: la Toscana appartiene all'insieme delle regioni italiane, la Puglia appartiene all'insieme delle regioni italiane, e così via. Non finiremmo più!");
		inserisciTesto("Dobbiamo inventarci qualcosa di furbo: ecco che ci vengono in aiuto una serie di convenzioni e simboli");
		inserisciStacco();
		inserisciTestoConParteInGrassetto("Innanzitutto gli insiemi si indicano solitamente con una lettera maiuscola dell'alfabeto: A, B, C,...", 57, 89);
		inserisciTestoConParteInGrassetto("Gli elementi di un insieme si indicano solitamente con una lettera minuscola dell'alfabeto: a, b, c, ....", 59, 90);
		inserisciTesto("Se quindi indichiamo, ad esempio, con t la Toscana e con R l'insieme delle regioni italiane, per dire che la Toscana appartiene all'insieme delle regioni italiane ci basta semplicemente scrivere quanto segue:");
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(0, 0);
		inserisciDefinizione("t \u2208 R", mappaPartiInGrassetto);
		inserisciTesto("Tre simboli per dire una frase piuttosto lunga. Comodo no?");
		inserisciTestoConParteInGrassetto("Abbiamo imparato il simbolo di appartenenza.", 31, 43);
		inserisciTesto("Se invece volessimo dire che la Juventus non appartiene all'insieme delle regioni italiane?");
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(0, 0);
		inserisciDefinizione("j \u2209 R", mappaPartiInGrassetto);
		inserisciTestoConParteInGrassetto("Questo è invece il simbolo di non appartenenza.", 30, 46);
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato la definizione di insieme\n\n- hai imparato come scrivere in simboli matematici se un elemento appartiene o no a un insieme");
		return getAndroidView();

	}

}
