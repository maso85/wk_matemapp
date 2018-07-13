/**
 * 
 */
package com.firenze1985.matemapp.geometria;

import com.firenze1985.matemapp.AnnoScolastico;
import com.firenze1985.matemapp.utility.Const;

/**
 * @author Administrator
 *
 */
public class GeometriaPrima extends AnnoScolastico {

	/* (non-Javadoc)
	 * @see com.firenze1985.matemapp.AnnoScolastico#setAttributi()
	 */
	@Override
	public void setAttributi() {
		setMateria(Const.GEOMETRIA);
		setAnnoScolastico(Const.CLASSE_PRIMA);
		setPackageClasse(Const.PACKAGE_GEOMETRIA_CLASSE_PRIMA);
	}

}
