package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public MainMatriz1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// 4/ agosto / 2021

//		1. Declare una matriz de A[3,4], y desarrolle un programa que vaya
//		solicitando cada una de sus posiciones y imprimir las posiciones.

		Scanner lee = new Scanner(System.in);
		System.out.println("Ingrese el numero de filas: ");
		int longFilas = lee.nextInt();
		System.out.println("Ingrese el numero de columnas: ");
		int longColumnas = lee.nextInt();

		char A[][] = new char[longFilas][longColumnas];

		for (int fila = 0; fila < longFilas; fila++) {
			for (int columna = 0; columna < longColumnas; columna++) {
				System.out.print("Ingrese valor posicion " + "[" + fila + "]" + "[" + columna + "] : ");
				// El ususario dijita el valor por teclado y acontinuacion lo lee.
				char n = lee.next().charAt(0);
				A[fila][columna] = n;
			}
			System.out.println();
		}
		for (int fila = 0; fila < longFilas; fila++) {
			for (int columna = 0; columna < longColumnas; columna++) {
				System.out.print(A[fila][columna]+" ");
			}
			System.out.println();
		}
	}
}
