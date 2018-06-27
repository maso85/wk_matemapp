/**
 * 
 */
package packageUtility;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;


/**
 * @author A30G
 *
 */
public class UtilityDate {

	/**
	 * Questo metodo trasforma una data da un formato di partenza a un formato di arrivo
	 * @param formatoDiPartenza
	 * @param formatoDiArrivo
	 * @param dataDiPartenza
	 * @author A30G
	 * @return
	 */
	public static String conversioneFormatoData(DateFormat formatoDiPartenza, DateFormat formatoDiArrivo, String dataDiPartenza) {
		// recupero la data in formato dd/MM/yyyy, la trasformo in yyyy/MM/dd e poi la inserisco in db
		Calendar cal = Calendar.getInstance();
		Date d = null;
		try {
			d = formatoDiPartenza.parse(dataDiPartenza);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cal.setTime(d);
		String dataDiArrivo = formatoDiArrivo.format(cal.getTime());
		return dataDiArrivo;
	}
}
