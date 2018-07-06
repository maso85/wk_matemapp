/**
 * 
 */
package com.firenze1985.matemapp.aritmetica;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.firenze1985.matemapp.MenuPrincipale;
import com.firenze1985.matemapp.R;

/**
 * @author Administrator
 *
 */
public class AritmeticaPrincipale extends GenericActivity {

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
	
	/* ************************************ DICHIARAZIONE VARIABILI ******************************************/
	Button ButtonClassePrima;
	Button ButtonClasseSeconda;
	Button ButtonClasseTerza;
	/* ******************************************************************************************************/
	
	
	
	
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.materiaprincipale_layout);	
		
		// gestione bottone aritmetica
		setButtonClassePrima((Button)findViewById(R.id.idBottoneClassePrima));
		getButtonClassePrima().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {			
				// si lancia la activity AritmeticaPrincipale
				Intent intent = new Intent(getApplicationContext(), Frazioni.class);
				startActivity(intent);			
				}			
			}
		);
		//
				
					
	}
	
	/* ************************************ GETTER E SETTER *********************************************/
	/**
	 * @return the buttonClassePrima
	 */
	public Button getButtonClassePrima() {
		return ButtonClassePrima;
	}
	/**
	 * @param buttonClassePrima the buttonClassePrima to set
	 */
	public void setButtonClassePrima(Button buttonClassePrima) {
		ButtonClassePrima = buttonClassePrima;
	}
	/**
	 * @return the buttonClasseSeconda
	 */
	public Button getButtonClasseSeconda() {
		return ButtonClasseSeconda;
	}
	/**
	 * @param buttonClasseSeconda the buttonClasseSeconda to set
	 */
	public void setButtonClasseSeconda(Button buttonClasseSeconda) {
		ButtonClasseSeconda = buttonClasseSeconda;
	}
	/**
	 * @return the buttonClasseTerza
	 */
	public Button getButtonClasseTerza() {
		return ButtonClasseTerza;
	}
	/**
	 * @param buttonClasseTerza the buttonClasseTerza to set
	 */
	public void setButtonClasseTerza(Button buttonClasseTerza) {
		ButtonClasseTerza = buttonClasseTerza;
	}
	/* ***************************************************************************************************/

}
