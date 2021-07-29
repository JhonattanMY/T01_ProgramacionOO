package Diagramas.de.flujo;

import java.util.Scanner;

public class MainEjercicioWhile {

	public MainEjercicioWhile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		int s = 0;
		float p = 0;
		int c = 0;

		System.out.print("Ingrese un numero positivo: ");
		int N = lee.nextInt();
		s = s + N;

		while (N != 0) {
			System.out.print("Ingrese un numero positivo: ");
			N = lee.nextInt();

			s = s + N;
			c = c + 1;
			p = s / c;

		}

		System.out.println("La suma es: " + s);
		System.out.println("Promedio es: " + p);
		System.out.println("Cantidad es: " + c);

	}

}
