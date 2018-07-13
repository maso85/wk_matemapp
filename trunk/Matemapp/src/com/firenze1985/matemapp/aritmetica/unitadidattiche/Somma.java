/**
 * 
 */
package com.firenze1985.matemapp.aritmetica.unitadidattiche;

import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.UnitaDidattica;
import com.firenze1985.matemapp.paginatori.PaginatoreSomma;
import com.firenze1985.matemapp.utility.Const;

/**
 * @author Administrator
 *
 */
public class Somma extends UnitaDidattica {

	@Override
	public void setPaginatoreSpecifico() {
		// questa unita didattica NON contiene una pagina finale con esercizi
		setUnitaDidatticaConEserciziFinali(false);		
		
		setTabAdapter(new PaginatoreSomma(getSupportFragmentManager(), getApplicationContext(), findViewById(R.layout.viewpager_layout),Const.NUMERO_PAGINE_SOMMA));		
	}

}
