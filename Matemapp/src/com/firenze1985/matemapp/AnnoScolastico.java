/**
 * 
 */
package com.firenze1985.matemapp;

import java.util.ArrayList;

import com.firenze1985.matemapp.utility.Const;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * @author Administrator
 *
 */
public abstract class AnnoScolastico extends GenericActivity {

	
	String materia;
	String annoScolastico;
	String packageClasse;
	

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
		//this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setAttributi();
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
        String[] arrayRecuperato = recuperoArrayPerPaginatore(getMateria(), getAnnoScolastico());
        
        for (int i = 0; i < arrayRecuperato.length; ++i) {  
             listp.add(arrayRecuperato[i]);  
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
					activityClass = Class.forName(getPackageClasse()+stringUnitaDidattica);
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
	
	public abstract void setAttributi();

	
	public String[] recuperoArrayPerPaginatore(String materia, String annoScolastico) {
		String[] array = null;
		String materiaRecuperata = "";
		String annoScolasticoRecuperato = "";
		// recupero la materia scelta
		for (int i = 0; i < Const.MATERIA.length; i++) {
			if (Const.MATERIA[i] == materia) {
				materiaRecuperata = materia;
				break;
			}
		}
		
		// recupero l'anno scelto
		for (int i = 0; i < Const.ANNOSCOLASTICO.length; i++) {
			if (Const.ANNOSCOLASTICO[i] == annoScolastico) {
				annoScolasticoRecuperato = annoScolastico;
				break;
			}
		}
		
		// recupero il corretto array di stringhe
		if (materiaRecuperata == Const.ARITMETICA) {
			if (annoScolasticoRecuperato == Const.CLASSE_PRIMA) {
				array = Const.ARGOMENTI_ARITMETICA_PRIMA;
			} else if (annoScolasticoRecuperato == Const.CLASSE_SECONDA) {
				array = Const.ARGOMENTI_ARITMETICA_SECONDA;
			} else if (annoScolasticoRecuperato == Const.CLASSE_TERZA) {
				array = Const.ARGOMENTI_ARITMETICA_TERZA;
			}
		} else if (materiaRecuperata == Const.GEOMETRIA) {
			if (annoScolasticoRecuperato == Const.CLASSE_PRIMA) {
				array = Const.ARGOMENTI_GEOMETRIA_PRIMA;
			} else if (annoScolasticoRecuperato == Const.CLASSE_SECONDA) {
				array = Const.ARGOMENTI_GEOMETRIA_SECONDA;
			} else if (annoScolasticoRecuperato == Const.CLASSE_TERZA) {
				array = Const.ARGOMENTI_GEOMETRIA_TERZA;
			}
		}
		return array;
	}


	
	
	/* ************************************* GETTER E SETTER **************************************************/
	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
	}

	/**
	 * @return the annoScolastico
	 */
	public String getAnnoScolastico() {
		return annoScolastico;
	}

	/**
	 * @param annoScolastico the annoScolastico to set
	 */
	public void setAnnoScolastico(String annoScolastico) {
		this.annoScolastico = annoScolastico;
	}

	/**
	 * @return the packageClasse
	 */
	public String getPackageClasse() {
		return packageClasse;
	}

	/**
	 * @param packageClasse the packageClasse to set
	 */
	public void setPackageClasse(String packageClasse) {
		this.packageClasse = packageClasse;
	}
	
	
	/* ************************************************************************************************************/

}
