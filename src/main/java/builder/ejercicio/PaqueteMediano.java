package builder.ejercicio;

public class PaqueteMediano extends BuilderPaquete{

	@Override
	public void buildChocolates() {
		product.setChocolate(1);
	}

	@Override
	public void buildPipocas() {
		product.setPipocas("Grandes");
	}

	@Override
	public void buildRecarga() {
		product.setRecarga(false);
	}

	@Override
	public void buildGaseosa() {
		product.setVasosGaseosa(2);
	}

}