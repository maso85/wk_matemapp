/**
 * 
 */
package com.firenze1985.matemapp;

import com.firenze1985.matemapp.aritmetica.AritmeticaPrima;
import com.firenze1985.matemapp.aritmetica.AritmeticaSeconda;
import com.firenze1985.matemapp.aritmetica.AritmeticaTerza;
import com.firenze1985.matemapp.geometria.GeometriaPrima;
import com.firenze1985.matemapp.geometria.GeometriaSeconda;
import com.firenze1985.matemapp.geometria.GeometriaTerza;
import com.firenze1985.matemapp.utility.Const;

import packageActivity.GenericActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author Administrator
 *
 */
public abstract class Materia extends GenericActivity {

	
	/* ************************************ DICHIARAZIONE VARIABILI ******************************************/
	Button ButtonClassePrima;
	Button ButtonClasseSeconda;
	Button ButtonClasseTerza;
	Class classePrima;
	Class classeSeconda;
	Class classeTerza;
	/* ******************************************************************************************************/
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setSuperParameter();
		setContentView(R.layout.materiaprincipale_layout);	
		
		// gestione bottone aritmetica
		setButtonClassePrima((Button)findViewById(R.id.idBottoneClassePrima));
		getButtonClassePrima().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {			
				//
				if (
						(Const.ARITMETICA_PRIMA && AritmeticaPrima.class.equals(getClassePrima())) ||
						(Const.GEOMETRIA_PRIMA && GeometriaPrima.class.equals(getClassePrima())
					)) {
					// si lancia la activity della classe prima per una materia specifica
					Intent intent = new Intent(getApplicationContext(), getClassePrima());
					intent.putExtra("ClassePrecedente", getCurrentActivity().getLocalClassName());
					startActivity(intent);
				} else {
					Intent intent = new Intent(getApplicationContext(), LavoriInCorso.class);
					intent.putExtra("ClassePrecedente", getCurrentActivity().getLocalClassName());
					startActivity(intent);
				}
				//
				}			
			}
		);
		//
		
		// gestione bottone aritmetica
		setButtonClasseSeconda((Button)findViewById(R.id.idBottoneClasseSeconda));
		getButtonClasseSeconda().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {			
				//
				if (
						(Const.ARITMETICA_SECONDA && AritmeticaSeconda.class.equals(getClasseSeconda())) ||
						(Const.GEOMETRIA_SECONDA && GeometriaSeconda.class.equals(getClasseSeconda())
					)) {
					// si lancia la activity della classe prima per una materia specifica
					Intent intent = new Intent(getApplicationContext(), getClasseSeconda());
					intent.putExtra("ClassePrecedente", getCurrentActivity().getLocalClassName());
					startActivity(intent);
				} else {
					Intent intent = new Intent(getApplicationContext(), LavoriInCorso.class);
					intent.putExtra("ClassePrecedente", getCurrentActivity().getLocalClassName());
					startActivity(intent);
				}
				//			
				}			
			}
		);
		//
				
		// gestione bottone aritmetica
		setButtonClasseTerza((Button)findViewById(R.id.idBottoneClasseTerza));
		getButtonClasseTerza().setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {			
				//
				if (
						(Const.ARITMETICA_TERZA && AritmeticaTerza.class.equals(getClasseTerza())) ||
						(Const.GEOMETRIA_TERZA && GeometriaTerza.class.equals(getClasseTerza())
					)) {
					// si lancia la activity della classe prima per una materia specifica
					Intent intent = new Intent(getApplicationContext(), getClasseTerza());
					intent.putExtra("ClassePrecedente", getCurrentActivity().getLocalClassName());
					startActivity(intent);
				} else {
					Intent intent = new Intent(getApplicationContext(), LavoriInCorso.class);
					intent.putExtra("ClassePrecedente", getCurrentActivity().getLocalClassName());
					startActivity(intent);
				}
				//			
				}			
			}
		);
		//					
	}	
	
	/* *********************** GETTER E SETTER *********************************************/
	
	/**
	 * @return the buttonClassePrima
	 */
	public Button getButtonClassePrima() {
		return ButtonClassePrima;
	}

	/**
	 * @param buttonClassePrima the buttonClassePrima to set
	 */
	public void setButtonClassePrima(Button buttonClassePrima) {
		ButtonClassePrima = buttonClassePrima;
	}

	/**
	 * @return the buttonClasseSeconda
	 */
	public Button getButtonClasseSeconda() {
		return ButtonClasseSeconda;
	}

	/**
	 * @param buttonClasseSeconda the buttonClasseSeconda to set
	 */
	public void setButtonClasseSeconda(Button buttonClasseSeconda) {
		ButtonClasseSeconda = buttonClasseSeconda;
	}

	/**
	 * @return the buttonClasseTerza
	 */
	public Button getButtonClasseTerza() {
		return ButtonClasseTerza;
	}

	/**
	 * @param buttonClasseTerza the buttonClasseTerza to set
	 */
	public void setButtonClasseTerza(Button buttonClasseTerza) {
		ButtonClasseTerza = buttonClasseTerza;
	}

	/**
	 * @return the classePrima
	 */
	public Class getClassePrima() {
		return classePrima;
	}

	/**
	 * @param classePrima the classePrima to set
	 */
	public void setClassePrima(Class classePrima) {
		this.classePrima = classePrima;
	}

	/**
	 * @return the classeSeconda
	 */
	public Class getClasseSeconda() {
		return classeSeconda;
	}

	/**
	 * @param classeSeconda the classeSeconda to set
	 */
	public void setClasseSeconda(Class classeSeconda) {
		this.classeSeconda = classeSeconda;
	}

	/**
	 * @return the classeTerza
	 */
	public Class getClasseTerza() {
		return classeTerza;
	}

	/**
	 * @param classeTerza the classeTerza to set
	 */
	public void setClasseTerza(Class classeTerza) {
		this.classeTerza = classeTerza;
	}
	/* **************************************************************************/

}
