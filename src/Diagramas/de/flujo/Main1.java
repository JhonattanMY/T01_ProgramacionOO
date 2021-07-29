package Diagramas.de.flujo;

import java.util.Scanner;

public class Main1 {

	public Main1() {
		
	}

	public static void main(String[] args) {
		
		// Ejercio #1
		Scanner lector=new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int n= lector.nextInt();
		System.out.println();
		
		for (int i=n+1; i<=n+5; i++) {
          
			System.out.println("Numeros: "+i);
		}
		
		System.out.println("\nAqui finaliza la impresion");
	}
}
