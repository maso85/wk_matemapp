/**
 * 
 */
package com.firenze1985.convocazioni;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import packageUtility.GenericActivityUtility;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.firenze1985.db.DatabaseHelper;

/**
 * @author Daniele
 *
 */
public class EliminaSquadra extends GenericActivity {


	/* *********************************** OVERRIDE OBBLIGATORI ************************************ */	
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
	/* *********************************************************************************************** */


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setSuperParameter();
		// ALERT MESSAGGIO RICHIESTA CONFERMA ELIMINAZIONE
	    final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);

		// ALERT MESSAGGIO RICHIESTA CONFERMA ELIMINAZIONE
	    final AlertDialog.Builder builder2 = new AlertDialog.Builder(this);

	    final String nomeSquadraString = getIntent().getStringExtra("nomeSquadraString");
		setCurrentActivity(this);
		builder1.setMessage("Conferma eliminazione squadra?");
        builder1.setCancelable(true);
        builder1.setPositiveButton("Elimina", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
        		DatabaseHelper databaseHelper = new DatabaseHelper(getApplicationContext());
        		boolean eliminaSquadraBoolean = databaseHelper.eliminaSquadra(nomeSquadraString);
        		if (eliminaSquadraBoolean){
        			builder2.setMessage("Squadra eliminata con successo");
        			builder2.setNeutralButton("Ok",  GenericActivityUtility.whenPressOkNeutralButton(getApplicationContext(), getCurrentActivity(), getMainActivity()));
        			AlertDialog alert22 = builder2.create();
    		        alert22.show();
        		}

            }
        });
        
        builder1.setNegativeButton("Annulla", GenericActivityUtility.whenPressCancelNegativeButton());     

        AlertDialog alert11 = builder1.create();
        alert11.show();

	}

}
