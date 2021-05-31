package builder.ejercicio;

public class Cliente {
	private String nombre;
	private Paquete paquete;

	public Cliente(String nombre, Paquete paquete) {
		this.nombre = nombre;
		this.paquete = paquete;
		showInfo();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}

	public void showInfo() {
		System.out.println("Nombre: " + nombre);
		paquete.showInfo();
	}

}
