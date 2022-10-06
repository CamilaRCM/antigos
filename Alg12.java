import java.util.Scanner;
public class Alg12 {
public static void main (String[ ] args) {
int Num;

Scanner Ler = new Scanner(System.in);
System.out.println( "Informe um numero ");
Num = Ler.nextInt();
if  (Num < 0)
System.out.print( "Positivo, " + Num );
else
System.out.print( "Negativo, " + Num);
}
}