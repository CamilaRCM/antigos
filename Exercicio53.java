import java.util.Scanner;
public class Exercicio53 {

    public static void main (String []args) {
    	Scanner dados = new Scanner (System.in);
    	int num=1, qtd=0, soma=0;
    	float media=0;

    	do {
    		System.out.println("Digite um numero, PARA ENCERRAR DIGITE <0>");
    		num=dados.nextInt();

    		if (num!=0){
    			qtd++;
    			soma+=num;
    			media=soma/qtd;

    		}
    	}
    	while (num!=0);

    	System.out.printf("media dos numeros é %.2f" ,media);
    }


}