package com.unl.sistema.base.models;

import java.util.List;
import java.util.Date;

public class Auto {
	private Integer id;
	private String anio;
	private String modelo;
	private String color;
	private Float kilometraje;
	private Double precio;
	private String codigoVIN;
	private String descripcion;
	private Date fechaRegistro;
	private boolean estaDisponible = true;


	public Auto(Integer id, String marca, String modelo, String color, String placa, Integer anio, Double precio, String descripcion, List<String> imagenes) {
		this.id = id;
		this.anio = anio.toString();
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.descripcion = descripcion;
		this.fechaRegistro = new Date();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(Float kilometraje) {
		this.kilometraje = kilometraje;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCodigoVIN() {
		return codigoVIN;
	}
	public void setCodigoVIN(String codigoVIN) {
		this.codigoVIN = codigoVIN;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public boolean isEstaDisponible() {
		return estaDisponible;
	}
	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}
}