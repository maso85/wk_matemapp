/**
 * 
 */
package com.firenze1985.matemapp;

import packageActivity.MyFragmentActivity;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.firenze1985.matemapp.paginatori.PaginatoreGenerico;
import com.firenze1985.matemapp.utility.Const;

/**
 * @author Administrator
 *
 */
public abstract class UnitaDidattica extends MyFragmentActivity {

	/* ******************************** OVERRIDE OBBLIGATORI *****************************************************/
	@Override
	public void setMainActivity(Class arg0) {
		this.mainActivity = arg0;
	}

	@Override
	public void setCurrentActivity(MyFragmentActivity arg0) {
		this.currentActivity = arg0;
	}	
	
	@Override
	public void setSuperParameter() {
		setMainActivity(MenuPrincipale.class);
		setCurrentActivity(this);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(Const.ACTION_BAR)));		
		//this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
	/* ************************************************************************************************************/


	ViewPager Tab;
    PaginatoreGenerico TabAdapter;
	ActionBar myActionBar;
	boolean unitaDidatticaConEserciziFinali;
	
    @SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSuperParameter();
        setContentView(R.layout.viewpager_layout);

        setPaginatoreSpecifico();

        Tab = (ViewPager)findViewById(R.id.pager);
        Tab.addOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {

                    	myActionBar = getActionBar();
                    	myActionBar.setSelectedNavigationItem(position);                    }
                });
        Tab.setAdapter(TabAdapter);

        myActionBar = getActionBar();
        //Enable Tabs on Action Bar
        myActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
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
			for (int i = 0; i < TabAdapter.getCount(); i++) {
				int numeroPagina = i + 1;
				// se la unita didattica NON contiene esercizi finali, anche l'ultima pagina e' una pagina classica e viene titolata in modo standard
				if (unitaDidatticaConEserciziFinali && i == TabAdapter.getCount() - 1) {
					myActionBar.addTab(myActionBar.newTab().setText("esercizi").setTabListener(tabListener));	
				} else {
					myActionBar.addTab(myActionBar.newTab().setText("pagina "+numeroPagina).setTabListener(tabListener));
				}
			}
    }
    
    public abstract void setPaginatoreSpecifico();


	/**
	 * @return the tab
	 */
	public ViewPager getTab() {
		return Tab;
	}

	/**
	 * @param tab the tab to set
	 */
	public void setTab(ViewPager tab) {
		Tab = tab;
	}

	/**
	 * @return the tabAdapter
	 */
	public PaginatoreGenerico getTabAdapter() {
		return TabAdapter;
	}

	/**
	 * @param tabAdapter the tabAdapter to set
	 */
	public void setTabAdapter(PaginatoreGenerico tabAdapter) {
		TabAdapter = tabAdapter;
	}
	
	/**
	 * @return the unitaDidatticaConEserciziFinali
	 */
	public boolean isUnitaDidatticaConEserciziFinali() {
		return unitaDidatticaConEserciziFinali;
	}

	/**
	 * @param unitaDidatticaConEserciziFinali the unitaDidatticaConEserciziFinali to set
	 */
	public void setUnitaDidatticaConEserciziFinali(
			boolean unitaDidatticaConEserciziFinali) {
		this.unitaDidatticaConEserciziFinali = unitaDidatticaConEserciziFinali;
	}

	/**
	 * @return the actionBar
	 */
	public ActionBar getMyActionBar() {
		return myActionBar;
	}

	/**
	 * @param actionBar the actionBar to set
	 */
	public void setMyActionBar(ActionBar myActionBar) {
		this.myActionBar = myActionBar;
	}

}
