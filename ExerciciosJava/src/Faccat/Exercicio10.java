package Faccat;
import java.util.Scanner;

public class Exercicio10 {
		public static void main (String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Qual o custo de f�brica:");
			float custofabrica = sc.nextFloat();
			double distribuidor = custofabrica * 0.28;
			double impostos = custofabrica * 0.45;
			double valorFinal = custofabrica + distribuidor + impostos;
			System.out.println("O custo total do carro ser�: " + valorFinal);
			sc.close();
		}
	}