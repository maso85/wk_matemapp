/**
 * 
 */
package com.firenze1985.db;

import android.provider.BaseColumns;

/**
 * @author Daniele
 *
 */
public interface ITF_DbColonnaSquadra extends BaseColumns {
	String TABLE_NAME = "squadra";
	 
	String USERNAME_ADMIN = "usernameAdmin";
	String GIOCATORE = "giocatore";
 
	String[] COLUMNS = new String[]
	{ _ID, USERNAME_ADMIN, GIOCATORE};

}
