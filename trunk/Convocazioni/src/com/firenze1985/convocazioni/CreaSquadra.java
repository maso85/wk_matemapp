/**
 * 
 */
package com.firenze1985.convocazioni;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Daniele
 *
 */
public class CreaSquadra extends SquadraActivity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.creasquadra_layout);
		setTextIn((EditText) findViewById(R.id.idEditTextInserisciGiocatore));
		setContainer((LinearLayout) findViewById(R.id.idContenitoreElencoGiocatori));
		// ALERT MESSAGGIO SQUADRA SALVATA
		final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);

		// TEXTVIEW NUMERO GIOCATORI
		setNumeroGiocatori((TextView) findViewById(R.id.idTextViewNumeroGiocatori));
		aggiornaTextViewNumeroGiocatori();
		//
		
		// gestione bottone aggiungi giocatore
		setButtonAdd((Button) findViewById(R.id.idBottoneAggiungiGiocatore));
		getButtonAdd().setOnClickListener(aggiungiGiocatore());
		//
		
		// gestione bottone salva
		setButtonSalva((Button) findViewById(R.id.idBottoneSalva));
		getButtonSalva().setOnClickListener(salvaSquadra(builder1, false));
		//

	}
}
