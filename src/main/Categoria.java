package main;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

@Entity
public class Categoria 
{
	@Id
	@Hidden
	@GeneratedValue (generator = "system-uuid")					//Identificador ùnico universal
	@GenericGenerator(name ="system-uuid", strategy = "uuid")
	@Column(length = 32)
	private String oid;
	
	@Column (length = 50)
	private String descripcion;

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
