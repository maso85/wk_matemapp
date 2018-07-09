/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.frazioni;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.firenze1985.matemapp.PaginatoreGenerico;

/**
 * @author Administrator
 *
 */
public class PaginatoreFrazioni extends PaginatoreGenerico {

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

	
	
	public PaginatoreFrazioni(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	
	public PaginatoreFrazioni(FragmentManager fm, Context contesto, View layoutDiPagina) {
		super(fm);
		setContesto(contesto);
		setLayoutDiPagina(layoutDiPagina);
		// TODO Auto-generated constructor stub
	}

}
