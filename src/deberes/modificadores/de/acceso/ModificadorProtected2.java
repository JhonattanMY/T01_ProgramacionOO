package deberes.modificadores.de.acceso;

public class ModificadorProtected2 {

	// COMPRA DE CELULAR

	protected String marcaCelular;
	protected String caracteristicas;
	protected int precioSinIva;

	protected void Pago(String metodoPago) {

		if (metodoPago == "efectivo") {
			System.out.println("Entregar dinero al vendedor");
			double calculoIva = precioSinIva * 0.12;
			double pagoTotal = precioSinIva + calculoIva;

		} else if (metodoPago == "tarjeta") {

			System.out.println("Entregar tarjeta al vendedor");
			double calculoIva = precioSinIva * 0.12;
			double pagoTotal = precioSinIva + calculoIva;
		}
	}
}
