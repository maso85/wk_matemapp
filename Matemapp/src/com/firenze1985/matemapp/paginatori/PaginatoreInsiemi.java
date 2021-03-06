/**
 * 
 */
package com.firenze1985.matemapp.paginatori;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap1;
import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap2;
import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap3;
import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap4;
import com.firenze1985.matemapp.aritmetica.insiemi.InsiemiCap5;

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
	        return new InsiemiCap5();	    
	    }
		return null;

	}

}
