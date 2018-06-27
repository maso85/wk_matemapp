/**
 * 
 */
package com.firenze1985.db;

import java.text.MessageFormat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author Daniele
 *
 */
public class DatabaseHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "devAPP.db";

	private static final int SCHEMA_VERSION = 1;

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, SCHEMA_VERSION);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite
	 * .SQLiteDatabase)
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {

		// TABELLA SQUADRA
		String sql1 = "CREATE TABLE {0} ({1} INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ " {2} TEXT NOT NULL,{3} TEXT NOT NULL);";
		db.execSQL(MessageFormat.format(sql1, ITF_DbColonnaSquadra.TABLE_NAME,
				ITF_DbColonnaSquadra._ID, ITF_DbColonnaSquadra.USERNAME_ADMIN,
				ITF_DbColonnaSquadra.GIOCATORE));
		
		// TABELLA PATH IMMAGINE
		String sql2 = "CREATE TABLE {0} ({1} INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ " {2} TEXT NOT NULL,{3} TEXT NOT NULL);";
		db.execSQL(MessageFormat.format(sql1, ITF_DbColonnaPathImmaginiConvocazioni.TABLE_NAME,
				ITF_DbColonnaPathImmaginiConvocazioni._ID, ITF_DbColonnaPathImmaginiConvocazioni.USERNAME_ADMIN,
				ITF_DbColonnaPathImmaginiConvocazioni.PATH_IMMAGINE));


	}

	public void inserisciSquadra(SQLiteDatabase db, String usernameAdmin,
			String giocatore) {
		ContentValues v = new ContentValues();
		v.put(ITF_DbColonnaSquadra.USERNAME_ADMIN, usernameAdmin);
		v.put(ITF_DbColonnaSquadra.GIOCATORE, giocatore);
		db.insert(ITF_DbColonnaSquadra.TABLE_NAME, null, v);
	}

	public void inserisciPathImmagine(SQLiteDatabase db, String usernameAdmin, String pathImmagine) {
		ContentValues v = new ContentValues();
		v.put(ITF_DbColonnaPathImmaginiConvocazioni.USERNAME_ADMIN, usernameAdmin);
		v.put(ITF_DbColonnaPathImmaginiConvocazioni.PATH_IMMAGINE, pathImmagine);
		db.insert(ITF_DbColonnaPathImmaginiConvocazioni.TABLE_NAME, null, v);
	}
	
	public Cursor getSquadra() {
		return (getReadableDatabase().query(ITF_DbColonnaSquadra.TABLE_NAME,
				ITF_DbColonnaSquadra.COLUMNS, null, null, null, null, null));
	}


	public Cursor getSquadra(String string) {
		return (getReadableDatabase().query(ITF_DbColonnaSquadra.TABLE_NAME,
				ITF_DbColonnaSquadra.COLUMNS,
				ITF_DbColonnaSquadra.USERNAME_ADMIN + " = '" + string + "'",
				null, null, null, ITF_DbColonnaSquadra.GIOCATORE));
	}

	public Cursor getElencoSquadre() {
		return (getReadableDatabase().query(true,
				ITF_DbColonnaSquadra.TABLE_NAME,
				new String[] { ITF_DbColonnaSquadra.USERNAME_ADMIN }, null,
				null, null, null, null, null));
	}

	public boolean eliminaSquadra(String squadra) {
		return (getReadableDatabase().delete(ITF_DbColonnaSquadra.TABLE_NAME,
				ITF_DbColonnaSquadra.USERNAME_ADMIN + " = '" + squadra + "'",
				null)) > 0;
	}

	public Cursor giocatoreInserito(String squadra, String giocatore) {
		return (getReadableDatabase().query(ITF_DbColonnaSquadra.TABLE_NAME,
				ITF_DbColonnaSquadra.COLUMNS,
				ITF_DbColonnaSquadra.USERNAME_ADMIN + " = '" + squadra + "'"
						+ " and " + ITF_DbColonnaSquadra.GIOCATORE + " = '"
						+ giocatore + "'", null, null, null,
				ITF_DbColonnaSquadra.GIOCATORE));
	}

	public Cursor getGiocatore(String giocatore) {
		return (getReadableDatabase().query(ITF_DbColonnaSquadra.TABLE_NAME,
				ITF_DbColonnaSquadra.COLUMNS,
				ITF_DbColonnaSquadra.GIOCATORE + " = '" + giocatore + "'", null, null, null,
				ITF_DbColonnaSquadra.GIOCATORE));
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite
	 * .SQLiteDatabase, int, int)
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
