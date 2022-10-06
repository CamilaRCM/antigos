import java.util.Scanner;
public class Exercicio54 {

    public static void main (String []args) {
    	Scanner dados = new Scanner (System.in);

    	int num=1, soma=0;

    	do {
    		System.out.println("Digite um número, PARA ENCERRAR DIGITE <0>");
    		num=dados.nextInt();

    		if (num!=0){

    			if (num>5)
    				soma+=num;
    		}
    	}
    	while (num!=0);

    	System.out.println("soma dos numeros acima de 5 é " +soma);
    }


}