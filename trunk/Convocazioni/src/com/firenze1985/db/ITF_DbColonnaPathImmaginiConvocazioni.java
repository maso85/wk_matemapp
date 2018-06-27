/**
 * 
 */
package com.firenze1985.db;

import android.provider.BaseColumns;

/**
 * @author Daniele
 *
 */
public interface ITF_DbColonnaPathImmaginiConvocazioni extends BaseColumns {
	String TABLE_NAME = "pathImmaginiConvocazioni";

	String USERNAME_ADMIN = "usernameAdmin";
	String PATH_IMMAGINE = "pathImmagine";

	String[] COLUMNS = new String[] { _ID, USERNAME_ADMIN, PATH_IMMAGINE };

}
