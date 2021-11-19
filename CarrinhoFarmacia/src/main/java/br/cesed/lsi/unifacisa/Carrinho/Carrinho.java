package br.cesed.lsi.unifacisa.Carrinho;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carrinho {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nomeProd;
	
	private double valor;
	
	public Carrinho() {
		
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Carrinho [nomeProd=" + nomeProd + ", valor=" + valor + ", id=" + id + "]";
	}
	
	

}
