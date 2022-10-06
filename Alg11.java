import java.util.Scanner;
public class Alg11 {
public static void main (String[ ] args) {
double preco;
double custo;


Scanner Ler = new Scanner(System.in);

System.out.println( "Digite o preço de fabrica");
custo=Ler.nextFloat();
double distribuidor = custo*0.12;
double imposto = custo*0.45;

preco= custo+imposto+distribuidor;

System.out.println( "Preço carro é:  " + preco);
}
}