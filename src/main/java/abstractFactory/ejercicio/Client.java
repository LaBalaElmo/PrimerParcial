package abstractFactory.ejercicio;

public class Client {
	public static void main(String[] args) {
		Batidora batidora = (Batidora) FactoryProduct.make("BATIDORA");
		Microondas microondas = (Microondas) FactoryProduct.make("MICROONDAS");
		Radio radio = (Radio) FactoryProduct.make("RADIO");
		Refrigerador refrigerador = (Refrigerador) FactoryProduct.make("REFRIGERADOR");
		Television television = (Television) FactoryProduct.make("TELEVISION");

		batidora.setPrecio(100);
		batidora.showInfo();
		microondas.setPrecio(450);
		microondas.showInfo();
		radio.setPrecio(30);
		radio.showInfo();
		refrigerador.setPrecio(1000);
		refrigerador.showInfo();
		television.setPrecio(2000);
		television.showInfo();

	}
}
