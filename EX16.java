import java.util.Scanner;
public class EX16 {
public static void main (String[ ] args) {

double Num;

Scanner Ler = new Scanner(System.in);

System.out.println( "Digite um número:");
Num=Ler.nextDouble();

 if(Num%5==0)
System.out.println("Divisivel por 5");
    else
System.out.println("Não Divisivel por 5");
}
}