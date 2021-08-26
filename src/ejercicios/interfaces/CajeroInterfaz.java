package ejercicios.interfaces;

public interface CajeroInterfaz {

	// DEFINIMOS EL CONTRATO DE LA CLASE
	
	public void solicitarTarjeta(String numero);

	public void solicitarClave(String clave);

	public void solicitarTipoTransaccion();

	public void solicitarMonto(int monto);
	
	public void validarElSaldo();
	
	public void entregarDinero();
	
	public void realizarLaTransaccion();
	
	public void entregarResibo();
	

}
