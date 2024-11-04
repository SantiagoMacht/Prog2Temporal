package ejercicio6.Criterios;

import ejercicio6.ElementoElectronica;

public class CriterioStock extends Criterio {
	private int cantStock;
	
	public CriterioStock(int stock) {
		this.cantStock = stock;
	}
	@Override
	public boolean cumple(ElementoElectronica ee) {
		return ee.getStock() < cantStock;
	}

}
