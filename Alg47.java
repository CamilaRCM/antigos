package AulasNewton.refactor;

import java.util.Scanner;

public class Alg47 {

	public static void main(String[] args) {

		int c, num, positivo=0, negativo=0, somaPos=0,somaNeg=0;

		for (c = 0; c < 15; c++) {
			Scanner ler = new Scanner(System.in);

			System.out.println("Digite um numero ");
			num = ler.nextInt();
			
			if (num > 0) {
				somaPos += num;
				positivo=num;
			} else if (num < 0) {
				somaNeg += num;
				negativo=num;
			} else {
				System.out.println("Numero é nulo");
                c--;  				
			}
		}
		
		System.out.println("Quantidade de numeros postivos é " + positivo);
		System.out.println("Quantidade de numeros negativos é " + negativo);
		System.out.println("soma de numero positivo é " + somaPos );
		System.out.println("soma de numero negativo é " + somaNeg );
		
		
	}
}
