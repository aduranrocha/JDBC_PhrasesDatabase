package com.frasesmatonas.mvc.model;

import java.util.Date;

public class Frase {
	private int id_Frase;
	private String contenido;
	private int cantidad;
	private Date fechaDesde;
	private Date fecha;
	
	public Frase() {
		
	}
	
	public Frase(int id_Frase, String contenido, int cantidad, Date fechaDesde, Date fecha) {
		
	}
	
	public int getId_Frase() {
		return id_Frase;
	}
	
	public void setId_Frase(int id_Frase) {
		this.id_Frase = id_Frase;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Date getFechaDesde() {
		return fechaDesde;
	}
	
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
