/**
 * 
 */
package packageDatabase;

import android.provider.BaseColumns;

/**
 * Interfaccia da cui far estendere le proprie 'tabelle'
 * <br><br>
 * Esempio di interfaccia:<br>
 * String TABLE_NAME = "squadra";<br> 
 * String USERNAME_ADMIN = "usernameAdmin";<br>
 * String GIOCATORE = "giocatore";<br>
 * String[] COLUMNS = new String[]<br>
 * { _ID, USERNAME_ADMIN, GIOCATORE};<br>
 * 
 * @author A30G
 *
 */
public interface GenericInterface extends BaseColumns {

}
