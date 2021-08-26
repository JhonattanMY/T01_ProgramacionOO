package ejercicios.interfaces;

public class JardineroVecino implements JardineroInterfaz {

	@Override
	public void regar() {
		System.out.println("Abre las llaves");
		System.out.println("Toma la mangera");
		System.out.println("Riega las plantas y el cesped");

	}

	@Override
	public void abonar() {
		System.out.println("Bajar el abono");
		System.out.println("Mezclar el abono con la viruta");
		System.out.println("Abonar por partes");

	}

	@Override
	public void cortar() {
		System.out.println("Prender la maquina");
		System.out.println("Cortar la primera linea");

	}

}
