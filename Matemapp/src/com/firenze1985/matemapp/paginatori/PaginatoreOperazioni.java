/**
 * 
 */
package com.firenze1985.matemapp.paginatori;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.firenze1985.matemapp.CapitoloLavoriInCorso;
import com.firenze1985.matemapp.aritmetica.operazioni.OperazioniCap1;

/**
 * @author Administrator
 *
 */
public class PaginatoreOperazioni extends PaginatoreGenerico {
	
	public PaginatoreOperazioni(FragmentManager fm, Context contesto,
			View layoutDiPagina, int numPagine) {
		super(fm, contesto, layoutDiPagina, numPagine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            return new OperazioniCap1();
        case 1:
            return new CapitoloLavoriInCorso();
        case 2:
            return new CapitoloLavoriInCorso();
	    case 3:
	        return new CapitoloLavoriInCorso();
	    case 4:
	        return new CapitoloLavoriInCorso();
	    }
		return null;

	}
}
