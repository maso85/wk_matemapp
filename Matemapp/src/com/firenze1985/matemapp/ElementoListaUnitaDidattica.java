/**
 * 
 */
package com.firenze1985.matemapp;

/**
 * @author Administrator
 *
 */
public class ElementoListaUnitaDidattica {

	private String nome;
	private String tipo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public ElementoListaUnitaDidattica(String nome, String tipo) {
		setNome(nome);
		setTipo(tipo);
	}
}
