/**
 * 
 */
package com.firenze1985.matemapp.aritmetica;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firenze1985.matemapp.Const;
import com.firenze1985.matemapp.MenuPrincipale;
import com.firenze1985.matemapp.R;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;

/**
 * @author Administrator
 *
 */
public class AritmeticaPrima extends GenericActivity {

	/* ******************************** OVERRIDE OBBLIGATORI *****************************************************/
	@Override
	public void setMainActivity(Class arg0) {
		this.mainActivity = arg0;
	}

	@Override
	public void setCurrentActivity(BaseActivity arg0) {
		this.currentActivity = arg0;
	}	
	
	@Override
	public void setSuperParameter() {
		setMainActivity(MenuPrincipale.class);
		setCurrentActivity(this);
	}
	/* ************************************************************************************************************/

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.unitadidatticaprincipale_layout);	
		
		/* ***********creazione lista scrollabile con elenco di unita didattiche  ********/
		// definisco un ArrayList  
        final ArrayList <String> listp = new ArrayList<String>();  
        for (int i = 0; i < Const.ARGOMENTI_ARITMETICA_PRIMA.length; ++i) {  
             listp.add(Const.ARGOMENTI_ARITMETICA_PRIMA[i]);  
        }  
		// recupero la lista dal layout  
        final ListView listaArgomenti = (ListView) findViewById(R.id.idListaUnitaDidattica);  
  
        // creo e istruisco l'adattatore  
        final ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listp);  
  
        // inietto i dati  
        listaArgomenti.setAdapter(adapter);
        listaArgomenti.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        	
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				int esimaUnitaDidattica = position;
				String stringUnitaDidattica = (String) listaArgomenti.getItemAtPosition(esimaUnitaDidattica);
				// si lancia la activity corrispondente alla unita didattica selezionata
				Class activityClass = null;
				try {
					activityClass = Class.forName("com.firenze1985.matemapp.aritmetica."+stringUnitaDidattica);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Intent intent = new Intent(getApplicationContext(), activityClass);
				startActivity(intent);			
				}
			}
		
        );

		/* ******************************************************************************/
	}
		

}
