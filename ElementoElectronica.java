package ejercicio6;

import java.util.ArrayList;

public abstract class ElementoElectronica {
	private String nombre;
	
	public ElementoElectronica(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getValor();
	public abstract int getStock();
	public abstract ArrayList<String> getPalabrasClave();
	public abstract boolean contienePalabraClave(String pp);
	
	
}
