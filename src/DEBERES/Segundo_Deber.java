package DEBERES;

import java.util.Scanner;

public class Segundo_Deber {

	public Segundo_Deber() {
		
	}

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("/////////////////////////////");
		System.out.print("Ingrese dos numeros: ");
		System.out.print("\nA= "); int A=teclado.nextInt();    System.out.print("B= "); int B=teclado.nextInt();
        
        int m= A % B;
        
        if (m==0) {
        	System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°");
        	System.out.println("[ A es multiplo de B ]");
        	System.out.println("\nResiduo= "+m);
        	System.out.println("°°°°°°°°°°°°°°°°°°°°°°°");
        	
        }else {
        	System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°");
        	System.out.println("[ No son multiplos ]");
        	System.out.println("\nResiduo= "+m);
        	System.out.println("°°°°°°°°°°°°°°°°°°°°°°°");
        }
        System.out.println("/////////////////////////////"); 
       
	}

}
