/**
 * 
 */
package packageActivity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

/**
 * Classe base da cui estendere tutte le attivita' del progetto
 * @author A30G
 *
 */
public abstract class GenericActivity extends BaseActivity {

	protected Class mainActivity;
	
	/**
	 * metodo che gestisce il pulsante 'indietro' che fa ritornare all'activity del menu principale, passata in input
	 * @param keyCode
	 * @param event
	 * @param clazz
	 * @return
	 */
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent main = new Intent(this,getMainActivity());
			main.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NO_HISTORY);
			startActivity(main);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	

	
	/* ********************************* GETTER E SETTER ************************************** */
	
	/**
	 * @return the mainActivity
	 */
	public Class getMainActivity() {
		return mainActivity;
	}

	/**
	 * @param mainActivity the mainActivity to set
	 */
	public abstract void setMainActivity(Class mainActivity);
	
	/* *************************************************************************************** */
	
	
}
