/**
 * 
 */
package com.firenze1985.matemapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

import com.firenze1985.matemapp.utility.Const;
import com.firenze1985.matemapp.utility.MatemappUtility;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;

/**
 * @author Administrator
 *
 */
public class LavoriInCorso extends GenericActivity {

	@Override
	public void setMainActivity(Class arg0) {
		this.mainActivity = arg0;
	}

	@Override
	public void setCurrentActivity(BaseActivity arg0) {
		this.currentActivity = arg0;
	}

	@Override
	public void setSuperParameter() {
		Intent intent = getIntent();
		setMainActivity(MatemappUtility.preparaClassePerTornaIndietro(intent));
		setCurrentActivity(this);
		setColorActionBar(Const.ACTION_BAR);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.lavoriincorso_layout);	
		
	}
	
}
