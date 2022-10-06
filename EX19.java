import java.util.Scanner;
public class EX19 {
public static void main (String[ ] args) {

int idade;

Scanner Ler = new Scanner(System.in);

System.out.println("Digite sua idade: ");
idade=Ler.nextInt();

if  (idade<16)
System.out.println("Não Eleitor");

else if (idade> 17 && idade<66)
System.out.println("Eleitor Obrigatorio");
else
System.out.println("Eleitor Facultativo");
}
}