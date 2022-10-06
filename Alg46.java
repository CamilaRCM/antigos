
package AulasNewton.refactor;

import java.util.Scanner;

public class Alg46 {

	public static void main(String[] args) {

		int c, num, Par=0, Impar=0;

		for (c = 0; c < 10; c++) {
			Scanner ler = new Scanner(System.in);

			System.out.println("Digite um numero ");
			num = ler.nextInt();
			 if  (num  == 0) {
	                System.out.println("Nulo");
	                c--;
	                }
			 
	                else if (num %2==1){
	                	Impar= num;
	                }

	                else {
	                	Par=num;
	                }
	}
	
		System.out.println("Quantidade de numero par é " + Par);
		System.out.println("Quantidade de numero impar é " + Impar );
		
}
}

