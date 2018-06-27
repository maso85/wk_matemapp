/**
 * 
 */
package com.firenze1985.convocazioni;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import packageUtility.GenericActivityUtility;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.firenze1985.db.DatabaseHelper;

/**
 * @author Daniele
 *
 */
public class CreaConvocazione extends GenericActivity {

	/* ***************************** OVERRIDE OBBLIGATORI ************************************* */	
	@Override
	public void setMainActivity(Class arg0) {
		this.mainActivity = arg0;
	}

	@Override
	public void setCurrentActivity(BaseActivity arg0) {
		this.currentActivity = arg0;
	}

	@Override
	public void setSuperParameter() {
		setMainActivity(MenuPrincipale.class);
		setCurrentActivity(this);
	}	
	/* **************************************************************************************** */
	
	
	/* ******************************** DICHIARAZIONE VARIABILI ******************************* */	
	TextView nomeAppVersione;
	Button buttonElencoConvocati;
	Button buttonInformazioniPartita;
	Button buttonSalvaConvocazione;
	int numeroGiocatori;	// variabile che serve nella creazione dell'immagine, in base al numero 'estendiamo' la seconda pagina

	// variabili per la gestione della data
	int anno, mese, giorno;
	static final int DIALOG_ID = 0;
	TextView dataVisualizzata;
	EditText dataEditText;
	//
	
