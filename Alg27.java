package AulasNewton.refactor;

import java.util.Scanner;

public class Alg27 {

	public static void main(String[] args) {

		int idade;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite sua idade ");
		idade = ler.nextInt();

		if (idade < 12) {

			System.out.println("Pediatria");
		} else if (idade > 12 && idade < 59) {
			System.out.println("Clínica Geral");

		} else {
			System.out.println("Geriatria");

		}

	}

}