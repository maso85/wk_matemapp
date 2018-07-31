/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.unitadidattiche;

import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.UnitaDidattica;
import com.firenze1985.matemapp.paginatori.PaginatoreOperazioni;
import com.firenze1985.matemapp.utility.Const;

/**
 * @author Administrator
 *
 */
public class Operazioni extends UnitaDidattica {

	/* (non-Javadoc)
	 * @see com.firenze1985.matemapp.UnitaDidattica#setPaginatoreSpecifico()
	 */
	@Override
	public void setPaginatoreSpecifico() {
		// questa unita didattica contiene una pagina finale con esercizi
		setUnitaDidatticaConEserciziFinali(true);				
		setTabAdapter(new PaginatoreOperazioni(getSupportFragmentManager(), getApplicationContext(), findViewById(R.layout.viewpager_layout),Const.NUMERO_PAGINE_OPERAZIONI));		
	}


}
