package abstractFactory.ejercicio;

public class Television implements IProduct {
	private int pulgadas;
	private boolean control;
	private int precio;

	public Television(int pulgadas, boolean control, int precio) {
		this.pulgadas = pulgadas;
		this.control = control;
		this.precio = precio;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean getControl() {
		return control;
	}

	public void setControl(boolean control) {
		this.control = control;
	}

	@Override
	public void showInfo() {
		System.out.println("Pulgadas: " + pulgadas);
		System.out.println("Control remoto: " + control);
		System.out.println("Precio: " + precio);
	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
