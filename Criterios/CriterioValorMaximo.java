package ejercicio6.Criterios;

import ejercicio6.ElementoElectronica;

public class CriterioValorMaximo extends Criterio {
	private double valorMaximo;
	
	public CriterioValorMaximo(int valor) {
		this.valorMaximo = valor;
	}
	@Override
	public boolean cumple(ElementoElectronica ee) {
		return ee.getValor() <= valorMaximo;
	}

}
