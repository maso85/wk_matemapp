/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.somma;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.firenze1985.matemapp.PaginatoreGenerico;

/**
 * @author Administrator
 *
 */
public class PaginatoreSomma extends PaginatoreGenerico {

	
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


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 8;
	}


	
	
	public PaginatoreSomma(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	
	public PaginatoreSomma(FragmentManager fm, Context contesto, View layoutDiPagina) {
		super(fm);
		setContesto(contesto);
		setLayoutDiPagina(layoutDiPagina);
		// TODO Auto-generated constructor stub
	}
}
