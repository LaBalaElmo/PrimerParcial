package builder.ejercicio;

public class MegaPaquete extends BuilderPaquete{

	@Override
	public void buildChocolates() {
		product.setChocolate(2);
	}

	@Override
	public void buildPipocas() {
		product.setPipocas("Extragrandes");
	}

	@Override
	public void buildRecarga() {
		product.setRecarga(true);
	}

	@Override
	public void buildGaseosa() {
		product.setVasosGaseosa(3);
	}

}
