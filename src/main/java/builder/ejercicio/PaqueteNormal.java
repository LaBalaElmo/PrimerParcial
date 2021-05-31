package builder.ejercicio;

public class PaqueteNormal extends BuilderPaquete {

	@Override
	public void buildChocolates() {
		product.setChocolate(0);
	}

	@Override
	public void buildPipocas() {
		product.setPipocas("Normal");
	}

	@Override
	public void buildRecarga() {
		product.setRecarga(false);
	}

	@Override
	public void buildGaseosa() {
		product.setVasosGaseosa(1);
	}

}