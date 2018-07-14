/**
 * 
 */
package com.firenze1985.matemapp.paginatori;

import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap1;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap2;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap3;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap4;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap5;
import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap6;
import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap1;
import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap2;
import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap3;
import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap4;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

/**
 * @author Administrator
 *
 */
public class PaginatoreInsiemi extends PaginatoreGenerico {

	public PaginatoreInsiemi(FragmentManager fm, Context contesto,
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
            return new InsiemiCap1();
        case 1:
            return new InsiemiCap2();
        case 2:
            return new InsiemiCap3();
	    case 3:
	        return new InsiemiCap4();
	    case 4:
	        return new InsiemiCap1();
	    case 5:
	        return new InsiemiCap1();
	    case 6:
            return new InsiemiCap1();
        case 7:
            return new InsiemiCap1();
        case 8:
            return new InsiemiCap1();
	    case 9:
	        return new InsiemiCap1();	    
	    }
		return null;

	}

}
