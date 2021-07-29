package deberes;

import java.util.Scanner;

public class MainCorreccionPrueba1 {

	public MainCorreccionPrueba1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		/*
		 * Crear un programa que solicite ingresar un número (solo positivos), y así
		 * seguirá solicitando ingresar un número hasta que se ingrese el número cero
		 * (0), cuando se ingrese el numero cero, ya no solicitará más números y en ese
		 * momento el programa debe imprimir la suma y el promedio de los números
		 * ingresados hasta ese momento. Adicional deberá imprimir la cantidad de
		 * números ingresados por el usuario.
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
