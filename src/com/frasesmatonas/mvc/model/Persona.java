package com.frasesmatonas.mvc.model;

import java.util.Date;

public class Persona {
	private int id_Persona;
	private String name;
	private int edad;
	private String carrera;
	private Date fecha;
	
	public Persona() {
	}
	
	public Persona(int id_Persona,String name,int edad, String carrera, Date fecha) {
		this.id_Persona = id_Persona;
		this.name = name;
		this.edad = edad;
		this.carrera = carrera;
		this.fecha = fecha;
	}
	
	public int getId_Persona() {
		return id_Persona;
	}
	
	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
