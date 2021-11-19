package br.cesed.lsi.unifacisa.Pedido;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int idCompra;
	
	private double valorFinal;
	
	public Pedido() {
		
	}
	public double getValor() {
		return valorFinal;
	}
	public void setValor(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public int getId() {
		return idCompra;
	}

	@Override
	public String toString() {
		return "Pedido [valorFinal=" + valorFinal + ", idCompra=" + idCompra + "]";
	}

	
}
