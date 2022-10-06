import java.util.Scanner;
public class Ex13 {
public static void main (String[ ] args) {
int Num;

Scanner Ler = new Scanner(System.in);
System.out.println( "Informe um numero ");
Num = Ler.nextInt();
if  (Num > 0)
System.out.println( "Positivo, " + Num );
else if (Num < 0)
System.out.println( "Negativo, " + Num);
else
System.out.println("Numero é nulo");

}
}