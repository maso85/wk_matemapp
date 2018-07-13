/**
 * 
 */
package com.firenze1985.matemapp.paginatori;

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
	int numeroPagine;
	
	
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

	
	
	
	/**
	 * @return the numeroPagine
	 */
	public int getNumeroPagine() {
		return numeroPagine;
	}

	/**
	 * @param numeroPagine the numeroPagine to set
	 */
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public PaginatoreGenerico(FragmentManager fm, Context contesto, View layoutDiPagina, int numPagine) {
		super(fm);
		setContesto(contesto);
		setLayoutDiPagina(layoutDiPagina);
		setNumeroPagine(numPagine);
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
		return getNumeroPagine();
	}

}
