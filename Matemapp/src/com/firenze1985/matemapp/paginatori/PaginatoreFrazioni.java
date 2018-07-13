/**
 * 
 */
package com.firenze1985.matemapp.paginatori;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap1;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap2;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap3;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap4;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap5;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap6;

/**
 * @author Administrator
 *
 */
public class PaginatoreFrazioni extends PaginatoreGenerico {

	public PaginatoreFrazioni(FragmentManager fm, Context contesto,
			View layoutDiPagina, int numPagine) {
		super(fm, contesto, layoutDiPagina, numPagine);
	}

	/* (non-Javadoc)
	 * @see android.support.v4.app.FragmentStatePagerAdapter#getItem(int)
	 */
	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            return new FrazioniCap1();
        case 1:
            return new FrazioniCap2();
        case 2:
            return new FrazioniCap3();
	    case 3:
	        return new FrazioniCap4();
	    case 4:
	        return new FrazioniCap5();
	    case 5:
	        return new FrazioniCap6();
	    }
		return null;

	}

}
