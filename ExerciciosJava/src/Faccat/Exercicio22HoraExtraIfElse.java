package Faccat;
import java.util.Scanner;

public class Exercicio22HoraExtraIfElse {
	public static void main (String[]args) {
 Scanner sc=new Scanner(System.in);
  System.out.print("Quantas horas foram trabalhads esse m�s: ");
  float horames =sc.nextFloat();
  System.out.print("Quanto o funcion�rio recebe por hora trabalhada: ");
  float valorhora =sc.nextFloat();
  float salario = horames * valorhora;
  float horaextra = 0;
  if (horames <= 160) {
	  System.out.println("O sal�rio ser� :" + salario);
} else if (horames > 160) {
	horaextra = valorhora/2;
	salario = salario + horaextra;
	System.out.println("O sal�rio ser� :" + salario);
}{

}
sc.close();
	}
}
