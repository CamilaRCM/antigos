package AulasNewton.refactor;

import java.util.Scanner;

public class Alg44 {

	public static void main(String[] args) {

		int c, num, somaPos = 0, somaNeg = 0;

		for (c = 0; c < 10; c++) {
			Scanner ler = new Scanner(System.in);

			System.out.println("Digite um numero ");
			num = ler.nextInt();

			if (num > 0) {
				somaPos += num;
			} else if (num < 0) {
				somaNeg += num;
			} else {
				System.out.println("Numero � nulo");
                c--;  				
			}
		}

		System.out.println(" A soma de numeros positivos �: " + somaPos);

		System.out.println(" A soma de numeros negativos � " + somaNeg);
		System.out.println(" total numero digitados:"+ c );
	}
}