package ejercicios.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {

		System.out.println("INGRESE SU TARJETA POR 10 SEGUNDOS");

	}

	@Override
	public void solicitarClave(String clave) {

		System.out.println(" DIJITE SU CLAVE");
		System.out.println("VALIDAR CLAVE ....");
		System.out.println("CLAVE INGRESADA ES: CORRECTA");
	}

	@Override
	public void solicitarTipoTransaccion() {
		System.out.println(" 3--> RETIRO");

	}

	@Override
	public void solicitarMonto(int monto) {

		System.out.println("INGRE LA CANTIDAD QUE DESEA RETIRAR");
		monto = 260;
	}

	@Override
	public void validarElSaldo() {

		System.out.println(" VALOR A RETIRAR ES: $260");
	}

	@Override
	public void entregarDinero() {

		System.out.println("RETIRE EL DINERO DE LA RANURA");
	}

	@Override
	public void realizarLaTransaccion() {

		System.out.println("RESTAR DEL SALDO DE LA CUENTA EL VALOR QUE SE RETIRO");
		System.out.println("SU SALDO ACTUAL ES DE: $1000");
	}

	@Override
	public void entregarResibo() {

		System.out.println("NUMERO DE CUENTA: 789*****");
		System.out.println(" VALOR RETIRADO: $260");
		System.out.println("NOMBRE DEL DUEÑO CUENTA");
		System.out.println(" SALDO ACTUAL: $1000");

	}
}
