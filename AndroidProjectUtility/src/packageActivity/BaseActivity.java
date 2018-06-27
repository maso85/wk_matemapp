/**
 * 
 */
package packageActivity;


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
	
}
