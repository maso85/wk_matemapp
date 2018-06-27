/**
 * 
 */
package com.firenze1985.convocazioni;

import java.util.List;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * @author Daniele
 *
 */
public class VisualizzaSquadra extends GenericActivity {

	/* ********************************** OVERRIDE OBBLIGATORI *************************************** */
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
	/* ********************************************************************************************** */
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.visualizzasquadra_layout);

		List<String> listaStringheRecuperate = getIntent()
				.getStringArrayListExtra("listaStringheRecuperate");

		final List<String> listaPerAdapter = listaStringheRecuperate;
		ListView listaView = (ListView) findViewById(R.id.listView1);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.rowvisualizza, R.id.idGiocatoreVisualizzato,
				listaPerAdapter);
		listaView.setAdapter(adapter);
	}

}
