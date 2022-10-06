package AulasNewton.refactor;

import java.util.Scanner;

public class Alg23 {

	public static void main(String[] args) {
		
	int a,b,c; 
	
	Scanner ler = new Scanner(System.in);


	System.out.println( "Informe o valor do lado do A do triangulo ");
	a=ler.nextInt();
	
	System.out.println( "Informe o valor do lado do B do triangulo ");
	b=ler.nextInt();

	System.out.println( "Informe o valor do lado do C do triangulo ");
	c=ler.nextInt();
	
if(a == b && a == c)

	System.out.println(" Equilatero");

else
    if(a == b || a == c || b == c)
    	System.out.println(" isoseles");
    else
    	System.out.println ("Escaleno");


	}

}
