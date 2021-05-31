package prototype.ejercicio;

public class TelevisorSmart implements ITelevisor {
	private String sO;
	private double versioSO;
	private int pulgadas;
	private int resolucion;
	private boolean puertoHdmi;
	private int puertosUsb;
	private boolean controlRemoto;
	private boolean bluetooth;
	private int serial;

	public TelevisorSmart() {
	}

	public String getSO() {
		return sO;
	}

	public void setSO(String sO) {
		this.sO = sO;
	}

	public double getVersioSO() {
		return versioSO;
	}

	public void setVersioSO(double versioSO) {
		this.versioSO = versioSO;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean getPuertoHdmi() {
		return puertoHdmi;
	}

	public void setPuertoHdmi(boolean puertoHdmi) {
		this.puertoHdmi = puertoHdmi;
	}

	public int getPuertosUsb() {
		return puertosUsb;
	}

	public void setPuertosUsb(int puertosUsb) {
		this.puertosUsb = puertosUsb;
	}

	public boolean getControlRemoto() {
		return controlRemoto;
	}

	public void setControlRemoto(boolean controlRemoto) {
		this.controlRemoto = controlRemoto;
	}

	public boolean getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	@Override
	public Object clone() {
		TelevisorSmart cloneObject = new TelevisorSmart();
		cloneObject.setBluetooth(bluetooth);
		cloneObject.setControlRemoto(controlRemoto);
		cloneObject.setPuertoHdmi(puertoHdmi);
		cloneObject.setPuertosUsb(puertosUsb);
		cloneObject.setPulgadas(pulgadas);
		cloneObject.setResolucion(resolucion);
		cloneObject.setSerial(serial);
		cloneObject.setSO(sO);
		cloneObject.setVersioSO(versioSO);
		return cloneObject;
	}

	public void showInfo() {
		System.out.println("***************************************");
		System.out.println("Bluetooth: " + bluetooth);
		System.out.println("Control remoto: " + controlRemoto);
		System.out.println("Puerto HDMI: " + puertosUsb);
		System.out.println("Puerto Usb: " + puertosUsb);
		System.out.println("Pulgadas: " + pulgadas);
		System.out.println("Resolucion: " + resolucion);
		System.out.println("Serial: " + serial);
		System.out.println("Sistema operativo: " + sO);
		System.out.println("Version del sistema Operativo: " + versioSO);
	}
}
