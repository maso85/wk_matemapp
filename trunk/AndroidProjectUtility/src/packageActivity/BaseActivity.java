/**
 * 
 */
package packageActivity;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;


/**
 * Classe primitiva di Activity, da cui estendere la <b>MainActivity</b> e la <b>GenericActivity</b>
 * @author A30G
 *
 */
public abstract class BaseActivity extends android.app.Activity {
	
	protected BaseActivity currentActivity;
		
	public abstract void setSuperParameter();


	
	/* **************************************** GETTER E SETTER ********************************* */
	

	public BaseActivity getCurrentActivity() {
		return currentActivity;
	}

	public abstract void setCurrentActivity(BaseActivity currentActivity);
	
	/* ****************************************************************************************** */
	
	/* ************************ METODI ****************************/
	
	public void setColorActionBar(String colore) {
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(colore)));		
	}
	
	/* ************************************************************/
	
}
