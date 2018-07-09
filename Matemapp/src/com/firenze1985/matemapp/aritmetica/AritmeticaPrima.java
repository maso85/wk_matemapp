/**
 * 
 */
package com.firenze1985.matemapp.aritmetica;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firenze1985.matemapp.AnnoScolastico;
import com.firenze1985.matemapp.Const;
import com.firenze1985.matemapp.MenuPrincipale;
import com.firenze1985.matemapp.R;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;

/**
 * @author Administrator
 *
 */
public class AritmeticaPrima extends AnnoScolastico {

	@Override
	public void setAttributi() {
		setMateria(Const.ARITMETICA);
		setAnnoScolastico(Const.CLASSE_PRIMA);
		setPackageClasse(Const.PACKAGE_ARITMETICA_CLASSE_PRIMA);
	}


}
