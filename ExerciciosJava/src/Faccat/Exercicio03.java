package Faccat;
import java.util.Scanner;

public class Exercicio03 {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Digite um n�mero: ");
	 int numero1 = sc.nextInt();
	 System.out.println("Digite outro n�mero: ");
	 int numero2 = sc.nextInt();
	 int divisao = numero1 / numero2;
	 System.out.print(numero1 + " / " + numero2 + " = " + divisao);
	 sc.close();
 }
}
