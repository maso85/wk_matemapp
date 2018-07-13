/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.unitadidattiche;

import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.UnitaDidattica;
import com.firenze1985.matemapp.paginatori.PaginatoreInsiemi;
import com.firenze1985.matemapp.utility.Const;

/**
 * @author Administrator
 *
 */
public class Insiemi extends UnitaDidattica {

	/* (non-Javadoc)
	 * @see com.firenze1985.matemapp.UnitaDidattica#setPaginatoreSpecifico()
	 */
	@Override
	public void setPaginatoreSpecifico() {
		setUnitaDidatticaConEserciziFinali(false);
		
		setTabAdapter(new PaginatoreInsiemi(getSupportFragmentManager(), getApplicationContext(), findViewById(R.layout.viewpager_layout), Const.NUMERO_PAGINE_INSIEMI));
	}

}
