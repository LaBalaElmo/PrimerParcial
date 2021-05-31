package builder.ejercicio;

public class Client {
	public static void main(String[] args) {
		Empleado empleado = new Empleado();
        MegaPaquete paquete1 = new MegaPaquete();
        PaqueteMediano paquete2 = new PaqueteMediano();
        PaqueteNormal paquete3 = new PaqueteNormal();

        empleado.setBuilder(paquete1);
        empleado.buildProduct();

        Paquete p1 = empleado.getProduct();
        Cliente c1 = new Cliente("Jose", p1);
        
        empleado.setBuilder(paquete2);
        empleado.buildProduct();

        Paquete p2 = empleado.getProduct();
        Cliente c2 = new Cliente("Juan", p2);
        
        empleado.setBuilder(paquete3);
        empleado.buildProduct();

        Paquete p3 = empleado.getProduct();
        Cliente c3 = new Cliente("Roberto", p3);
        
        
	}
}
