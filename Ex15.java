import java.util.Scanner;
public class Ex15 {
public static void main (String[ ] args) {

String Time1;
String Time2;
int GolsTime1;
int GolsTime2;

Scanner Ler = new Scanner(System.in);

System.out.println( "Digite o nome do Time1");
Time1=Ler.nextLine();

System.out.println( "Digite quantidade de gols marcados pelo time1");
GolsTime1=Ler.nextInt();

Ler = new Scanner(System.in);

System.out.println( "Digite o nome do Time2");
Time2=Ler.nextLine();


System.out.println( "Digite quantidade de gols marcados pelo time2 ");
GolsTime2=Ler.nextInt();

if (GolsTime1 > GolsTime2)
System.out.println("Vitória, "+ Time1 );

else if  (GolsTime1 < GolsTime2)
System.out.println ("Vitória, "+ Time2);
else
System.out.println ("Empate");
}
}