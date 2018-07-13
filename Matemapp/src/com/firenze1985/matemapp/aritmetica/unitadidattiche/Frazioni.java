/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.unitadidattiche;

import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.UnitaDidattica;
import com.firenze1985.matemapp.paginatori.PaginatoreFrazioni;
import com.firenze1985.matemapp.utility.Const;

/**
 * @author Administrator
 *
 */
public class Frazioni extends UnitaDidattica {

	@Override
	public void setPaginatoreSpecifico() {
		// questa unita didattica contiene una pagina finale con esercizi
		setUnitaDidatticaConEserciziFinali(true);		

		setTabAdapter(new PaginatoreFrazioni(getSupportFragmentManager(), getApplicationContext(), findViewById(R.layout.viewpager_layout),Const.NUMERO_PAGINE_FRAZIONI));		
	}

}
