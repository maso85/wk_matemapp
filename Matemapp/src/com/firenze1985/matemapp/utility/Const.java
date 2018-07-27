/**
 * 
 */
package com.firenze1985.matemapp.utility;

import java.util.HashMap;


/**
 * @author Administrator
 *
 */
public interface Const {
	/* ******************************** COSTANTI PER LAYOUT *********************************/
	String ACTION_BAR = "#777777";
	/* **************************************************************************************/
	
	/* ******************************** COSTANTI PER RILASCI ***************************/
	boolean GEOMETRIA_PRINCIPALE = false;
	boolean ARITMETICA_PRIMA = true;
	boolean ARITMETICA_SECONDA = false;
	boolean ARITMETICA_TERZA = false;
	boolean GEOMETRIA_PRIMA = false;
	boolean GEOMETRIA_SECONDA = false;
	boolean GEOMETRIA_TERZA = false;
	boolean FRAZIONI = false;
	boolean INSIEMI = true;
	boolean NUMNATURALI = true;
	boolean SOMMA = false;
	/* *********************************************************************************/
	
	/* ********************** MATERIE E ANNI SCOLASTICI *********************/
	String ARITMETICA = "Aritmetica";
	String GEOMETRIA = "Geometria";
	String CLASSE_PRIMA = "Prima";
	String CLASSE_SECONDA = "Seconda";
	String CLASSE_TERZA = "Terza";
	/* **********************************************************************/

	
	/* ************************ PACKAGE CLASSI ***************************************************/
	String COMMON_PACKAGE = "com.firenze1985.matemapp";
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


	/* ********************************************************* HASHMAP CLASSNAME - NOME ARGOMENTO ********************************/
	String[] HASHMAP_ARGOMENTI_ARITMETICA_PRIMA_CLASSNAME = {
			"Insiemi",
			"NumNaturali",
			"Somma",
			"Frazioni"
	};	
	String[] HASHMAP_ARGOMENTI_ARITMETICA_PRIMA_LISTAVIDEO = {
			"Insiemi",
			"Numeri Naturali",
			"Somma",
			"Frazioni"
	};
	/**********************/
	String[] HASHMAP_ARGOMENTI_ARITMETICA_SECONDA_CLASSNAME = {
			"Radici",
			"Proporzioni"
	};	
	String[] HASHMAP_ARGOMENTI_ARITMETICA_SECONDA_LISTAVIDEO = {
			"Radici",
			"Proporzioni"
	};
	/*********************/
	String[] HASHMAP_ARGOMENTI_ARITMETICA_TERZA_CLASSNAME = {
			"NumRelativi",
			"Algebra"
	};	
	String[] HASHMAP_ARGOMENTI_ARITMETICA_TERZA_LISTAVIDEO = {
			"Numeri Relativi",
			"Algebra"
	};
	/**********************/
	String[] HASHMAP_ARGOMENTI_GEOMETRIA_PRIMA_CLASSNAME = {
			"Segmenti",
			"Triangoli"
	};	
	String[] HASHMAP_ARGOMENTI_GEOMETRIA_PRIMA_LISTAVIDEO = {
			"Segmenti",
			"Triangoli"
	};
	/*************************/
	String[] HASHMAP_ARGOMENTI_GEOMETRIA_SECONDA_CLASSNAME = {
			"TeoPitagora",
			"Similitudini"
	};	
	String[] HASHMAP_ARGOMENTI_GEOMETRIA_SECONDA_LISTAVIDEO = {
			"Teorema di Pitagora",
			"Similitudini"
	};
	/*************************/
	String[] HASHMAP_ARGOMENTI_GEOMETRIA_TERZA_CLASSNAME = {
			"Cerchio",
			"Solidi"
	};	
	String[] HASHMAP_ARGOMENTI_GEOMETRIA_TERZA_LISTAVIDEO = {
			"Cerchio",
			"Solidi"
	};
	/****************************/
	/* *****************************************************************************************************************************/
	
	
	/* ******************* ARRAY STRINGHE ARGOMENTI *****************************************************/
	String[][] ARGOMENTI_ARITMETICA_PRIMA = {
			HASHMAP_ARGOMENTI_ARITMETICA_PRIMA_CLASSNAME,
			HASHMAP_ARGOMENTI_ARITMETICA_PRIMA_LISTAVIDEO
	};
	String[][] ARGOMENTI_ARITMETICA_SECONDA = {
			HASHMAP_ARGOMENTI_ARITMETICA_SECONDA_CLASSNAME,
			HASHMAP_ARGOMENTI_ARITMETICA_SECONDA_LISTAVIDEO
	};
	String[][] ARGOMENTI_ARITMETICA_TERZA = {
			HASHMAP_ARGOMENTI_ARITMETICA_TERZA_CLASSNAME,
			HASHMAP_ARGOMENTI_ARITMETICA_TERZA_LISTAVIDEO
	};
	String[][] ARGOMENTI_GEOMETRIA_PRIMA = {
			HASHMAP_ARGOMENTI_GEOMETRIA_PRIMA_CLASSNAME,
			HASHMAP_ARGOMENTI_GEOMETRIA_PRIMA_LISTAVIDEO
	};
	String[][] ARGOMENTI_GEOMETRIA_SECONDA = {
			HASHMAP_ARGOMENTI_GEOMETRIA_SECONDA_CLASSNAME,
			HASHMAP_ARGOMENTI_GEOMETRIA_SECONDA_LISTAVIDEO
	};
	String[][] ARGOMENTI_GEOMETRIA_TERZA = {
			HASHMAP_ARGOMENTI_GEOMETRIA_TERZA_CLASSNAME,
			HASHMAP_ARGOMENTI_GEOMETRIA_TERZA_LISTAVIDEO
	};

	/* ****************************************************************************************************/

	/* ************************************ NUMERO PAGINE PER UNITA DIDATTICA *********************************************/
	int NUMERO_PAGINE_FRAZIONI = 6;
	int NUMERO_PAGINE_SOMMA = 8;
	int NUMERO_PAGINE_INSIEMI = 5;
	int NUMERO_PAGINE_NUMNATURALI = 5;
	/* ***************************************************************************************************************/
}
