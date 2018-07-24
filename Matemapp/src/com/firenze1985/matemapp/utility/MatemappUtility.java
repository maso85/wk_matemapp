/**
 * 
 */
package com.firenze1985.matemapp.utility;

import com.firenze1985.matemapp.MenuPrincipale;
import com.firenze1985.matemapp.aritmetica.AritmeticaPrincipale;
import com.firenze1985.matemapp.geometria.GeometriaPrincipale;

import android.content.Intent;

/**
 * @author Administrator
 *
 */
public class MatemappUtility {
	public static Class<?> preparaClassePerTornaIndietro(Intent intent){
		Class<?> classe;
		try {
			String ob = (String) (intent.getExtras()).get("ClassePrecedente");
			classe = Class.forName("com.firenze1985.matemapp."+ob);
		} catch (Exception e) {
			try {
				classe = recuperaClassePadre(intent);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				classe = MenuPrincipale.class;	
			}
			
		}
		return classe;
	}
	
	private static Class<?> recuperaClassePadre(Intent intent) {
		Class<?> classe;
		String stringaClasse = intent.getComponent().getClassName();
		if (	stringaClasse.contains("AritmeticaPrima") || 
				stringaClasse.contains("AritmeticaSeconda") ||
				stringaClasse.contains("AritmeticaTerza") 
			) {
			classe = AritmeticaPrincipale.class;
		} else if (	stringaClasse.contains("GeometriaPrima") || 
					stringaClasse.contains("GeometriaSeconda") ||
					stringaClasse.contains("GeometriaTerza") 
			) {
			classe = GeometriaPrincipale.class;
		} else {
			classe = MenuPrincipale.class;
		}
		return classe;
	}
}
