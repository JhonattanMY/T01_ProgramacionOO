package trabajo.parejas;
import java.util.Scanner;

public class Productos {
	Scanner lee = new Scanner(System.in);

	public void seleccion() {

		System.out.println("SELECCIONE PODUCTOS ");
		System.out.println("1---> Pan");
		System.out.println("2---> Fideos");
		System.out.println("3---> Leche");
		System.out.println("0---> Salir ");
		int producto = lee.nextInt();

		if (producto == 1) {
			System.out.println("Precio: 3$");
		} else if (producto == 2) {
			System.out.println("Precio: 10$");
		} else if (producto == 3) {
			System.out.println("Precio: 2$");
		} else {
			System.out.println("El producto no existe");
		}

	}
	
	public void MetodoPago() {
		
		String MetodoPago = lee.next();

		System.out.println("Metodo de pago: " + MetodoPago);
	}

}
