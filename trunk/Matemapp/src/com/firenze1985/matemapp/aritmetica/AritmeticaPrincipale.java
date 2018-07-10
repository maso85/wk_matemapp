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

import com.firenze1985.matemapp.Materia;
import com.firenze1985.matemapp.MenuPrincipale;
import com.firenze1985.matemapp.R;

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
		setClassePrima(AritmeticaPrima.class);
		setClasseSeconda(AritmeticaSeconda.class);
		setClasseTerza(AritmeticaTerza.class);
	}
	/* ************************************************************************************************************/
		
	
	

	

}
