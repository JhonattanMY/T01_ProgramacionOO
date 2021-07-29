package deberes;

import java.util.Scanner;

public class MainCorreccionPrueba2 {

	public MainCorreccionPrueba2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		float SI = 0;
		int SP = 0;
		float PI = 0;
		float CI = 0;

		for (int i = 1; i != -1; i++) {

			System.out.print("Ingrese un numero positivo: ");
			int N = lee.nextInt();

			if (N == -1) {
				i = -2;
			} else if (N % 2 == 0) {
				SP = SP + N;

			} else {
				SI = SI + N;
				CI = CI + 1;
				PI = SI / CI;
			}
		}

		System.out.println("\n=====================");
		System.out.println("La suma de pares: " + SP);
		System.out.println("Suma impares: " + SI);
		System.out.println("El promedio es: " + PI);
		System.out.println("=====================");
	}

}
