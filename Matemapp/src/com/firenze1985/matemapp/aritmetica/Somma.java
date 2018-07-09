/**
 * 
 */
package com.firenze1985.matemapp.aritmetica;

import packageActivity.MyFragmentActivity;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.firenze1985.matemapp.MenuPrincipale;
import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.UnitaDidattica;
import com.firenze1985.matemapp.aritmetica.somma.PaginatoreSomma;

/**
 * @author Administrator
 *
 */
public class Somma extends UnitaDidattica {

	@Override
	public void setPaginatoreSpecifico() {
		setTabAdapter(new PaginatoreSomma(getSupportFragmentManager(), getApplicationContext(), findViewById(R.layout.viewpager_layout)));		
	}

}
