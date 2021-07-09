package DEBERES;

import java.util.Scanner;

public class Primer_Deber {

	public Primer_Deber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner lector=new Scanner(System.in);

		System.out.println("======= BIENVENIDOS =======");
		
		System.out.println("Ingrese dos numeros");
		System.out.print("N1: ");
		int n1= lector.nextInt();
		
		System.out.print("N2: ");
		int n2= lector.nextInt();
		
		if (n2==0) {
			System.out.println("\n******************************");
			System.out.println("No se puede realizar la division");
			System.out.println("----Imposible dividir para 0---");
		
		}else {
			int D= n1 /n2;
			System.out.println("\n***************************");
			System.out.println("Respuesta: "+D);
		}
		System.out.println("===========================");
	}

}
