package ejercicios.interfaces;

public class CajeroProduBanco implements CajeroInterfaz {

	public void solicitarTarjeta(String numero) {

		System.out.println("INGRESE SU TARJETA POR 10 SEGUNDOS");

	}

	public void solicitarClave(String clave) {

		System.out.println(" DIJITE SU CLAVE");
		System.out.println("VALIDAR CLAVE ....");
		System.out.println("CLAVE INGRESADA ES: CORRECTA");
	}

	public void solicitarTipoTransaccion() {
		System.out.println(" 1--> DEPOSITO");

	}

	public void solicitarMonto(int monto) {

		System.out.println("INGRESE VALOR A DEPOSITAR");
		monto = 500;
	}

	public void validarElSaldo() {

		System.out.println(" VALOR A DEPOSITAR: $500");
	}

	public void entregarDinero() {

		System.out.println("INGRESE EL DINERO EN LA RANURA");
	}

	public void realizarLaTransaccion() {

		System.out.println(" SUMANDO EL VALOR DEPOSITADO AL SALDO DE LA CUENTA");
		System.out.println("SU SALDO ACTUAL ES DE: $1700");
	}

	public void entregarResibo() {

		System.out.println("NUMERO DE CUENTA: 1243*****");
		System.out.println(" VALOR DEPOSITADO: $500");
		System.out.println("NOMBRE DEL DUEÑO CUENTA");

	}

}
