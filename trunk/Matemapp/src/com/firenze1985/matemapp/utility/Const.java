/**
 * 
 */
package com.firenze1985.matemapp.utility;


/**
 * @author Administrator
 *
 */
public interface Const {
	/* ********************** MATERIE E ANNI SCOLASTICI *********************/
	String ARITMETICA = "Aritmetica";
	String GEOMETRIA = "Geometria";
	String CLASSE_PRIMA = "Prima";
	String CLASSE_SECONDA = "Seconda";
	String CLASSE_TERZA = "Terza";
	/* **********************************************************************/

	
	/* ************************ PACKAGE CLASSI ***************************************************/
	String PACKAGE_ARITMETICA_CLASSE_PRIMA = "com.firenze1985.matemapp.aritmetica.unitadidattiche.";
	String PACKAGE_ARITMETICA_CLASSE_SECONDA = "com.firenze1985.matemapp.aritmetica.unitadidattiche.";
	String PACKAGE_ARITMETICA_CLASSE_TERZA = "com.firenze1985.matemapp.aritmetica.unitadidattiche.";
	String PACKAGE_GEOMETRIA_CLASSE_PRIMA = "com.firenze1985.matemapp.geometria.unitadidattiche.";
	String PACKAGE_GEOMETRIA_CLASSE_SECONDA = "com.firenze1985.matemapp.geometria.unitadidattiche.";
	String PACKAGE_GEOMETRIA_CLASSE_TERZA = "com.firenze1985.matemapp.geometria.unitadidattiche.";
	/* *******************************************************************************************/
	
	
	/* ***************** ARRAY STRINGHE MATERIE E ANNI SCOLASTICI *************************/
	String[] MATERIA = {
		ARITMETICA,
		GEOMETRIA
	};
	
	String[] ANNOSCOLASTICO = {
		CLASSE_PRIMA,
		CLASSE_SECONDA,
		CLASSE_TERZA
	};
	/* *************************************************************************************/
	
	
	/* ******************* ARRAY STRINGHE ARGOMENTI *****************************************************/
	String[] ARGOMENTI_ARITMETICA_PRIMA = {
			"Insiemi",
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
	/* ****************************************************************************************************/

	
	/* ************************************ NUMERO PAGINE PER ARGOMENTI *********************************************/
	int NUMERO_PAGINE_FRAZIONI = 6;
	int NUMERO_PAGINE_SOMMA = 8;
	int NUMERO_PAGINE_INSIEMI = 10;
	/* ***************************************************************************************************************/
}
