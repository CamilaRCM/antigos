import java.util.Scanner;

public class Algexemplo4{

public static void main (String[ ] args) {

Scanner Ler = new Scanner(System.in);
String nome;
int idade;
float peso;

System.out.print( "Entre com o seu nome ");
nome = Ler.nextLine();

System.out.print( "Entre com sua idade ");
idade=Ler.nextInt();

System.out.print( "Entre com seu peso ");
peso=Ler.nextFloat();

System.out.println ();
System.out.println ("Nome: " + nome + "idade: " + idade );
System.out.printf ("peso: %.2f " , peso);
}
}