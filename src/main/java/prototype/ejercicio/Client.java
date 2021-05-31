package prototype.ejercicio;

public class Client {
	public static void main(String[] args) {
		TelevisorSmart tv = new TelevisorSmart();
		tv.setBluetooth(true);
		tv.setControlRemoto(true);
		tv.setPuertoHdmi(true);
		tv.setPuertosUsb(4);
		tv.setPulgadas(80);
		tv.setResolucion(50);
		tv.setSerial(0);
		tv.setSO("android");
		tv.setVersioSO(11.0);
		
		TelevisorSmart tv1 = (TelevisorSmart) tv.clone();
		tv1.setSerial(1234567890);
		TelevisorSmart tv2 = (TelevisorSmart) tv.clone();
		tv2.setSerial(1563985478);
		TelevisorSmart tv3 = (TelevisorSmart) tv.clone();
		tv3.setSerial(1256986325);
		TelevisorSmart tv4 = (TelevisorSmart) tv.clone();
		tv4.setSerial(1569852364);
		TelevisorSmart tv5 = (TelevisorSmart) tv.clone();
		tv5.setSerial(1485236978);
		
		tv1.showInfo();
		tv2.showInfo();
		tv3.showInfo();
		tv4.showInfo();
		tv5.showInfo();
	}
}
