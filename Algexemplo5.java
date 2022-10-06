import java.util.Scanner;

public class Algexemplo5{

public static void main (String[ ] args) {
Scanner entrada = new Scanner (System.in);
double num, quadrado;

System.out.println("Entre com um numero para calcular seu quadrado ");
num=entrada.nextDouble();

quadrado=Math.pow(num,2);

System.out.println("o quadrado do numero " + num + "é: " + quadrado) ;
}
}