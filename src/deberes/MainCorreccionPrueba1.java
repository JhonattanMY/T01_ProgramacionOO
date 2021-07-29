package deberes;

import java.util.Scanner;

public class MainCorreccionPrueba1 {

	public MainCorreccionPrueba1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		/*
		 * Crear un programa que solicite ingresar un n�mero (solo positivos), y as�
		 * seguir� solicitando ingresar un n�mero hasta que se ingrese el n�mero cero
		 * (0), cuando se ingrese el numero cero, ya no solicitar� m�s n�meros y en ese
		 * momento el programa debe imprimir la suma y el promedio de los n�meros
		 * ingresados hasta ese momento. Adicional deber� imprimir la cantidad de
		 * n�meros ingresados por el usuario.
		 */

		Scanner lee = new Scanner(System.in);

		int S = 0;
		float P = 0;
		int C = 0;

		for (int i = 1; i != 0; i++) {

			System.out.print("Ingrese un numero positivo: ");
			int N = lee.nextInt();

			if (N == 0) {
				i = -1;
			} else {
				S = S + N;
				P = S / i;
				C = C + 1;
			}
		}

		System.out.println("\n=====================");
		System.out.println("La suma es: " + S);
		System.out.println("Promedio es: " + P);
		System.out.println("La cantidad es: " + C);
		System.out.println("=====================");
	}

}
