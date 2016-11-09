package main;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Producto 
{
	@Id
	@Column (length= 9)
	private int numero;
		
	@Column
	@Required
	private String descripcion;
	
	@ManyToOne (fetch =FetchType.LAZY, optional=true)
	@DescriptionsList
	private Categoria categoria;
	
	@Column
	@Required
	@Stereotype("DINERO")
	private BigDecimal precio;
	
	@Stereotype("FOTO")
	@Column(length = 240700000)
	private byte[] foto; 
	
	@Stereotype("GALERIA_IMAGENES")
	@Column (length = 12)
	private String masFotos;

	@Stereotype("TEXTO_GRANDE")
	@Column
	private String observaciones;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getMasFotos() {
		return masFotos;
	}

	public void setMasFotos(String masFotos) {
		this.masFotos = masFotos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
}
