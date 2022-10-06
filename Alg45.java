package AulasNewton.refactor;

import java.util.Scanner;

public class Alg45 {

	public static void main(String[] args) {

		int c, num, soma=0;

		for (c = 0; c < 10; c++) {
			Scanner ler = new Scanner(System.in);

			System.out.println("Digite um numero ");
			num = ler.nextInt();
			
			if (num < 40) {
				soma+=num;}
		}
		
		System.out.println(" A soma de numeros inferiores a 40 é: " + soma);
}
}
