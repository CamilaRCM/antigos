import java.util.Scanner;

public class Alg3{

public static void main (String[ ] args) {

Scanner entrada = new Scanner (System.in);
double num,	quadrado;

System.out.println ("entre com um numero para calcular seu quadrado e sua raiz: " );
num = entrada.nextDouble ();
quadrado = Math.pow(num,2);
double raiz = Math.sqrt(num);

System.out.println("o quadrado do numero "+ num + "é: " + quadrado);
System.out.println("a raiz quadrada do numero " + num + "é: " + raiz);
}
}