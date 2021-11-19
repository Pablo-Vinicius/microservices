package br.cesed.lsi.unifacisa.Historico;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Historico {
	
	@Id
	private int idCompra;
	
	private String data;
	
	private String hora;
	
	private double valorFinal;
	
	public Historico() {
		
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "Historico [valorFinal=" + valorFinal + ", idCompra=" + idCompra + ", data=" + data + ", hora=" + hora
				+ "]";
	}
	
	
	
}
