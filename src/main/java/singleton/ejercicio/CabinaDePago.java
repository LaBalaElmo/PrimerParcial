package singleton.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class CabinaDePago {
	private static CabinaDePago instancia;
	private int dinero;
	private List<Vehiculo> list = new ArrayList<>();

	private CabinaDePago() {
		System.out.println("Creando cabina de pago");
	}

	public static CabinaDePago getInstance() {
		if (instancia == null)
			instancia = new CabinaDePago();
		return instancia;
	}

	public void cobrar(Vehiculo v, int monto) {
		System.out.println("Se pago el monto de: " + monto);
		list.add(v);
		dinero = dinero + monto;
	}
	
	public void mostrarRegistro() {
		if(list.size() > 5) {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).showInfo();
			}
		}
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public List<Vehiculo> getList() {
		return list;
	}

	public void setList(List<Vehiculo> list) {
		this.list = list;
	}

}
