/**
 * 
 */
package com.firenze1985.matemapp.paginatori;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.firenze1985.matemapp.CapitoloLavoriInCorso;
import com.firenze1985.matemapp.aritmetica.numnaturali.NumNaturaliCap1;
import com.firenze1985.matemapp.aritmetica.numnaturali.NumNaturaliCap2;
import com.firenze1985.matemapp.aritmetica.numnaturali.NumNaturaliCap3;

/**
 * @author Administrator
 *
 */
public class PaginatoreNumNaturali extends PaginatoreGenerico {

	public PaginatoreNumNaturali(FragmentManager fm, Context contesto,
			View layoutDiPagina, int numPagine) {
		super(fm, contesto, layoutDiPagina, numPagine);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.firenze1985.matemapp.paginatori.PaginatoreGenerico#getItem(int)
	 */
	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            return new NumNaturaliCap1();
        case 1:
            return new NumNaturaliCap2();
        case 2:
        	return new NumNaturaliCap3();
	    case 3:
	        return new CapitoloLavoriInCorso();
	    case 4:
	        return new CapitoloLavoriInCorso();	
	    case 5:
	        return new CapitoloLavoriInCorso();
	    }
		return null;

	}

}
