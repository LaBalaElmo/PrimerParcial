package abstractFactory.ejercicio;

public class Batidora implements IProduct{
	private int velocidades;
	private String color;
	private int precio;
	
	
	public Batidora(int velocidades, String color, int precio) {
		this.velocidades = velocidades;
		this.color = color;
		this.precio = precio;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Velocidades: " + velocidades);
		System.out.println("Color: " + color);
		System.out.println("Precio: " + precio);
	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}


}
