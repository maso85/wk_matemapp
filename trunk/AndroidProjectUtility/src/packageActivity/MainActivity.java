/**
 * 
 */
package packageActivity;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Attivita' del menu principale
 * @author A30G
 *
 */
public abstract class MainActivity extends BaseActivity {
	
	// variabili per la gestione del tasto 'Versione App' in alto a dx nella pagina del menu principale
	protected int intVersioneApp;
	protected int intMenuPrincipale;
	//
	
	/**
	 * metodo che gestisce la pressione sul pulsante 'indietro': fa uscire dall'applicazione
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		//replaces the default 'Back' button action  
        if(keyCode==KeyEvent.KEYCODE_BACK)  
        {  

        	// uscita dall'applicazione
			finish();
            System.exit(0);
        }  
        return true;  
	}
	
	
	/**
	 * metodo che crea il menu option
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(getIntMenuPrincipale(), menu);
		return true;		
	}
	
	
	/**
	 * metodo che gestisce gli eventi sul menu option, in particolare la gestione del pulsante 'versione app'
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);

		int id = item.getItemId();
		if (id == getIntVersioneApp()) {

			 
			PackageInfo pInfo;
			String version = "versione non disponibile";
			try {
				pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
				version = pInfo.versionName;
			} catch (NameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			builder1.setMessage("Versione corrente: "+version);
            builder1.setCancelable(true);
            builder1.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });

            AlertDialog alert11 = builder1.create();

            alert11.show();
		    // FINE ALERT
			 

			
			
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	
	
	
	
	
	
	
	/* ********************************* GETTER E SETTER *************************************** */
	
	/**
	 * @return the intVersioneApp
	 */
	public int getIntVersioneApp() {
		return intVersioneApp;
	}

	/**
	 * @param intVersioneApp the intVersioneApp to set
	 */
	public abstract void setIntVersioneApp(int intVersioneApp);

	/**
	 * @return the intMenuPrincipale
	 */
	public int getIntMenuPrincipale() {
		return intMenuPrincipale;
	}

	/**
	 * @param intMenuPrincipale the intMenuPrincipale to set
	 */
	public abstract void setIntMenuPrincipale(int intMenuPrincipale);
	
	/* *************************************************************************************** */

}
