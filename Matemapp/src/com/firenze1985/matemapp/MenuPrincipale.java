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
import android.widget.Button;

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
	}
	/* ************************************************************************************** */
	
	
	/* ********************************* DICHIARAZIONE VARIABILI ***************************************** */
	Button buttonCreaSquadra;
	Button buttonCreaConvocazione;
	Button buttonModificaSquadra;
	Button buttonEliminaSquadra;
	Button buttonVisualizzaConvocazioni;
	/* ************************************************************************************************** */
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setSuperParameter();		
		setContentView(R.layout.menuprincipale_layout);	
		
		// gestione bottone crea squadra
		setButtonCreaSquadra((Button)findViewById(R.id.idBottoneCreaSquadra));
		getButtonCreaSquadra().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {			
				// si lancia la activity CreaSquadra
				//Intent intent = new Intent(getApplicationContext(), CreaSquadra.class);
	  			//startActivity(intent);			
				}			
			}
		);
		//
		
		
		// gestione bottone crea convocazione
		setButtonCreaConvocazione((Button)findViewById(R.id.idBottoneCreaConvocazione));
		getButtonCreaConvocazione().setOnClickListener(new OnClickListener(){			
			@Override
			public void onClick(View v) {			
				// si lancia la activity CreaConvocazione
				//Intent intent = new Intent(getApplicationContext(), SmistatoreMultiSquadra.class);
				//intent.putExtra("smistatoreIntent", CreaConvocazione.class);
				//startActivity(intent);
			}
		});
		//
		
		// gestione bottone modifica squadra
		setButtonModificaSquadra((Button)findViewById(R.id.idBottoneModificaSquadra));
		getButtonModificaSquadra().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {			
				// si lancia la activity ModificaSquadra
				//Intent intent = new Intent(getApplicationContext(), SmistatoreMultiSquadra.class);
				//intent.putExtra("smistatoreIntent", ModificaSquadra.class);
				//startActivity(intent);
			}
		});
		//
		
		
		// gestione bottone elimina squadra
		setButtonEliminaSquadra((Button)findViewById(R.id.idBottoneEliminaSquadra));
		getButtonEliminaSquadra().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {				
				// si lancia la activity EliminaSquadra
				//Intent intent = new Intent(getApplicationContext(), SmistatoreMultiSquadra.class);
				//intent.putExtra("smistatoreIntent", EliminaSquadra.class);
				//startActivity(intent);
			}
		});
		//
		
		
		// gestione bottone visualizza convocazioni
		setButtonVisualizzaConvocazioni((Button)findViewById(R.id.idBottoneVisualizzaConvocazioni));
		getButtonVisualizzaConvocazioni().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// si lancia la activity VisualizzaConvocazioni
				//Intent intent = new Intent(getApplicationContext(), VisualizzaConvocazioni.class);
	  			//startActivity(intent);				
			}			
		});
		//

	}
		


	
	/* ************************************* GETTER E SETTER ****************************************** */
	/**
	 * @return the buttonCreaSquadra
	 */
	public Button getButtonCreaSquadra() {
		return buttonCreaSquadra;
	}

	/**
	 * @param buttonCreaSquadra the buttonCreaSquadra to set
	 */
	public void setButtonCreaSquadra(Button buttonCreaSquadra) {
		this.buttonCreaSquadra = buttonCreaSquadra;
	}

	/**
	 * @return the buttonCreaConvocazione
	 */
	public Button getButtonCreaConvocazione() {
		return buttonCreaConvocazione;
	}

	/**
	 * @param buttonCreaConvocazione the buttonCreaConvocazione to set
	 */
	public void setButtonCreaConvocazione(Button buttonCreaConvocazione) {
		this.buttonCreaConvocazione = buttonCreaConvocazione;
	}

	/**
	 * @return the buttonModificaSquadra
	 */
	public Button getButtonModificaSquadra() {
		return buttonModificaSquadra;
	}

	/**
	 * @param buttonModificaSquadra the buttonModificaSquadra to set
	 */
	public void setButtonModificaSquadra(Button buttonModificaSquadra) {
		this.buttonModificaSquadra = buttonModificaSquadra;
	}

	/**
	 * @return the buttonEsci
	 */
	public Button getButtonVisualizzaConvocazioni() {
		return buttonVisualizzaConvocazioni;
	}

	/**
	 * @param buttonEsci the buttonEsci to set
	 */
	public void setButtonVisualizzaConvocazioni(Button buttonVisualizzaConvocazioni) {
		this.buttonVisualizzaConvocazioni = buttonVisualizzaConvocazioni;
	}

	/**
	 * @return the buttonEliminaSquadra
	 */
	public Button getButtonEliminaSquadra() {
		return buttonEliminaSquadra;
	}
	
	/**
	 * @param buttonEliminaSquadra the buttonEliminaSquadra to set
	 */
	public void setButtonEliminaSquadra(Button buttonEliminaSquadra) {
		this.buttonEliminaSquadra = buttonEliminaSquadra;
	}
	/* ************************************************************************************************ */
	
}

