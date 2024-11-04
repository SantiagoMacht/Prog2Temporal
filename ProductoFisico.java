package ejercicio6;

public class ProductoFisico extends Producto {
	private int stock;
	public ProductoFisico(String nombre, double valor, int stock) {
		super(nombre, valor);
		this.setStock(stock);
	}
	
	@Override
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

}
