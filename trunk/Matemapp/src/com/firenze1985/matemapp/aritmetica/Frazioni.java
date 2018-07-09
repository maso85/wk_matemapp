/**
 * 
 */
package com.firenze1985.matemapp.aritmetica;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.firenze1985.matemapp.MenuPrincipale;
import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.TabPagerAdapter;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;

/**
 * @author Administrator
 *
 */
public class Frazioni extends FragmentActivity {
	ViewPager Tab;
    TabPagerAdapter TabAdapter;
	ActionBar actionBar;

    @SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);

        TabAdapter = new TabPagerAdapter(getSupportFragmentManager(), getApplicationContext(), findViewById(R.layout.viewpager_layout));

        Tab = (ViewPager)findViewById(R.id.pager);
        Tab.addOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {

                    	actionBar = getActionBar();
                    	actionBar.setSelectedNavigationItem(position);                    }
                });
        Tab.setAdapter(TabAdapter);

        actionBar = getActionBar();
        //Enable Tabs on Action Bar
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener tabListener = new ActionBar.TabListener(){





			@Override
			public void onTabSelected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
				Tab.setCurrentItem(tab.getPosition());
				
			}

			@Override
			public void onTabUnselected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTabReselected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
				// TODO Auto-generated method stub
				
			}};
			//Add New Tab
			actionBar.addTab(actionBar.newTab().setText("cap1").setTabListener(tabListener));
			actionBar.addTab(actionBar.newTab().setText("cap2").setTabListener(tabListener));
			actionBar.addTab(actionBar.newTab().setText("cap3").setTabListener(tabListener));
			actionBar.addTab(actionBar.newTab().setText("cap4").setTabListener(tabListener));
			actionBar.addTab(actionBar.newTab().setText("cap5").setTabListener(tabListener));
			actionBar.addTab(actionBar.newTab().setText("cap6").setTabListener(tabListener));

    }

}