/**
 * 
 */
package com.firenze1985.matemapp.paginatori;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.firenze1985.matemapp.aritmetica.somma.SommaCap1;

/**
 * @author Administrator
 *
 */
public class PaginatoreSomma extends PaginatoreGenerico {

	
	public PaginatoreSomma(FragmentManager fm, Context contesto,
			View layoutDiPagina, int numPagine) {
		super(fm, contesto, layoutDiPagina, numPagine);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see android.support.v4.app.FragmentStatePagerAdapter#getItem(int)
	 */
	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            return new SommaCap1();
        case 1:
            return new SommaCap1();
        case 2:
            return new SommaCap1();
	    case 3:
	        return new SommaCap1();
	    case 4:
	        return new SommaCap1();
	    case 5:
	        return new SommaCap1();
	    case 6:
	        return new SommaCap1();
	    case 7:
	        return new SommaCap1();
	        
	    }
		return null;

	}

}
