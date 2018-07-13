/**
 * 
 */
package com.firenze1985.matemapp.aritmetica;

import packageActivity.BaseActivity;
import android.view.WindowManager;

import com.firenze1985.matemapp.Materia;
import com.firenze1985.matemapp.MenuPrincipale;

/**
 * @author Administrator
 *
 */
public class AritmeticaPrincipale extends Materia {

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
		setClassePrima(AritmeticaPrima.class);
		setClasseSeconda(AritmeticaSeconda.class);
		setClasseTerza(AritmeticaTerza.class);
	}
	/* ************************************************************************************************************/
		
	
	

	

}
