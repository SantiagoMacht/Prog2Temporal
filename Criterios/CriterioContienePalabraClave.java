package ejercicio6.Criterios;

import ejercicio6.ElementoElectronica;

public class CriterioContienePalabraClave extends Criterio {
	private String palabra;
	
	public CriterioContienePalabraClave(String palabra) {
		this.palabra = palabra;
	}
	@Override
	public boolean cumple(ElementoElectronica ee) {
		return ee.contienePalabraClave(palabra);
	}

}
