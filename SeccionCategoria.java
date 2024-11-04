package ejercicio6;

import java.util.ArrayList;

import ejercicio6.Criterios.Criterio;

public class SeccionCategoria extends ElementoElectronica {
	private int CantPalabrasMaxima;
	private Criterio criterio;
	private ArrayList<ElementoElectronica> elementos;
	
	public SeccionCategoria(String nombre, int cantPalabrasMaxima) {
		super(nombre);
		this.setCantPalabrasMaxima(cantPalabrasMaxima);
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoElectronica ee) {
		if(criterio.cumple(ee)) {
			elementos.add(ee);
		}
	}
	
	@Override
	public double getValor() {
		double total = 0;
		for(int i = 0; i < elementos.size(); i++) {
			total += elementos.get(i).getValor();
		}
		return total;
	}

	@Override
	public int getStock() {
		int total = 0;
		for(int i = 0; i < elementos.size(); i++) {
			total += elementos.get(i).getStock();
		}
		return total;
	}

	@Override
	public ArrayList<String> getPalabrasClave() {
		ArrayList<String> resultado = new ArrayList<>();
		for (int i = 0; i < elementos.size(); i++) {
			ArrayList<String> resultParcial = elementos.get(i).getPalabrasClave();
			for(int j = 0; i < resultParcial.size(); j++) {
				if(!resultado.contains(resultParcial.get(j)) && resultado.size() < getCantPalabrasMaxima()) {
					resultado.add(resultParcial.get(j));
				}
			}
		}
		return resultado;
	}
	
	@Override
	public boolean contienePalabraClave(String pp) {
		for(int i = 0; i < elementos.size(); i++) {
			if(elementos.get(i).contienePalabraClave(pp)) {
				return true;
			}
		}
		return false;
	}
	
	
	public int getCantPalabrasMaxima() {
		return CantPalabrasMaxima;
	}
	public void setCantPalabrasMaxima(int cantPalabrasMaxima) {
		CantPalabrasMaxima = cantPalabrasMaxima;
	}
	public Criterio getCriterio() {
		return criterio;
	}
	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
}
