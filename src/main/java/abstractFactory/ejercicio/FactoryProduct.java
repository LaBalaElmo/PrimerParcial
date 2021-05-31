package abstractFactory.ejercicio;

public class FactoryProduct {
	public static enum Product {
		MICROONDAS, BATIDORA, RADIO, REFRIGERADOR, TELEVISION
	}

	public static IProduct make(String product) {
		IProduct producto;
		Product typeProduct = Product.valueOf(product);
		switch (typeProduct) {
		case MICROONDAS:
			producto = new Microondas(0, 100, "Blanco");
			break;
		case BATIDORA:
			producto = new Batidora(3, "Rojo", 0);
			break;
		case RADIO:
			producto = new Radio(100, "Sony", 0);
			break;
		case REFRIGERADOR:
			producto = new Refrigerador(0, "Grande", "Plateado");
			break;
		case TELEVISION:
			producto = new Television(50, true, 0);
			break;
		default:
			System.out.println("Producto no disponible");
			producto = null;
			break;
		}
		return producto;
	}
}
