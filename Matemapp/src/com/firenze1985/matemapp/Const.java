/**
 * 
 */
package com.firenze1985.matemapp;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author Administrator
 *
 */
public interface Const {
	String ARITMETICA = "Aritmetica";
	String GEOMETRIA = "Geometria";
	String CLASSE_PRIMA = "Prima";
	String CLASSE_SECONDA = "Seconda";
	String CLASSE_TERZA = "Terza";
	
	String PACKAGE_ARITMETICA_CLASSE_PRIMA = "com.firenze1985.matemapp.aritmetica.";
	
	String[] MATERIA = {
		ARITMETICA,
		GEOMETRIA
	};
	
	String[] ANNOSCOLASTICO = {
		CLASSE_PRIMA,
		CLASSE_SECONDA,
		CLASSE_TERZA
	};
	
	String[] ARGOMENTI_ARITMETICA_PRIMA = {
			"Frazioni",
			"Somma"
	};
	String[] ARGOMENTI_ARITMETICA_SECONDA = {
			"Radici",
			"Proporzioni"
	};
	String[] ARGOMENTI_ARITMETICA_TERZA = {
			"Numeri relativi",
			"Algebra"
	};
	String[] ARGOMENTI_GEOMETRIA_PRIMA = {
			"Segmenti",
			"Triangoli"
	};
	String[] ARGOMENTI_GEOMETRIA_SECONDA = {
			"Teorema di Pitagora",
			"Similitudini"
	};
	String[] ARGOMENTI_GEOMETRIA_TERZA = {
			"Cerchio",
			"Solidi"
	};
	String[][] ARGOMENTI = {
			ARGOMENTI_ARITMETICA_PRIMA,
			ARGOMENTI_ARITMETICA_SECONDA,
			ARGOMENTI_ARITMETICA_TERZA,
			ARGOMENTI_GEOMETRIA_PRIMA,
			ARGOMENTI_GEOMETRIA_SECONDA,
			ARGOMENTI_GEOMETRIA_TERZA
	};
	

}
