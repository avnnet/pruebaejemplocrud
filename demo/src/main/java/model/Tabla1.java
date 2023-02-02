package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tabla1")
public class Tabla1 {

	@Id
	private String id;
	private String rut;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public String toString() {
		
		return this.id + " " + this.rut;
	}
	
	
	
}
