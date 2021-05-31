package abstractFactory.ejercicio;

public class Radio implements IProduct{
	private int frecuencia;
	private String marca;
	private int precio;
	
	
	public Radio(int frecuencia, String marca, int precio) {
		this.frecuencia = frecuencia;
		this.marca = marca;
		this.precio = precio;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	@Override
	public void showInfo() {
		System.out.println("Frecuencia: " + frecuencia + " Hz");
		System.out.println("Marca: " + marca);
		System.out.println("Precio: " + precio);
	}

	@Override
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
