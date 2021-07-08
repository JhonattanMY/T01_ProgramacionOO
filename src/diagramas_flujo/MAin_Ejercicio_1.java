package diagramas_flujo;

import java.util.Scanner;

public class MAin_Ejercicio_1 {

	public MAin_Ejercicio_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lee=new Scanner(System.in);
		
		System.out.print("Ingrese el valor del sueldo: ");
		int vs= lee.nextInt();
		
		if (vs<300) {
			
			int B=40;
			System.out.println("--------------------------");
			System.out.println("Su bonificacion es: $"+B);
			System.out.println("--------------------------");
		}else {
			
			int B2=0;
			System.out.println("--------------------------");
			System.out.println("Su bonificacion es: $" + B2);
			System.out.println("--------------------------");
		
	}

	}
}
