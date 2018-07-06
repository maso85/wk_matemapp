/**
 * 
 */
package com.firenze1985.matemapp;

import com.firenze1985.matemapp.aritmetica.frazioni.FrazioniCap1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * @author Administrator
 *
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {

	public TabPagerAdapter(FragmentManager fm) {
		super(fm);
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
            return new FrazioniCap1("cap "+i);
        case 2:
            return new FrazioniCap1("cap "+i);
	    case 3:
	        return new FrazioniCap1("cap "+i);
	    case 4:
	        return new FrazioniCap1("cap "+i);
	    case 5:
	        return new FrazioniCap1("cap "+i);
	    }
		return null;

	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 6;
	}

}
