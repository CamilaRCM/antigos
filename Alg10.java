
import java.util.Scanner;
public class Alg10 {
public static void main (String[ ] args) {
float Consumo, Distancia,Volume;

Scanner Ler = new Scanner(System.in);

System.out.println( "Informe a distancia total percorrida ");
Distancia=Ler.nextFloat();

System.out.println( "Informe o volume de combustivel consumido ");
Volume=Ler.nextFloat();

Consumo=(Distancia/Volume);

System.out.println("O Valor Consumido é:  " + Consumo );
}
}