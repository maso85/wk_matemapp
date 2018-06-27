/**
 * 
 */
package com.firenze1985.db;

import android.provider.BaseColumns;

/**
 * @author Daniele
 *
 */
public interface ITF_DbColonnaUtenze extends BaseColumns {
	String TABLE_NAME = "utenze";

	String USERNAME_ADMIN = "usernameAdmin";
	String PASSWORD_ADMIN = "passwordAdmin";
	String USERNAME_GENITORE = "usernameGenitore";
	String PASSWORD_GENITORE = "passwordGenitore";

	String[] COLUMNS = new String[] { _ID, USERNAME_ADMIN, PASSWORD_ADMIN,
			USERNAME_GENITORE, PASSWORD_GENITORE };

}
