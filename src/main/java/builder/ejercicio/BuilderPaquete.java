package builder.ejercicio;

public abstract class BuilderPaquete {
	 protected Paquete product;

	    public Paquete getProduct() {
	        return product;
	    }

	    public void createProduct(){
	        product= new Paquete();
	    }

	    public abstract void buildChocolates();
	    public abstract void buildPipocas();
	    public abstract void buildRecarga();
	    public abstract void buildGaseosa();
}
