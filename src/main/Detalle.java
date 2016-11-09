package main;

import javax.persistence.*;

@Embeddable
public class Detalle 
{
	@Column
	private int cantidad;
	
	@ManyToOne (fetch =FetchType.LAZY, optional=true)
	private Producto producto;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
