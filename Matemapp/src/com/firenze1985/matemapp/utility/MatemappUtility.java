/**
 * 
 */
package com.firenze1985.matemapp.utility;

import com.firenze1985.matemapp.MenuPrincipale;

import android.content.Intent;

/**
 * @author Administrator
 *
 */
public class MatemappUtility {
	public static Class<?> preparaClassePerTornaIndietro(Intent intent){
		Class<?> classe;
		String ob = (String) (intent.getExtras()).get("ClassePrecedente");
		try {
			classe = Class.forName("com.firenze1985.matemapp."+ob);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			classe = MenuPrincipale.class;
		}
		return classe;
	}
}
