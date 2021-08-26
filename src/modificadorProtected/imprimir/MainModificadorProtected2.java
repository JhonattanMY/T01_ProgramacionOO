package modificadorProtected.imprimir;

import deberes.modificadores.de.acceso.ModificadorProtected2;

public class MainModificadorProtected2 extends ModificadorProtected2 {

	public static void main(String[] args) {

		ModificadorProtected2
		dato1.marcaCelular = "Samsung";
		
		ModificadorProtected2 dato2 = new ModificadorProtected2();
		dato2.caracteristicas="alamacenamiento: 120gb - Pantalla: 7pulgadas / amoled ......";
		
		ModificadorProtected2 dato3 = new ModificadorProtected2();
		dato3.precioSinIva= 750;

		ModificadorProtected2 comprobante = new ModificadorProtected2();
		comprobante.Pago();
	}

}
