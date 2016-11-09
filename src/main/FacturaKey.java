package main;

import java.io.*;

public class FacturaKey implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int anio;
	private int numero;
	
	public boolean equals(Object objeto)
	{
		if(objeto == null)
			return false;
		
		return objeto.toString().equals(this.toString());
	}
	
	@Override
	public int hashCode()
	{
		return toString().hashCode();
	}
	
	@Override
	public String toString()
	{
		return "FacturaPk::" + anio + ":" + numero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
