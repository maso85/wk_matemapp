/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.insiemi;

import java.util.HashMap;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firenze1985.matemapp.Capitolo;
import com.firenze1985.matemapp.utility.MathSymbol;
/**
 * @author Administrator
 *
 */
public class InsiemiCap4 extends Capitolo {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		settaggioViewLayoutTitoliPaginaClassica(inflater, container, "Insiemi", "Capitolo 4: operazioni tra insiemi");
	
		inserisciTesto("Siamo arrivati all'ultimo capitolo relativo agli insiemi.");
		inserisciTestoConParteInGrassetto("Abbiamo capito cosa sono, abbiamo imparato a rappresentarli: adesso impareremo a eseguire operazioni tra loro", 90, 100);
		inserisciTestoConParteInGrassetto("Ricorda che con operazione si intende mettere insieme due oggetti e ricavarne un terzo. Così come siamo abituati a farle tra i numeri, è possibile farne anche tra insiemi? Certo. Vediamo di quali operazioni stiamo parlando.", 38, 87);
		inserisciStacco();
		inserisciTesto("Prendiamo due insiemi:\nA={1, 2, 3, 4, 5}\nB={2, 4, 6, 8, 10}");
		inserisciTesto("Ci accorgiamo che questi due insiemi hanno alcuni elementi in comune. Definiamo allora l'insieme C come l'insieme degli elementi in comune, ovvero:\nC={2, 4}");
		inserisciTestoConParteInGrassetto("Abbiamo eseguito un'operazione tra due insiemi, chiamata intersezione.", 57, 69);
		HashMap<Integer, Integer> mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(39, 51);
		mappaPartiInGrassetto.put(88, 93);
		mappaPartiInGrassetto.put(124, 140);
		mappaPartiInGrassetto.put(155, 164);
		inserisciDefinizione("Dati due insiemi A e B, si definisce C intersezione tra A e B come l'insieme formato da tutti gli elementi che appartengono sia ad A che a B.\n\nIn simboli: C = A \u2229 B", mappaPartiInGrassetto);
		inserisciTesto("Facciamo un altro esempio: prendiamo C come l'insieme dei carnivori ed E come l'insieme degli erbivori. Esistono elementi che appartengono a entrambi gli insiemi? Sì, sono gli onnivori. Se chiamiamo O tale insieme, allora scriveremo:\nO = C \u2229 B");
		inserisciTesto("Prendiamo adesso l'insieme M dato dai libri di matematica e S l'insieme dei libri di storia. Esistono elementi appartenenti ad entrambi gli insiemi? Stavolta no. Come traduciamo in simboli che non ci sono elementi nell'insieme intersezione?");
		inserisciTesto("M "+MathSymbol.INTERSEZIONE+" S = "+MathSymbol.INSIEME_VUOTO);
		inserisciTestoConParteInGrassetto("Si dice allora che i due insiemi M e S sono disgiunti.", 44, 53);
		inserisciTestoConParteInGrassetto("Un'ultima indicazione su questa operazione: è vero che M "+MathSymbol.INTERSEZIONE+" S = S "+MathSymbol.INTERSEZIONE+" M ? Sì. Se un'operazione gode di questa proprietà (che rivedremo più nello specifico per le operazioni numeriche) di dice che gode della proprietà commutativa.", 214, 225);
		inserisciStacco();
		inserisciTesto("Adesso vediamo un'altra operazione. Prendiamo due insiemi:\nK={4, 8, 12}\nZ={2, 4, 6, 8}");
		inserisciTesto("Immagina i due insiemi come due sacchetti che svuoti tutti all'interno di un terzo sacchetto. Cosa otterremo? Chiamiamo G tale insiem:");
		inserisciTesto("G = {2, 4, 6, 8, 12}");
		inserisciTesto("Se sei stato attento, dovresti aver notato che dentro G abbiamo inserito soltanto un 4. Non abbiamo sbagliato, è proprio una regola degli insiemi:");
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(0, 0);
		inserisciDefinizione("In ogni insieme, gli elementi al suo interno vanno scritti una volta sola", mappaPartiInGrassetto);
		String testo1 = "Detto questo, torniamo al nostro insieme G: l'abbiamo ottenuto unendo i due insiemi/sacchetti di partenza. Ecco che quindi abbiamo creato una nuova operazione chiamata unione:";
		HashMap<String, Integer> mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("unione", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1, mappaParolaModifica);
		mappaPartiInGrassetto = new HashMap<Integer, Integer>();
		mappaPartiInGrassetto.put(39, 45);
		mappaPartiInGrassetto.put(193, 203);
		inserisciDefinizione("Dati due insiemi A e B, si definisce D unione tra A e B come l'insieme formato dagli elementi appartenenti ad A o a B, eventualmente elencando una volta sola gli elementi ripetuti.\n\nIn simboli: D = A "+MathSymbol.UNIONE+" B", mappaPartiInGrassetto);
		inserisciTesto("Se prendiamo N={2, 3, 4, 5) e F={3, 4, 5, 6} allora se chiamiamo K l'unione tra i due insiemi possiamo scrivere che:\nK = N "+MathSymbol.UNIONE+" F = {2, 3, 4, 5, 6}");
		inserisciTesto("Se invece abbiamo C={2, 3, 4} e W={2, 3, 4, 5, 11} e chiamiamo P l'unione tra i due insiemi, come è fatto P?\nP = C "+MathSymbol.UNIONE+" W = {2, 3, 4, 5, 11}");
		testo1 = "In questo caso è accaduto questo: dato che C è sottoinsieme di W (ossia è incluso in W) allora l'unione tra i due insiemi è semplicemente l'insieme più grande, ossia in questo caso W.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("sottoinsieme", Typeface.BOLD);
		mappaParolaModifica.put("incluso", Typeface.BOLD);
		inserisciTestoPersonalizzato(testo1,mappaParolaModifica);
		inserisciStacco();
		testo1 = "Così come abbiamo visto per l'intersezione, anche l'unione gode della proprietà commutativa. Stavolta, rifacendoci al concetto di mettere due sacchetti in un unico sacchetto, capiamo ancora meglio come sia effettivamente vero che questa operazione gode della proprietà commutativa.";
		mappaParolaModifica = new HashMap<String, Integer>();
		mappaParolaModifica.put("unione", Typeface.BOLD);
		mappaParolaModifica.put("commutativa", Typeface.BOLD);
		mappaParolaModifica.put("unione", Typeface.BOLD);
		mappaParolaModifica.put("mettere due sacchetti in un unico sacchetto", Typeface.ITALIC);
		inserisciTestoPersonalizzato(testo1,mappaParolaModifica);
		inserisciStacco();
		inserisciTestoColoratoInGrassetto("Siamo arrivati alla fine di questa unità: prosegui alla pagina successiva per svolgere gli esercizi!", "#009900");
		inserisciStacco();
		inserisciTestoConRiquadroConclusivo("- hai imparato cosa è l'intersezione tra due insiemi\n\n"
				+ "- hai imparato cosa è l'unione tra due insiemi");
		return getAndroidView();
	}
}
