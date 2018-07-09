/**
 * 
 */
package com.firenze1985.matemapp.aritmetica;

import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.UnitaDidattica;
import com.firenze1985.matemapp.aritmetica.frazioni.PaginatoreFrazioni;

/**
 * @author Administrator
 *
 */
public class Frazioni extends UnitaDidattica {

	@Override
	public void setPaginatoreSpecifico() {
		setTabAdapter(new PaginatoreFrazioni(getSupportFragmentManager(), getApplicationContext(), findViewById(R.layout.viewpager_layout)));		
	}

}
