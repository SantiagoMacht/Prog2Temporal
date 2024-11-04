package ejercicio6;

public class ProductoVariable extends Producto {

	public ProductoVariable(String nombre, double valor) {
		super(nombre, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getStock() {
		return super.getPalabrasClave().size();
	}

}
