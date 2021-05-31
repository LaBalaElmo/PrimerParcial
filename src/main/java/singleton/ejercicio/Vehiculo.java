package singleton.ejercicio;

public class Vehiculo {
	private String placa;
	private String modelo;
	private String conductor;

	
	
	public Vehiculo(String placa, String modelo, String conductor) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.conductor = conductor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public void showInfo() {
		System.out.println("Vehiculo de modelo: " + getModelo());
		System.out.println("Con placa: " + getPlaca());
		System.out.println("Conductor llamado: " + getConductor());
	}

}