	// variabili per la gestione degli orari
	EditText orarioPartita;
	EditText orarioConvocazione;
	//	
	/* *************************************************************************************** */

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.creaconvocazionescroll_layout);
		// ALERT MESSAGGIO CONVOCAZIONE SALVATA
		final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);

		// RECUPERO NOME SQUADRA CLICCATO COME CHILD DELLO SMISTATORE
		// MULTISQUADRA
		String nomeSquadraString = getIntent().getStringExtra(
				"nomeSquadraString");

		DatabaseHelper databaseHelper = new DatabaseHelper(this);

		// A PARTIRE DALLA SQUADRA CLICCATA, ESEGUIAMO LA QUERY E RECUPERIAMO
		// L'ELENCO DEI GIOCATORI DI TALE SQUADRA
		Cursor ccc = databaseHelper.getSquadra(nomeSquadraString);
		ArrayList<String> listaStringheRecuperate = new ArrayList<String>();
		
		// NASCONDO ICONA E NOME_APP_VERSIONE
		View layoutPagina = findViewById(R.id.idLayoutPaginaConvocazioni);
		layoutPagina.findViewById(R.id.idTextViewFinto).setVisibility(View.INVISIBLE);
		layoutPagina.findViewById(R.id.idTextViewNomeAppVersione).setVisibility(View.INVISIBLE);
		layoutPagina.findViewById(R.id.idImageViewIconaApp).setVisibility(View.INVISIBLE);
		//
		
		// questa variabile la usiamo dopo nel metodo 'combineImages'
		numeroGiocatori = 0;
		try {
			while (ccc.moveToNext()) {
				numeroGiocatori = numeroGiocatori + 1;
				String giocatore = ccc.getString(2);
				listaStringheRecuperate.add(giocatore);
				Log.d("devAPP", ccc.getString(0) + " " + ccc.getString(1) + " "
						+ ccc.getString(2));
			}
		} finally {
			ccc.close();
		}

		final List<String> listaPerAdapter = listaStringheRecuperate;
		GridView gridView = (GridView) findViewById(R.id.idGrigliaElencoConvocati);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.gridvisualizza, R.id.idGiocatoreVisualizzato,
				listaPerAdapter);
		gridView.setAdapter(adapter);

		// settaggio versione in fondo a seconda pagina		 
		PackageInfo pInfo;
		String version = "";
		try {
			pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
			version = "_v" + pInfo.versionName;
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setNomeAppVersione((TextView) findViewById(R.id.idTextViewNomeAppVersione));
		getNomeAppVersione().setText(getNomeAppVersione().getText() + version + " - Daniele Masini");
		
		// gestione data
		final Calendar cal = Calendar.getInstance();
		anno = cal.get(Calendar.YEAR);
		mese = cal.get(Calendar.MONTH);
		giorno = cal.get(Calendar.DAY_OF_MONTH);
		dataEditText = (EditText) findViewById(R.id.idEditTextDataPartita);
		
		dataEditText.setOnClickListener(
				new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
					showDialog(DIALOG_ID);
					}
				});
		//
		
		
		// gestione orari
		orarioPartita = (EditText) findViewById(R.id.idEditTextOrarioPartita);
		orarioPartita.setOnClickListener(new OnClickListener() {

	        @Override
	        public void onClick(View v) {
	            // TODO Auto-generated method stub
	            Calendar mcurrentTime = Calendar.getInstance();
	            int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
	            int minute = mcurrentTime.get(Calendar.MINUTE);
	            TimePickerDialog mTimePicker;
	            mTimePicker = new TimePickerDialog(CreaConvocazione.this, new TimePickerDialog.OnTimeSetListener() {


					@Override
					public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
						// controllo nel caso in cui selectedMinute valga 0 bisogna aggiungerlo noi a mano
						String stringaZeroMinuti = "";
						if (selectedMinute < 10) {
							stringaZeroMinuti = "0";
						}
						String stringaZeroOre = "";
						if (selectedHour < 10) {
							stringaZeroOre = "0";
						}
						orarioPartita.setText( stringaZeroOre + selectedHour + ":" + stringaZeroMinuti + selectedMinute);
						
					}
	            }, hour, minute, true);//Yes 24 hour time
	            mTimePicker.setTitle("Scegli l'orario della partita");
	            mTimePicker.show();

	        }
	    });

		orarioConvocazione = (EditText) findViewById(R.id.idEditTextOrarioConvocazione);
		orarioConvocazione.setOnClickListener(new OnClickListener() {

	        @Override
	        public void onClick(View v) {
	            // TODO Auto-generated method stub
	            Calendar mcurrentTime = Calendar.getInstance();
	            int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
	            int minute = mcurrentTime.get(Calendar.MINUTE);
	            TimePickerDialog mTimePicker;
	            mTimePicker = new TimePickerDialog(CreaConvocazione.this, new TimePickerDialog.OnTimeSetListener() {


					@Override
					public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
						// controllo nel caso in cui selectedMinute valga 0 bisogna aggiungerlo noi a mano
						String stringaZeroMinuti = "";
						if (selectedMinute < 10) {
							stringaZeroMinuti = "0";
						}
						String stringaZeroOre = "";
						if (selectedHour < 10) {
							stringaZeroOre = "0";
						}
						orarioConvocazione.setText( stringaZeroOre + selectedHour + ":" + stringaZeroMinuti + selectedMinute);
						
					}
	            }, hour, minute, true);//Yes 24 hour time
	            mTimePicker.setTitle("Scegli l'orario della convocazione");
	            mTimePicker.show();

	        }
	    });		
		//
		
		
		// gestione bottone elenco convocati
		setButtonElencoConvocati((Button) findViewById(R.id.idBottoneElencoConvocati));
		getButtonElencoConvocati().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				View informazioniPartitaLayout = findViewById(R.id.idScrollLayout);
				informazioniPartitaLayout.setVisibility(View.INVISIBLE);
				
				// evidenziamo il bottone come premuto
				Button bottoneElencoConvocati = (Button) findViewById(R.id.idBottoneElencoConvocati);
				bottoneElencoConvocati.setBackgroundResource(R.drawable.background_button_pressed);
				
				View elencoConvocatiLayout = findViewById(R.id.idLayoutElencoConvocati);
				elencoConvocatiLayout.setVisibility(View.VISIBLE);

				// evidenziamo il bottone come NON premuto
				Button bottoneInfoPartita = (Button) findViewById(R.id.idBottoneInformazioniPartita);
				bottoneInfoPartita.setBackgroundResource(R.drawable.background_button_normal);
				

				// CANCELLO LA TASTIERA VIRTUALE DALLO SCHERMO
				try {
					InputMethodManager inputManager = (InputMethodManager) getCurrentActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
					inputManager.hideSoftInputFromWindow(getCurrentActivity().getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
				} catch (Exception e) {
					
				}
			}
		});

		// gestione bottone informazioni partita
		setButtonInformazioniPartita((Button) findViewById(R.id.idBottoneInformazioniPartita));
		getButtonInformazioniPartita().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				View elencoConvocatiLayout = findViewById(R.id.idLayoutElencoConvocati);
				elencoConvocatiLayout.setVisibility(View.INVISIBLE);
				
				// evidenziamo il bottone come premuto
				Button bottoneInfoPartita = (Button) findViewById(R.id.idBottoneInformazioniPartita);
				bottoneInfoPartita.setBackgroundResource(R.drawable.background_button_pressed);
				
				View informazioniPartitaLayout = findViewById(R.id.idScrollLayout);
				informazioniPartitaLayout.setVisibility(View.VISIBLE);
				
				// evidenziamo il bottone come NON premuto
				Button bottoneElencoConvocati = (Button) findViewById(R.id.idBottoneElencoConvocati);
				bottoneElencoConvocati.setBackgroundResource(R.drawable.background_button_normal);
				
	
			}
		});

		// gestione bottone salva convocazione
		setButtonSalvaConvocazione((Button) findViewById(R.id.idBottoneSalvaConvocazione));
		getButtonSalvaConvocazione().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
				
				// CANCELLO LA TASTIERA VIRTUALE DALLO SCHERMO
				try {
					InputMethodManager inputManager = (InputMethodManager) getCurrentActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
					inputManager.hideSoftInputFromWindow(getCurrentActivity().getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
				} catch (Exception e) {
					
				}
				
				// RECUPERO IL LAYOUT GENERICO DELL'INTERA PAGINA
				View layoutPaginaConvocazioni = findViewById(R.id.idLayoutPaginaConvocazioni);
				// NASCONDO IL PULSANTE CREA CONVOCAZIONE
				layoutPaginaConvocazioni.findViewById(
						R.id.idBottoneSalvaConvocazione).setVisibility(
						View.INVISIBLE);
				// NASCONDO IL PULSANTE ELENCO CONVOCATI
				layoutPaginaConvocazioni.findViewById(
						R.id.idBottoneElencoConvocati).setVisibility(
						View.INVISIBLE);
				// NASCONDO IL PULSANTE INFORMAZIONI PARTITA
				layoutPaginaConvocazioni.findViewById(
						R.id.idBottoneInformazioniPartita).setVisibility(
						View.INVISIBLE);
				// VISUALIZZO LE INFORMAZIONI PARTITA
				layoutPaginaConvocazioni.findViewById(R.id.idScrollLayout)
						.setVisibility(View.VISIBLE);
				// NASCONDO L'ELENCO CONVOCATI
				layoutPaginaConvocazioni.findViewById(
						R.id.idLayoutElencoConvocati).setVisibility(
						View.INVISIBLE);

				Bitmap bitmapInformazioniPartita = screenShot(layoutPaginaConvocazioni);

				// NASCONDO LE INFORMAZIONI PARTITA
				layoutPaginaConvocazioni.findViewById(R.id.idScrollLayout)
						.setVisibility(View.INVISIBLE);
				// VISUALIZZO L'ELENCO CONVOCATI
				layoutPaginaConvocazioni.findViewById(
						R.id.idLayoutElencoConvocati).setVisibility(
						View.VISIBLE);
				// RECUPERO I LAYOUTPARAMS
				RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams) layoutPaginaConvocazioni
						.findViewById(R.id.idLayoutElencoConvocati)
						.getLayoutParams();
				// SETTO IL LAYOUT BELOW
				param.addRule(RelativeLayout.BELOW,
						R.id.idBottoneElencoConvocati);
				layoutPaginaConvocazioni.findViewById(
						R.id.idLayoutElencoConvocati).setLayoutParams(param);
				// VISUALIZZO ICONA E NOME_APP_VERSIONE
				layoutPaginaConvocazioni.findViewById(R.id.idTextViewFinto).setVisibility(View.VISIBLE);
				layoutPaginaConvocazioni.findViewById(R.id.idTextViewNomeAppVersione).setVisibility(View.VISIBLE);
				layoutPaginaConvocazioni.findViewById(R.id.idImageViewIconaApp).setVisibility(View.VISIBLE);
				//
				
				
				//Bitmap bitmapElencoConvocati = screenShot(layoutPaginaConvocazioni, numeroGiocatori);
				Bitmap bitmapElencoConvocati = screenShot(layoutPaginaConvocazioni);

				Bitmap bitmap = combineImages(bitmapInformazioniPartita,
						bitmapElencoConvocati);

				// RIPRISTINO LAYOUT
				// VISUALIZZO IL PULSANTE CREA CONVOCAZIONE
				layoutPaginaConvocazioni.findViewById(
						R.id.idBottoneSalvaConvocazione).setVisibility(
						View.VISIBLE);
				// VISUALIZZO IL PULSANTE ELENCO CONVOCATI
				layoutPaginaConvocazioni.findViewById(
						R.id.idBottoneElencoConvocati).setVisibility(
						View.VISIBLE);
				// VISUALIZZO IL PULSANTE INFORMAZIONI PARTITA
				layoutPaginaConvocazioni.findViewById(
						R.id.idBottoneInformazioniPartita).setVisibility(
						View.VISIBLE);
				// VISUALIZZO LE INFORMAZIONI PARTITA
				layoutPaginaConvocazioni.findViewById(R.id.idScrollLayout)
						.setVisibility(View.VISIBLE);
				// NASCONDO L'ELENCO CONVOCATI
				layoutPaginaConvocazioni.findViewById(
						R.id.idLayoutElencoConvocati).setVisibility(
						View.INVISIBLE);

				ContextWrapper cw = new ContextWrapper(getApplicationContext());
				
				// CREAZIONE DIRECTORY INTERNA PER TEST ECLIPSE
				File directoryInterna = cw.getDir("imageDir", Context.MODE_PRIVATE);
				String file_path = Environment.getExternalStorageDirectory().getAbsoluteFile() + "/Convocazioni_Img";
				
				// CREAZIONE DIRECTORY ESTERNA
				File directoryEsterna = new File(file_path);
				if (!directoryEsterna.exists()) {
					directoryEsterna.mkdirs();
				}
				// CREAZIONE DATA, SUFFISSO DEL NOME DELL'IMMAGINE
				Calendar cal = Calendar.getInstance();
				DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
				String dataCreazioneConvocazione = dateFormat.format(cal
						.getTime());

				// per fare test in Eclipse, inserire 'directoryInterna'
				File imageFile = new File(directoryEsterna, "conv_"
						+ dataCreazioneConvocazione + ".jpg");

				boolean tuttoOk = true;
				OutputStream fout = null;
				try {
					fout = new FileOutputStream(imageFile);
					bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fout);
					fout.flush();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
					tuttoOk = false;
				} catch (IOException e) {
					e.printStackTrace();
					tuttoOk = false;
				} finally {
					try {
						fout.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						tuttoOk = false;
					}
				}

			
			    // se tutto ok, allora visualizzo l'alert di avvenuto salvataggio
			    if (tuttoOk){
		            builder1.setMessage("Convocazione salvata con successo");
		            builder1.setCancelable(true);
		            builder1.setNeutralButton("Ok", GenericActivityUtility.whenPressOkNeutralButton(getApplicationContext(), getCurrentActivity(), getMainActivity()));
	
		            AlertDialog alert11 = builder1.create();

		            alert11.show();
				    // FINE ALERT
			    }
			}
		});

	}


	/* *********************************** GESTIONE CREAZIONE IMMAGINE ************************************* */
	public Bitmap screenShot(View view) {
		Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(),
				Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);
		view.draw(canvas);
		return bitmap;
	}
	/**
	 * Questo metodo lo usiamo per la seconda pagina che 'taglieremo' in base al numero di giocatori
	 * in modo da non ingigantire inutilmente in lunghezza l'immagine risultante finale.
	 * @param view
	 * @param numeroGiocatori
	 * @return
	 */
	public Bitmap screenShot(View view, int numeroGiocatori) {
		int righeGiocatori = numeroGiocatori/3;
		if (righeGiocatori > 7){
			righeGiocatori = 7;
		}
		Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight() - (7-righeGiocatori)*50,
				Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);
		view.draw(canvas);
		return bitmap;
	}

	public static Bitmap loadBitmapFromView(View v, int width, int height) {
		Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		Canvas c = new Canvas(b);
		v.layout(0, 0, v.getLayoutParams().width, v.getLayoutParams().height);
		v.draw(c);
		return b;
	}

	public Bitmap combineImages(Bitmap c, Bitmap s) { // can add a 3rd parameter
														// 'String loc' if you
														// want to save the new
														// image - left some
														// code to do that at
														// the bottom
		Bitmap cs = null;

		int width, height = 0;

		if (c.getHeight() > s.getHeight()) {
			width = c.getWidth();
			height = c.getHeight() + s.getHeight();
		} else {
			width = c.getWidth();
			height = s.getHeight() + s.getHeight();
		}

		cs = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

		Canvas comboImage = new Canvas(cs);

		comboImage.drawBitmap(c, 0f, 0f, null);
		comboImage.drawBitmap(s, 0f, c.getHeight(), null);

		// this is an extra bit I added, just incase you want to save the new
		// image somewhere and then return the location
		/*
		 * String tmpImg = String.valueOf(System.currentTimeMillis()) + ".png";
		 * 
		 * OutputStream os = null; try { os = new FileOutputStream(loc +
		 * tmpImg); cs.compress(CompressFormat.PNG, 100, os); }
		 * catch(IOException e) { Log.e("combineImages",
		 * "problem combining images", e); }
		 */

		return cs;
	}

	public Bitmap getScreenBitmap(View v) {
		// View v= findViewById(android.R.id.content).getRootView();
		v.setDrawingCacheEnabled(true);
		v.measure(MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED),
				MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
		v.layout(0, 0, v.getMeasuredWidth(), v.getMeasuredHeight());

		v.buildDrawingCache(true);
		Bitmap b = Bitmap.createBitmap(v.getDrawingCache());
		v.setDrawingCacheEnabled(false); // clear drawing cache
		return b;
	}
	/* ************************************************************************************************** */
	
	
	/* *************************** GESTIONE DATA ******************************** */	
	@Override
	protected Dialog onCreateDialog(int id) {
		if (id == DIALOG_ID) {
			return new DatePickerDialog(this, dpickerListner, anno, mese, giorno);
		}
		return null;
	}
	
	private DatePickerDialog.OnDateSetListener dpickerListner = new DatePickerDialog.OnDateSetListener() {
		
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			anno = year;
			mese = monthOfYear + 1;
			giorno = dayOfMonth;
		
			// gestione mese e giorni minori di 10
			String annoString = "" + anno;
			String meseString = "" + mese;
			String giornoString = "" + giorno;
			if (giorno < 10) {
				giornoString = "0" + giorno;
			}
			if (mese < 10) {
				meseString = "0" + mese;
			}
			dataVisualizzata = (EditText)findViewById(R.id.idEditTextDataPartita);
			dataVisualizzata.setText(giornoString + "/" + meseString + "/" + annoString);
		}
	};
	/* ********************************************************************************************* */
	
	
	/* ****************************** GETTER E SETTER **************************************** */	
	/**
	 * @return the nomeAppVersione
	 */
	public TextView getNomeAppVersione() {
		return nomeAppVersione;
	}

	/**
	 * @param nomeAppVersione the nomeAppVersione to set
	 */
	public void setNomeAppVersione(TextView nomeAppVersione) {
		this.nomeAppVersione = nomeAppVersione;
	}
	
	/**
	 * @return the buttonSalvaConvocazione
	 */
	public Button getButtonSalvaConvocazione() {
		return buttonSalvaConvocazione;
	}

	/**
	 * @param buttonSalvaConvocazione
	 *            the buttonSalvaConvocazione to set
	 */
	public void setButtonSalvaConvocazione(Button buttonSalvaConvocazione) {
		this.buttonSalvaConvocazione = buttonSalvaConvocazione;
	}

	/**
	 * @return the buttonElencoConvocati
	 */
	public Button getButtonElencoConvocati() {
		return buttonElencoConvocati;
	}

	/**
	 * @param buttonElencoConvocati
	 *            the buttonElencoConvocati to set
	 */
	public void setButtonElencoConvocati(Button buttonElencoConvocati) {
		this.buttonElencoConvocati = buttonElencoConvocati;
	}

	/**
	 * @return the buttonInformazioniPartita
	 */
	public Button getButtonInformazioniPartita() {
		return buttonInformazioniPartita;
	}

	/**
	 * @param buttonInformazioniPartita
	 *            the buttonInformazioniPartita to set
	 */
	public void setButtonInformazioniPartita(Button buttonInformazioniPartita) {
		this.buttonInformazioniPartita = buttonInformazioniPartita;
	}	
	/* *************************************************************************************** */
	


}
