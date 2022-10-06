package AulasNewton.refactor;

import java.util.Scanner;

public class Alg25 {

	public static void main(String[] args) {

		int idade;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite sua idade ");
		idade = ler.nextInt();

		if (idade < 18) {

			System.out.println("menor de idade");
		} else if (idade >= 18 && idade < 65) {
			System.out.println("maior de idade");

		} else {
			System.out.println("idoso");

		}

	}

}