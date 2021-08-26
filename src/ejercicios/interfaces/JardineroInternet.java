package ejercicios.interfaces;

public class JardineroInternet implements JardineroInterfaz {

	public void regar() {
		System.out.println("Abre las llaves");
		System.out.println("Toma la mangera");
		System.out.println("Ponerle cloro al agua");
		System.out.println("Riega las plantas y el cesped");
		
	}
	public void abonar() {
		System.out.println("Bajar el abono");
		System.out.println("Abonar por partes");
		
	}
	public void cortar() {
		System.out.println("Prender la maquina");
		System.out.println("Cortar por la mitad");
		
	}

}
