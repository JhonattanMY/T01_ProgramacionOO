package Diagramas.de.flujo;

import java.util.Scanner;

public class MainEjercicioDoWhile {

	public MainEjercicioDoWhile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		float SI = 0;
		int SP = 0;
		float PI = 0;
		float CI = 0;

		System.out.print("Ingrese un numero positivo: ");
		int N = lee.nextInt();
		SI = SI + N;
		SI = SI + N;

		do {
			System.out.print("Ingrese un numero positivo: ");
			N = lee.nextInt();

			if (N % 2 == 0) {
				SP = SP + N;

			} else {
				SI = SI + N;
				CI = CI + 1;
				PI = SI / CI;
			}
		} while (N != -1);

		System.out.println("La suma de pares: " + SP);
		System.out.println("Suma impares: " + SI);
		System.out.println("El promedio impares es: " + PI);
	}

}
