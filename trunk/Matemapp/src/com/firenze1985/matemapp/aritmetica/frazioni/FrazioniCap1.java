/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.frazioni;

import com.firenze1985.matemapp.Argomento;
import com.firenze1985.matemapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class FrazioniCap1 extends Argomento {
	
	String testoDaLeggere = "Sed ut perspiciatis unde omnis\niste natus error sit voluptatem accusantium doloremque laudantium";
	String testoDaLeggerep2 = ", totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo. Nemo enim ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt, neque porro quisquam est, qui dolorem ipsum, quia dolor sit, amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt, ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit, qui in ea voluptate velit esse, quam nihil molestiae consequatur, vel illum, qui dolorem eum fugiat, quo voluptas nulla pariatur? [33] At vero eos et accusamus et iusto odio dignissimos ducimus, qui blanditiis praesentium voluptatum deleniti atque corrupti, quos dolores et quas molestias excepturi sint, obcaecati cupiditate non provident, similique sunt in culpa, qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio, cumque nihil impedit, quo minus id, quod maxime placeat, facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet, ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat. ";
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View android = inflater.inflate(R.layout.argomento_layout, container, false);
        LinearLayout linear = (LinearLayout)android.findViewById(R.id.idLinearLayoutArgomento);
        
        
        //((TextView)android.findViewById(R.id.idTestoFragment)).setText(testoDaLeggere);
        inserisciTitolo(linear, "Le frazioni");
        inserisciTitoloParagrafo(linear,"Capitolo 1");
        inserisciStacco(linear);
        inserisciTestoConParteInGrassetto(linear,"\u00C8 possibile che, durante alcune lezioni di matematica, tu abbia già sentito parlare di questa parola strana: frazioni",109, 117);
        inserisciTesto(linear, "Ma che cosa è una frazione?");
        inserisciTesto(linear, "Tieni bene a mente questa frase:");
        String testoPersonalizzato = "una frazione è un modo alternativo di scrivere un numero decimale, ossia un numero con la virgola";
        inserisciTestoPersonalizzato(linear,testoPersonalizzato, true, true, 0, 0, true, false, 83, testoPersonalizzato.length(), false, false, 0, 0);
        inserisciStacco(linear);
        testoPersonalizzato = "Esatto. Proprio così. Una frazione non è altro che un numero ma scritto in una lingua differente.";
        inserisciTestoPersonalizzato(linear, testoPersonalizzato, false, false, 0, 0, true, false, 81, 87, false, false, 0, 0);
        /*
        inserisciTestoGrandezzaPersonalizzata(linear, "vediamo che combina grandezza a 14", TypedValue.COMPLEX_UNIT_DIP, 14, false);
        inserisciTestoConParteInGrassetto(linear,"Supercalifragilistichespiralidoso", 4, 5);
        inserisciStacco(linear);
        inserisciTestoGrandezzaPersonalizzata(linear, "vediamo che combina grandezza a 12", TypedValue.COMPLEX_UNIT_DIP, 12, false);
        inserisciTestoGrandezzaPersonalizzata(linear, "vediamo che combina grandezza a 13", TypedValue.COMPLEX_UNIT_DIP, 13, false);
        inserisciTestoGrandezzaPersonalizzata(linear, "vediamo che combina grandezza a 14", TypedValue.COMPLEX_UNIT_DIP, 14, false);
        inserisciTestoGrandezzaPersonalizzata(linear, "vediamo che combina grandezza a 15", TypedValue.COMPLEX_UNIT_DIP, 15, false);
        inserisciTestoGrandezzaPersonalizzata(linear, "vediamo che combina grandezza a 17", TypedValue.COMPLEX_UNIT_DIP, 17, true);
        */
        return android;
	}
	
	public FrazioniCap1() {
	}
	
	public FrazioniCap1(String stringaPassata) {
		new FrazioniCap1();
		//testoDaLeggere = stringaPassata;
	}
}