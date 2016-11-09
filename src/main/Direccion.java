package main;

import javax.persistence.*;

@Embeddable
public class Direccion 
{
	@Column(length=60)
	private String descripcion;
	@Column(length=40)
	private String barrio;
	@Column(length=30)
	private String municipio;
	@Column(length=30)
	private String departamento;
	
	
	public Direccion() 
	{
		super();
	}
	
	public Direccion(String descripcion, String barrio, String municipio, String departamento) {
		super();
		this.descripcion = descripcion;
		this.barrio = barrio;
		this.municipio = municipio;
		this.departamento = departamento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
