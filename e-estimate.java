package exercise2;


import java.util.Scanner;

public class GasM 
{
	
		   public static void main(String[] args) {

		       long factorial = 1; 
		       
		       Scanner reader = new Scanner(System.in); 
		     
		       System.out.println("Enter number of terms to use: ");
		      
		       int n = reader.nextInt(); 
		      
		       double e = 1.0;
		      
		     

		       for (int i = 1; i <= n; i++) {

		           factorial = factorial * i;		     

		       }


		      System.out.printf("Using %d terms, e is calculated to be ", n );

		 

		       factorial = 1; 

		       for (int i = 1; i <= n; i++) {

		           factorial = factorial * i;

		           e = e + 1.0 / factorial;

		       }

		       System.out.printf("%f. ", e);
  
	   reader.close(); 
   }
}


