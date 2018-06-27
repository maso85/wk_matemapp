/**
 * 
 */
package packageDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Classe generica di databaseHelper
 * @author A30G
 *
 */
public abstract class DatabaseHelper extends SQLiteOpenHelper {

	
	private static final String DATABASE_NAME = "devAPP.db";

	private static final int SCHEMA_VERSION = 1;

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, SCHEMA_VERSION);
	}
	
	
	/**
	 * Questo metodo va sovrascritto nelle classi che ereditano DatabaseHelper. Questo e' un esempio di codice: <br>
	 * <i>
	 * <br>
	 * TABELLA SQUADRA <br>
		String sql1 = "CREATE TABLE {0} ({1} INTEGER PRIMARY KEY AUTOINCREMENT,"<br>
				+ " {2} TEXT NOT NULL,{3} TEXT NOT NULL);";<br>
		db.execSQL(MessageFormat.format(sql1, ITF_DbColonnaSquadra.TABLE_NAME,<br>
				ITF_DbColonnaSquadra._ID, ITF_DbColonnaSquadra.USERNAME_ADMIN,<br>
				ITF_DbColonnaSquadra.GIOCATORE));<br>
	 * <br>
	 * </i>
	 */
	@Override
	public abstract void onCreate(SQLiteDatabase db);


	@Override
	public abstract void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion);

}
