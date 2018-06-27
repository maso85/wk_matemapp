/**
 * 
 */
package com.firenze1985.convocazioni;

import java.io.File;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import packageUtility.UtilitySharingFile;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.ImageView;

/**
 * @author A30G
 *
 */
public class VisualizzaImmagine extends GenericActivity {
	
	/* ****************************** OVERRIDE OBBLIGATORI ***************************** */
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
		setMainActivity(MenuPrincipale.class);
		setCurrentActivity(this);
	}
	/* ********************************************************************************* */
	
	
	/* ***************************************** DICHIARAZIONE VARIABLI *********************** */
	ImageView immagine;
	Uri uriFileImmagine;
	/* **************************************************************************************** */
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.visualizzaimmagine_layout);
		
		//File file = (File) getIntent().getExtras().getParcelable("immagine");
		
		String stringaFile = ((File)getIntent().getExtras().get("immagine")).getPath();
		setImmagine((ImageView) findViewById(R.id.idVisualizzaImmagine));
		setUriFileImmagine(Uri.parse(stringaFile));
		getImmagine().setImageURI(getUriFileImmagine());
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		//replaces the default 'Back' button action  
        if(keyCode==KeyEvent.KEYCODE_BACK)  
        {  

               Intent intent = new Intent(this, VisualizzaConvocazioni.class);
               finish();
               startActivity(intent); 

        }  
        return true;  
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		UtilitySharingFile.shareFileWith(menu, getMenuInflater(), R.menu.visualizza_immagine, R.id.action_share, "image/jpeg", getUriFileImmagine());		
		return true;
	}
	
	/* ******************************************** GETTER E SETTER ************************************ */
	/**
	 * @return the immagine
	 */
	public ImageView getImmagine() {
		return immagine;
	}

	/**
	 * @param immagine the immagine to set
	 */
	public void setImmagine(ImageView immagine) {
		this.immagine = immagine;
	}

	/**
	 * @return the uriFileImmagine
	 */
	public Uri getUriFileImmagine() {
		return uriFileImmagine;
	}

	/**
	 * @param uriFileImmagine the uriFileImmagine to set
	 */
	public void setUriFileImmagine(Uri uriFileImmagine) {
		this.uriFileImmagine = uriFileImmagine;
	}
	/* ************************************************************************************************* */
	
}
