/**
 * 
 */
package com.firenze1985.matemapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

/**
 * @author Administrator
 *
 */
public class PaginatoreGenerico extends FragmentStatePagerAdapter {

	
	Context contesto;
	View layoutDiPagina;

	
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

	
	
	
	public PaginatoreGenerico(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see android.support.v4.app.FragmentStatePagerAdapter#getItem(int)
	 */
	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see android.support.v4.view.PagerAdapter#getCount()
	 */
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
