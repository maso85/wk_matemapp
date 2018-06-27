/**
 * 
 */
package packageUtility;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

/**
 * @author A30G
 *
 */
public class UtilitySharingFile extends Activity{

	/**
	 * Metodo per la gestione del pulsante 'condividi con'.<br>
	 * 
	 * @param menu
	 * @param intIdMenu
	 * @param intIdItemShare
	 * @param stringType
	 * @param uriFileImage
	 */
	public static void shareFileWith(Menu menu, MenuInflater menuInflater, int intIdMenu, int intIdItemShare, String stringType, Uri uriFileImage) {		
		menuInflater.inflate(intIdMenu, menu);
	
		MenuItem shareItem = (MenuItem) menu.findItem(intIdItemShare);
		
		ShareActionProvider mShare = (ShareActionProvider) shareItem.getActionProvider();
		
		Intent shareIntent = new Intent(Intent.ACTION_SEND);
		shareIntent.setAction(Intent.ACTION_SEND);
		shareIntent.setType("image/jpeg");
		shareIntent.putExtra(Intent.EXTRA_STREAM,uriFileImage);
		
		mShare.setShareIntent(shareIntent);
	}
}
