package main;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

@Entity

//Validador de llaves primarias
//@IdClass(FacturaKey.class)
public class Factura 
{
	
	@Id
	@Hidden
	@GeneratedValue (generator = "system-uuid")					//Identificador ùnico universal
	@GenericGenerator(name ="system-uuid", strategy = "uuid")
	@Column(length = 32)
	private String id;
	
	//@Id
	@Column(length = 4)
	@DefaultValueCalculator(CurrentYearCalculator.class)
	private int anio;
	
	//@Id
	@Column(length = 6)
	private int numero;
	
	@Required
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date fehca;
	
	@ElementCollection //Es una colecciòn de informaciòn
	@ListProperties("producto.numero, producto.descripcion,cantidad") //Lo datos que se quieren mostrar
	private Collection<Detalle> detalles;
	
	//Campo de multiples lìneas
	@Stereotype("MEMO")
	private String observaciones;
	
	@ManyToOne (fetch =FetchType.LAZY, optional=true)
	private Cliente cliente;

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

	public Date getFehca() {
		return fehca;
	}

	public void setFehca(Date fehca) {
		this.fehca = fehca;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Collection<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(Collection<Detalle> detalles) {
		this.detalles = detalles;
	}
	
	
		
}
