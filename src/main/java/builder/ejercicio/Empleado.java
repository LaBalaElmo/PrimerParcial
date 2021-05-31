package builder.ejercicio;

public class Empleado {
	private BuilderPaquete builder;

	public Paquete getProduct() {
		return builder.getProduct();
	}

	public void setBuilder(BuilderPaquete builder) {
		this.builder = builder;
	}

	public void buildProduct() {
		this.builder.createProduct();
		this.builder.buildChocolates();
		this.builder.buildGaseosa();
		this.builder.buildPipocas();
		this.builder.buildRecarga();
	}
}
