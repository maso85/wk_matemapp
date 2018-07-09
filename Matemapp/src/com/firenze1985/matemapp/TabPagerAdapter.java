/**
 * 
 */
package com.firenze1985.matemapp;

import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap1;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap2;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap3;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap4;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap5;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap6;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author Administrator
 *
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {

	Context contesto;
	View layoutDiPagina;
	
	public TabPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	public TabPagerAdapter(FragmentManager fm, Context contesto, View layoutDiPagina) {
		super(fm);
		setContesto(contesto);
		setLayoutDiPagina(layoutDiPagina);
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see android.support.v4.app.FragmentStatePagerAdapter#getItem(int)
	 */
	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            return new FrazioniCap1("cap "+i);
        case 1:
            return new FrazioniCap2("cap "+i);
        case 2:
            return new FrazioniCap3("cap "+i);
	    case 3:
	        return new FrazioniCap4("cap "+i);
	    case 4:
	        return new FrazioniCap5("cap "+i);
	    case 5:
	        return new FrazioniCap6("cap "+i);
	    }
		return null;

	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 6;
	}

	/**
	 * @return the contesto
	 */
	public Context getContesto() {
		return contesto;
	}

	/**
	 * @param contesto the contesto to set
	 */
	public void setContesto(Context contesto) {
		this.contesto = contesto;
	}
	/**
	 * @return the layoutDiPagina
	 */
	public View getLayoutDiPagina() {
		return layoutDiPagina;
	}
	/**
	 * @param layoutDiPagina the layoutDiPagina to set
	 */
	public void setLayoutDiPagina(View layoutDiPagina) {
		this.layoutDiPagina = layoutDiPagina;
	}

}
