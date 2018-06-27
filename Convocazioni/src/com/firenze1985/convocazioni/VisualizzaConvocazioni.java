/**
 * 
 */
package com.firenze1985.convocazioni;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import packageActivity.BaseActivity;
import packageActivity.GenericActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

/**
 * @author A30G
 *
 */
public class VisualizzaConvocazioni extends GenericActivity {
	
	/* ************************************** OVERRIDE OBBLIGATORI ***************************** */
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
	/* ****************************************************************************************** */
	

	/* ************************ DICHIARAZIONE VARIABILI **************************** */
	GridView grigliaConvocazioni;
	ArrayList<File> listaImmaginiConvocazioni;
	/* **************************************************************************** */

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.visualizzaconvocazioni_layout);
		
		setListaImmaginiConvocazioni( imageReader( Environment.getExternalStorageDirectory() ));
		
		setGrigliaConvocazioni((GridView) findViewById(R.id.idGrigliaConvocazioni));		
		getGrigliaConvocazioni().setAdapter(new GridAdapter());
		
		getGrigliaConvocazioni().setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parentView, View view, int position, long id) {
				startActivity( new Intent(getApplicationContext(), VisualizzaImmagine.class).putExtra("immagine", listaImmaginiConvocazioni.get(position)) );
				
			}
			
		});
		
	}
	
	
	/* ******************************* GESTIONE VISUALIZZAZIONE GRIGLIA CONVOCAZIONI ********************** */
	class GridAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return getListaImmaginiConvocazioni().size();
		}

		@Override
		public Object getItem(int arg0) {
			return getListaImmaginiConvocazioni().get(arg0);
		}

		@Override
		public long getItemId(int arg0) {
			return 0;
		}

		/*
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			convertView = getLayoutInflater().inflate(R.layout.elementogrigliaconvocazioni_layout, parent, false);
			ImageView immagine = (ImageView) convertView.findViewById(R.id.idElementoGrigliaConvocazioni);
			
			immagine.setImageURI(Uri.parse( getItem(position).toString() ));
			return convertView;
		}
		*/
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			convertView = getLayoutInflater().inflate(R.layout.elementogrigliaconvocazioni_layout, parent, false);
			TextView testoElementoGriglia = (TextView) convertView.findViewById(R.id.idElementoGrigliaConvocazioni);
			testoElementoGriglia.setText(((File)getItem(position)).getName());
			return convertView;
		}
		
	}

	ArrayList<File> imageReader(File root) {
		ArrayList<File> lista = new ArrayList<File>();
		File[] files = root.listFiles();
		for (int i = 0; i < files.length; i++) {			
			//if (files[i].isDirectory()) {
			if (files[i].isDirectory() && files[i].getPath().contains("Convocazioni_Img")) {
			//if (files[i].getPath().equalsIgnoreCase("/mnt/sdcard/Convocazioni_Img")) {
				lista.addAll( imageReader(files[i]));
			} else {
				//if (files[i].getName().endsWith(".jpg")) {
				if (files[i].getName().startsWith("conv")) {
					lista.add(files[i]);
				}
			}
		}
		
		// ordina la lista in modo decrescente, cosi vediamo in cima le convocazioni piu recenti
		 // Sort files by name
        Collections.sort(lista, new Comparator<Object>() {
			@Override
			public int compare(Object arg0, Object arg1) {
        		File f1 = (File) arg0;
        		File f2 = (File) arg1;
        		return Long.valueOf(f2.lastModified()).compareTo(f1.lastModified());
			}
        });
		
		return lista;
	}
	/* ************************************************************************************************ */

	
	/* ************************************* GETTER E SETTER ******************************* */
	/**
	 * @return the grigliaConvocazioni
	 */
	public GridView getGrigliaConvocazioni() {
		return grigliaConvocazioni;
	}

	/**
	 * @param grigliaConvocazioni the grigliaConvocazioni to set
	 */
	public void setGrigliaConvocazioni(GridView grigliaConvocazioni) {
		this.grigliaConvocazioni = grigliaConvocazioni;
	}

	/**
	 * @return the listaImmaginiConvocazioni
	 */
	public ArrayList<File> getListaImmaginiConvocazioni() {
		return listaImmaginiConvocazioni;
	}

	/**
	 * @param listaImmaginiConvocazioni the listaImmaginiConvocazioni to set
	 */
	public void setListaImmaginiConvocazioni(
			ArrayList<File> listaImmaginiConvocazioni) {
		this.listaImmaginiConvocazioni = listaImmaginiConvocazioni;
	}
	/* ************************************************************************************ */
	
}
