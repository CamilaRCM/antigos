import java.util.Scanner;
public class Ex17 {
public static void main (String[ ] args) {

int idade;

Scanner Ler = new Scanner(System.in);

System.out.println("Digite sua idade: ");
idade=Ler.nextInt();

if  (idade> 5 && idade<13)
System.out.println("Infantil");

else if (idade> 12 && idade<18)
System.out.println("Juvenil");

else if (idade> 17 && idade<26)
System.out.println("Profissional");
else
System.out.println("Demais fora da faixa");
}
}