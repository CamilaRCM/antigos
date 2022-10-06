import java.util.Scanner;
public class Alg8 {
public static void main (String[ ] args) {

Float Nota1, Nota2, Nota3, media;
System.out.println( "Entre com as suas notas ");
Scanner Ler = new Scanner(System.in);

	System.out.println( "Nota 1 ");
	Nota1=Ler.nextFloat();
	System.out.println( "Nota 2 ");
	Nota2=Ler.nextFloat();
	System.out.println( "Nota 3 ");
	Nota3=Ler.nextFloat();

media=(Nota1+Nota2+Nota3)/3;

System.out.println("O valor da média é: "+ media);
}
}