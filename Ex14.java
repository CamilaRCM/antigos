import java.util.Scanner;
public class Ex14 {
public static void main (String[ ] args) {
int Num;

Scanner Ler = new Scanner(System.in);
System.out.println( "Informe um numero ");
Num = Ler.nextInt();
if  (Num  == 0)
System.out.println("Nulo");
else if (Num %2==1)
System.out.println("Impar");
else
System.out.println("Par");

}
}