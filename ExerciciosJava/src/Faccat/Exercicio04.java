package Faccat;
import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Digite um número: ");
	  int numero1 = sc.nextInt();
	  System.out.print("Digite outro número: ");
	  int numero2 = sc.nextInt();
	  int multiplicacao = numero1 * numero2;
	  System.out.print(numero1  + " * " + numero2 + " = " + multiplicacao);
	  sc.close();
  }
}
