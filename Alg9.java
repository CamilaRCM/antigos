/**
 * @(#)Alg9.java
 *
 *
 * @author
 * @version 1.00 2022/3/22
 */

import java.util.Scanner;
public class Alg9 {
public static void main (String[ ] args) {

Scanner Ler = new Scanner(System.in);
double NumA;
double NumB;
double Area;

System.out.println( "Digite a altura do triângulo ");
NumA = Ler.nextDouble();

System.out.println( "Digite o tamanho da base do triângulo ");
NumB=Ler.nextDouble();

Area=(NumA*NumB)/2;

System.out.println ("a area do triangulo é:  "+ Area );

}
}