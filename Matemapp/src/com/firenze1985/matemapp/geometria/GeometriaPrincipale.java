/**
 * 
 */
package com.firenze1985.matemapp.geometria;

import packageActivity.BaseActivity;

import com.firenze1985.matemapp.Materia;
import com.firenze1985.matemapp.MenuPrincipale;

/**
 * @author Administrator
 *
 */
public class GeometriaPrincipale extends Materia {

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
		setClassePrima(GeometriaPrima.class);
		setClasseSeconda(GeometriaSeconda.class);
		setClasseTerza(GeometriaTerza.class);
	}
	/* ************************************************************************************************************/
		
	
	

}
