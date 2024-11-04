package ejercicio6;

public class ProductoDigital extends Producto {
	private final static int stock = 2500000;
	
	public ProductoDigital(String nombre, double valor) {
		super(nombre, valor);
	}

	@Override
	public int getStock() {
		return stock;
	}
	
	
}
