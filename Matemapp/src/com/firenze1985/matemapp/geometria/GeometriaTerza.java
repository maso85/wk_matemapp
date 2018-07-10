/**
 * 
 */
package com.firenze1985.matemapp.geometria;

import com.firenze1985.matemapp.AnnoScolastico;
import com.firenze1985.matemapp.Const;

/**
 * @author Administrator
 *
 */
public class GeometriaTerza extends AnnoScolastico {

	/* (non-Javadoc)
	 * @see com.firenze1985.matemapp.AnnoScolastico#setAttributi()
	 */
	@Override
	public void setAttributi() {
		setMateria(Const.GEOMETRIA);
		setAnnoScolastico(Const.CLASSE_TERZA);
		setPackageClasse(Const.PACKAGE_GEOMETRIA_CLASSE_TERZA);
	}

}
