package ejercicio6.Criterios;

import ejercicio6.ElementoElectronica;

public class CriterioNot extends Criterio {
	private Criterio c1;
	
	public CriterioNot(Criterio c1) {
		this.c1 = c1;
	}
	@Override
	public boolean cumple(ElementoElectronica ee) {
		return !c1.cumple(ee);
	}

}
