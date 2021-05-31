package singleton.ejercicio;

public class Client {
	public static void main(String[] args) {
		CabinaDePago cabina = CabinaDePago.getInstance();

		Vehiculo v1 = new Vehiculo("1236HJK", "Grand Vitara", "Jose Perez");
		Vehiculo v2 = new Vehiculo("1236HJK", "Grand Vitara", "Juan Perez");
		Vehiculo v3 = new Vehiculo("1236HJK", "Grand Vitara", "Pedro Perez");
		Vehiculo v4 = new Vehiculo("1236HJK", "Grand Vitara", "Carlos Perez");
		Vehiculo v5 = new Vehiculo("1236HJK", "Grand Vitara", "Jaime Perez");
		Vehiculo v6 = new Vehiculo("1236HJK", "Grand Vitara", "Roberto Perez");
		CabinaDePago cabina2 = CabinaDePago.getInstance(); 
		cabina.cobrar(v1, 10);
		cabina.cobrar(v2, 10);
		cabina.cobrar(v3, 10);
		cabina.cobrar(v4, 10);
		cabina2.cobrar(v5, 10);
		cabina2.cobrar(v6, 10);
		System.out.println(cabina.getDinero());
		System.out.println(cabina2.getDinero());
		
		cabina.mostrarRegistro();
		
	}
}
