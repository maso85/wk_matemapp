/**
 * 
 */
package com.firenze1985.convocazioni;

import java.util.Iterator;
import java.util.LinkedHashMap;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import packageUtility.GenericActivityUtility;
import android.app.AlertDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firenze1985.db.DatabaseHelper;

/**
 * Classe padre di CreaSquadra e ModificaSquadra, per accorpare e snellire il codice
 * @author A30G
 *
 */
public class SquadraActivity extends GenericActivity {

	/* ***************************** OVERRIDE OBBLIGATORI *********************************** */
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
	/* ************************************************************************************* */
	

	/* ***************************************** DICHIARAZIONE VARIABILI ******************************* */
	LinkedHashMap<String, TextView> textViewHashMap = new LinkedHashMap<String, TextView>();
	int contatore = 0;

	EditText textIn;
	Button buttonAdd;
	LinearLayout container;
	Button buttonSalva;
	Button buttonVisualizza;
	EditText nomeSquadra;
	TextView numeroGiocatori;
	/* ************************************************************************************************* */
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	
	
	/* ***************************** AGGIUNGI GIOCATORE *********************************/	
	protected OnClickListener aggiungiGiocatore() {
		OnClickListener onClick = new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				LayoutInflater layoutInflater = (LayoutInflater) getBaseContext()
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				final View addView = layoutInflater.inflate(R.layout.row, null);
				TextView textOut = (TextView) addView
						.findViewById(R.id.textout);
				textOut.setText(getTextIn().getText().toString());
				setContatore(getContatore() + 1);
				getTextIn().setText("");
			    getTextViewHashMap().put(textOut.getText().toString(), textOut);
				Button buttonRemove = (Button) addView
						.findViewById(R.id.idBottoneEliminaGiocatore);
				buttonRemove.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						TextView textOut = (TextView) addView
								.findViewById(R.id.textout);
						((LinearLayout) addView.getParent())
								.removeView(addView);
				    	getTextViewHashMap().remove(textOut.getText().toString());
						setContatore(getContatore() - 1);
						aggiornaTextViewNumeroGiocatori();
					}
				});

				getContainer().addView(addView);
				aggiornaTextViewNumeroGiocatori();
			}
		};
		
		return onClick;
	}
	/* ********************************************************************************** */
	
	
	/* *************************** SALVA SQUADRA *******************************/	
	public OnClickListener salvaSquadra(final AlertDialog.Builder builder1, final boolean modificaSquadra){
		OnClickListener onClick = new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Context context = getApplicationContext();
				DatabaseHelper databaseHelper = new DatabaseHelper(context);
				SQLiteDatabase db = databaseHelper.getWritableDatabase();

				boolean tuttoOk = false;
				// RECUPERO EDIT TEXT NOME SQUADRA
				setNomeSquadra((EditText) findViewById(R.id.idEditTextNomeSquadra));
				
				try {
					Iterator<String> iter = getTextViewHashMap().keySet().iterator();
					
					Log.d("LUNGHEZZA ITERATORE", iter.hasNext() + "");
					if (iter.hasNext() == false) {
						tuttoOk = false;
						builder1.setMessage(R.string.inserisci_almeno_un_giocatore);
						builder1.setCancelable(true);
						builder1.setNeutralButton("Ok", GenericActivityUtility.whenPressOkNeutralButton(getApplicationContext(), getCurrentActivity(), getCurrentActivity().getClass()));

						AlertDialog alert11 = builder1.create();
						alert11.show();
					}
					if (modificaSquadra) {
						// ELIMINAZIONE SQUADRA - NEL CICLO WHILE LA RICREIAMO EX NOVO
		        		boolean eliminaSquadraBoolean = databaseHelper.eliminaSquadra(getNomeSquadra().getText().toString());	
					}
					while (iter.hasNext()) {
						String key = iter.next();
						TextView esimo = (TextView) getTextViewHashMap().get(key);
						databaseHelper.inserisciSquadra(db, getNomeSquadra().getText().toString(), esimo.getText().toString());
					}

				} finally {
					db.close();
				}

				if (tuttoOk) {
					builder1.setMessage("Squadra salvata con successo");
					builder1.setCancelable(true);
					builder1.setNeutralButton("Ok", GenericActivityUtility.whenPressOkNeutralButton(getApplicationContext(), getCurrentActivity(), getMainActivity()));

					AlertDialog alert11 = builder1.create();
					alert11.show();
				}

			}
		};
		return onClick;
	}	
	/* *********************************************************************** */
	
	
	
	
	/* ************************** UTILITA *****************************/	
	/**
	 * metodo void per aggiornare la textView che mostra il numero dei giocatori che stiamo per salvare
	 * @param addView
	 */
	protected void aggiornaTextViewNumeroGiocatori() {
		getNumeroGiocatori().setText("Giocatori in rosa: "+getContatore());
	}	
	/* ************************************************************** */
	
	
	/* ******************************* GETTER E SETTER *************************************************/
	/**
	 * @return the textViewHashMap
	 */
	public LinkedHashMap<String, TextView> getTextViewHashMap() {
		return textViewHashMap;
	}

	/**
	 * @param textViewHashMap the textViewHashMap to set
	 */
	public void setTextViewHashMap(LinkedHashMap<String, TextView> textViewHashMap) {
		this.textViewHashMap = textViewHashMap;
	}

	/**
	 * @return the contatore
	 */
	public int getContatore() {
		return contatore;
	}

	/**
	 * @param contatore the contatore to set
	 */
	public void setContatore(int contatore) {
		this.contatore = contatore;
	}

	/**
	 * @return the textIn
	 */
	public EditText getTextIn() {
		return textIn;
	}

	/**
	 * @param textIn the textIn to set
	 */
	public void setTextIn(EditText textIn) {
		this.textIn = textIn;
	}

	/**
	 * @return the buttonAdd
	 */
	public Button getButtonAdd() {
		return buttonAdd;
	}

	/**
	 * @param buttonAdd the buttonAdd to set
	 */
	public void setButtonAdd(Button buttonAdd) {
		this.buttonAdd = buttonAdd;
	}

	/**
	 * @return the container
	 */
	public LinearLayout getContainer() {
		return container;
	}

	/**
	 * @param container the container to set
	 */
	public void setContainer(LinearLayout container) {
		this.container = container;
	}

	/**
	 * @return the buttonSalva
	 */
	public Button getButtonSalva() {
		return buttonSalva;
	}

	/**
	 * @param buttonSalva the buttonSalva to set
	 */
	public void setButtonSalva(Button buttonSalva) {
		this.buttonSalva = buttonSalva;
	}

	/**
	 * @return the buttonVisualizza
	 */
	public Button getButtonVisualizza() {
		return buttonVisualizza;
	}

	/**
	 * @param buttonVisualizza the buttonVisualizza to set
	 */
	public void setButtonVisualizza(Button buttonVisualizza) {
		this.buttonVisualizza = buttonVisualizza;
	}

	/**
	 * @return the nomeSquadra
	 */
	public EditText getNomeSquadra() {
		return nomeSquadra;
	}

	/**
	 * @param nomeSquadra the nomeSquadra to set
	 */
	public void setNomeSquadra(EditText nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	/**
	 * @return the numeroGiocatori
	 */
	public TextView getNumeroGiocatori() {
		return numeroGiocatori;
	}

	/**
	 * @param numeroGiocatori the numeroGiocatori to set
	 */
	public void setNumeroGiocatori(TextView numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}	
	/* ******************************************************************************** */

}
