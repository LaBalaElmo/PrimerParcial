package abstractFactory.ejercicio;

public class Microondas implements IProduct {
	private int precio;
	private int potencia;
	private String color;
	
	
	public Microondas(int precio, int potencia, String color) {
		this.precio = precio;
		this.potencia = potencia;
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void showInfo() {
		System.out.println("Potencia: " + potencia);
		System.out.println("Color: " + color);
		System.out.println("Precio: " + precio);

	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
