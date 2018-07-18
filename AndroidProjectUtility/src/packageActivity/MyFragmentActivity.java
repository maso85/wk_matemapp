/**
 * 
 */
package packageActivity;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;

/**
 * @author Administrator
 *
 */
public abstract class MyFragmentActivity extends FragmentActivity {
	protected MyFragmentActivity currentActivity;
	
	public abstract void setSuperParameter();


	
	/* **************************************** GETTER E SETTER ********************************* */
	

	public MyFragmentActivity getCurrentActivity() {
		return currentActivity;
	}

	public abstract void setCurrentActivity(MyFragmentActivity currentActivity);
	
	/* ****************************************************************************************** */

	
	
	
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
