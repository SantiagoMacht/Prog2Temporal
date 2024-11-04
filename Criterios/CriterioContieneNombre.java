package ejercicio6.Criterios;

import ejercicio6.ElementoElectronica;

public class CriterioContieneNombre extends Criterio {
	private String frase;
	
	public CriterioContieneNombre(String frase) {
		this.frase = frase;
	}
	@Override
	public boolean cumple(ElementoElectronica ee) {
		return ee.getNombre().contains(frase);
	}

}
