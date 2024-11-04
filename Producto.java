package ejercicio6;

import java.util.ArrayList;

public abstract class Producto extends ElementoElectronica {
	private double valor;
	private ArrayList<String> palabrasClave;
	
	public Producto(String nombre, double valor) {
		super(nombre);
		this.valor = valor;
		this.palabrasClave = new ArrayList<>();
	}
	
	public abstract int getStock();
	
	public void addPalabra(String p) {
		palabrasClave.add(p);
	}
	
	public ArrayList<String> getPalabrasClave(){
		return new ArrayList<>(palabrasClave);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean contienePalabraClave(String pp) {
		return palabrasClave.contains(pp);
	}

}
