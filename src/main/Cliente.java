package main;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Cliente 
{
	@Id
	@Column
	private int numero;
	
	@Column
	@Required
	private String nombre;
	
	@Embedded
	private Direccion direccion;
	
	

	public Direccion getDireccion() 
	{
		return (direccion == null) ? new Direccion() : direccion;
	}

	public void setDireccion(Direccion direccion) 
	{
		this.direccion = direccion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
