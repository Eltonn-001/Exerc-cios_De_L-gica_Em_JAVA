package Faccat;
import java.util.Scanner;

public class Exercicio08 {
		public static void main (String[]args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Total de eleitores: ");
			float totaleleitores = sc.nextFloat();
			System.out.println("Votos brancos: ");
			float votosbrancos = sc.nextFloat();
			System.out.println("Votos nulos: ");
			float votosnulos = sc.nextFloat();
			float votosvalidos = totaleleitores - votosbrancos - votosnulos;
			float porcentagemnulos = (float)(votosnulos/totaleleitores)*100;
			float porcentagembrancos = (float)(votosbrancos/totaleleitores)*100;
			float porcentagemvalidos = (float)(votosvalidos/totaleleitores)*100;
			System.out.println("A porcentagem de votos v�lidos �: " + porcentagemvalidos +
					"\n A porcentagem de votos nulos �: " + porcentagemnulos +
					"\n A porcentagem de votos brancos �: " + porcentagembrancos);
			sc.close();
			}
		}


