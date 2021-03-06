package deberes;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainTrabajoGrupal {

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese la longitud del vector: ");
		int longitud = lee.nextInt();

		int A[] = new int[longitud];

		System.out.println();
		System.out.println("Ingrese los valores del arreglo");
		for (int i = 0; i < longitud; i++) {
			System.out.print("P[" + i + "]-->");
			A[i] = lee.nextInt();
		}
		System.out.println("------- NUMEROS ORDENADOS-------");

		shell(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}

		// METODO DE JAVA - ORDENAMIENTO DE UN VECTOR.
		Arrays.sort(A);

		// METODO DE JAVA - IMPRESION DE UN VECTOR.
		System.out.println("\n--IMPRESION DE NUMEROS METODO JAVA--");
		System.out.println("NUMEROS ORDENADOS" + Arrays.toString(A));

	}

	private static void shell(int[] a) {
		int salto, i, j, k, temp;

		salto = a.length / 2;
		while (salto > 0) {
			for (i = salto; i < a.length; i++) {
				j = i - salto;
				while (j >= 0) {
					k = j + salto;
					if (a[j] <= a[k]) {
						j = -1;
					} else {
						temp = a[j];
						a[j] = a[k];
						a[k] = temp;
						j -= salto;
					}
				}
			}
			salto = salto / 2;
		}
	}

}