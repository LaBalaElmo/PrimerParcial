package abstractFactory.ejercicio;

public class Refrigerador implements IProduct {
	private int precio;
	private String tamano;
	private String color;
	
	
	public Refrigerador(int precio, String tamano, String color) {
		this.precio = precio;
		this.tamano = tamano;
		this.color = color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	@Override
	public void showInfo() {
		System.out.println("Color: " + color);
		System.out.println("Tamaño: " + tamano);
		System.out.println("Precio: " + precio);

	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
