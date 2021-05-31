package builder.ejercicio;

public class Paquete {
	private String pipocas;
	private int vasosGaseosa;
	private boolean recarga;
	private int chocolate;

	public String getPipocas() {
		return pipocas;
	}

	public void setPipocas(String pipocas) {
		this.pipocas = pipocas;
	}

	public int getVasosGaseosa() {
		return vasosGaseosa;
	}

	public void setVasosGaseosa(int vasosGaseosa) {
		this.vasosGaseosa = vasosGaseosa;
	}

	public boolean isRecarga() {
		return recarga;
	}

	public void setRecarga(boolean recarga) {
		this.recarga = recarga;
	}

	public int getChocolate() {
		return chocolate;
	}

	public void setChocolate(int chocolate) {
		this.chocolate = chocolate;
	}

	public void showInfo() {
		System.out.println("Tamaño pipocas: " + pipocas);
		System.out.println("Vasos de gaseosa: " + vasosGaseosa);
		System.out.println("Recarga de la gaseosa: " + recarga);
		System.out.println("Chocolates: " + chocolate);
	}
}
