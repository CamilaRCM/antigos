import java.util.Scanner;
public class Exercicio56 {

    public static void main (String []args){
    	Scanner dados = new Scanner (System.in);

    	int i=0, num, qtdPos=0, qtdNeg=0, somaPos=0, somaNeg=0;

    	do {
    		System.out.println("Digite algum numero");
    		num=dados.nextInt();

    		if (num!=0){

    			if (num>0){

    				qtdPos++;
    				somaPos+=num;
    			}
    			else{
    				qtdNeg++;
    				somaNeg+=num;

    			}
    			i++;

    		}

    	}
    	while(i<5);

    	System.out.println("Quantidade de positivos " +qtdPos);
    	System.out.println("Soma dos numeros positivos " +somaPos);
    	System.out.println("Quantidade de negativos " +qtdNeg);
    	System.out.println("Soma dos numeros negativos " +somaNeg);
    }


}