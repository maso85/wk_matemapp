/**
 * 
 */
package com.firenze1985.matemapp;

import packageActivity.BaseActivity;
import packageActivity.MainActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;

import com.firenze1985.matemapp.aritmetica.AritmeticaPrincipale;
import com.firenze1985.matemapp.geometria.GeometriaPrincipale;

/**
 * @author Daniele
 *
 */
public class MenuPrincipale extends MainActivity {

	/* ***************************** OVERRIDE OBBLIGATORI ************************************ */
	@Override
	public void setIntMenuPrincipale(int arg0) {
		this.intMenuPrincipale = arg0;
	}

	@Override
	public void setIntVersioneApp(int arg0) {
		this.intVersioneApp = arg0;
	}

	@Override
	public void setCurrentActivity(BaseActivity arg0) {
		this.currentActivity = arg0;
	}

	@Override
	public void setSuperParameter() {
		setIntMenuPrincipale(R.menu.menu_principale);
		setIntVersioneApp(R.id.versione_app);
		setCurrentActivity(this);
		//this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
	/* ************************************************************************************** */
	
	
	/* ********************************* DICHIARAZIONE VARIABILI ***************************************** */
	Button buttonAritmetica;
	Button buttonGeometria;
	/* ************************************************************************************************** */
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setSuperParameter();		
		setContentView(R.layout.menuprincipale_layout);	
		
		// gestione bottone aritmetica
		setButtonAritmetica((Button)findViewById(R.id.idBottoneAritmetica));
		getButtonAritmetica().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {			
				// si lancia la activity AritmeticaPrincipale
				Intent intent = new Intent(getApplicationContext(), AritmeticaPrincipale.class);
				startActivity(intent);			
				}			
			}
		);
		//
		
		
		// gestione bottone geometria
		setButtonGeometria((Button)findViewById(R.id.idBottoneGeometria));
		getButtonGeometria().setOnClickListener(new OnClickListener(){			
			@Override
			public void onClick(View v) {			
				// si lancia la activity GeometriaPrincipale
				Intent intent = new Intent(getApplicationContext(), GeometriaPrincipale.class);
				startActivity(intent);
			}
		});
		//
		

	}
		


	
	/* ************************************* GETTER E SETTER ****************************************** */
	/**
	 * @return the buttonAritmetica
	 */
	public Button getButtonAritmetica() {
		return buttonAritmetica;
	}

	/**
	 * @param buttonAritmetica the buttonAritmetica to set
	 */
	public void setButtonAritmetica(Button buttonAritmetica) {
		this.buttonAritmetica = buttonAritmetica;
	}

	/**
	 * @return the buttonGeometria
	 */
	public Button getButtonGeometria() {
		return buttonGeometria;
	}

	/**
	 * @param buttonGeometria the buttonGeometria to set
	 */
	public void setButtonGeometria(Button buttonGeometria) {
		this.buttonGeometria = buttonGeometria;
	}


	/* ************************************************************************************************ */
	
}

