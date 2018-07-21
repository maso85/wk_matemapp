/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.unitadidattiche;

import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.UnitaDidattica;
import com.firenze1985.matemapp.paginatori.PaginatoreNumNaturali;
import com.firenze1985.matemapp.utility.Const;

/**
 * @author Administrator
 *
 */
public class NumNaturali extends UnitaDidattica {
	/* (non-Javadoc)
	 * @see com.firenze1985.matemapp.UnitaDidattica#setPaginatoreSpecifico()
	 */
	@Override
	public void setPaginatoreSpecifico() {
		setUnitaDidatticaConEserciziFinali(true);
		
		setTabAdapter(new PaginatoreNumNaturali(getSupportFragmentManager(), getApplicationContext(), findViewById(R.layout.viewpager_layout), Const.NUMERO_PAGINE_NUMNATURALI));
	}
}
