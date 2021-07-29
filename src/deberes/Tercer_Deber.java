package deberes;

import java.util.Scanner;

public class Tercer_Deber {

	public Tercer_Deber() {
		
	}

	public static void main(String[] args) {
		
          Scanner read=new Scanner(System.in);
          
          System.out.println("*******************************");
          System.out.print("Ingrese el valor del sueldo: ");
          int S= read.nextInt();
          System.out.println("*******************************");
          
          if (S<=300) {
        	  
        	  int b= 100;
        	  int B1= S + b;
        	  System.out.println("Su bonificacion es: "+ b);
        	  System.out.println("Sueldo total: $"+ B1);
        	  System.out.println("*******************************");
        	  
          }else if(S>300 && S<=400) {
        	  
        	  int b= 70;
        	  int B2= S + b;
        	  System.out.println("Su bonificacion es: "+ b);
        	  System.out.println("Sueldo total: $"+ B2);
        	  System.out.println("*******************************");
        	  
          }else if(S>400) { 
        	  
        	  int b= 50;
        	  int B3= S + b;
        	  System.out.println("Su bonificacion es: "+ b);
        	  System.out.println("Sueldo total: $"+ B3);
        	  System.out.println("*******************************");
        	  
          }else {
        	  System.out.println(":c No obtiene bonificacion :c");
        	  System.out.println("*******************************");
          }
	}

}
