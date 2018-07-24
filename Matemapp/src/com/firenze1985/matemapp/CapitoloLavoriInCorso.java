/**
 * 
 */
package com.firenze1985.matemapp;

import java.util.HashMap;
import java.util.List;

import packageActivity.BaseActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.firenze1985.matemapp.utility.Const;
import com.firenze1985.matemapp.utility.MatemappUtility;

/**
 * @author Administrator
 *
 */
public class CapitoloLavoriInCorso extends Capitolo {
	View androidView;
		
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        setAndroidView(inflater.inflate(R.layout.lavoriincorso_layout, container, false));
        return getAndroidView();
	}
}
