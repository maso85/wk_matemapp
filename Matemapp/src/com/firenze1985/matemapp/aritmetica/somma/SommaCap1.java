/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.somma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firenze1985.matemapp.Argomento;
import com.firenze1985.matemapp.R;

/**
 * @author Administrator
 *
 */
public class SommaCap1 extends Argomento {
	String testoDaLeggere = "Sed ut perspiciatis unde omnis\niste natus error sit voluptatem accusantium doloremque laudantium";
	String testoDaLeggerep2 = ", totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo. Nemo enim ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt, neque porro quisquam est, qui dolorem ipsum, quia dolor sit, amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt, ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit, qui in ea voluptate velit esse, quam nihil molestiae consequatur, vel illum, qui dolorem eum fugiat, quo voluptas nulla pariatur? [33] At vero eos et accusamus et iusto odio dignissimos ducimus, qui blanditiis praesentium voluptatum deleniti atque corrupti, quos dolores et quas molestias excepturi sint, obcaecati cupiditate non provident, similique sunt in culpa, qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio, cumque nihil impedit, quo minus id, quod maxime placeat, facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet, ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat. ";
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View android = inflater.inflate(R.layout.argomento_layout, container, false);
        LinearLayout linear = (LinearLayout)android.findViewById(R.id.idLinearLayoutArgomento);
        
        
        ((TextView)android.findViewById(R.id.idTestoFragment)).setText(testoDaLeggere);
        
        inserisciTesto(linear,"sono nel capitolo della somma");
        inserisciTesto(linear,"e quindi vedo un capitolo diverso");
       
        return android;
	}
	
	public SommaCap1() {
	}
	
	public SommaCap1(String stringaPassata) {
		new SommaCap1();
		//testoDaLeggere = stringaPassata;
	}

}
