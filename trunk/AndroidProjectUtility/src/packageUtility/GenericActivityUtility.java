/**
 * 
 */
package packageUtility;

import packageActivity.BaseActivity;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/**
 * Classe che estende Activity e che ha alcune funzionalita' legate ad essa.
 * @author A30G
 *
 */
public class GenericActivityUtility {

	/**
	 * metodo per gestire la pressione sul pulsante 'ok' di un messaggio neutrale, del tipo:<br><br>
	 * Squadra salvata con successo<br>
	 * -------------OK----------------<br><br>
	 * @param applicationContext
	 * @param clazz
	 * @return
	 */
	public static DialogInterface.OnClickListener whenPressOkNeutralButton(final Context applicationContext, final BaseActivity act, final Class clazz) {
		DialogInterface.OnClickListener dialog = new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
					Intent intent = new Intent(applicationContext, clazz);
					act.startActivity(intent);
	            }
		};		
		return dialog;
	}
	
	/**
	 * metodo per gestire la pressione sul pulsante 'annulla' di un messaggio negativo, del tipo:<br><br>
	 * Conferma eliminazione squadra?<br>
	 * ---ANNULLA-----CONFERMA---<br><br>
	 * @return
	 */
	public static DialogInterface.OnClickListener whenPressCancelNegativeButton() {
		DialogInterface.OnClickListener dialog = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
		};
		return dialog;
        
	}
}
