package Faccat;
import java.util.Scanner;

public class Exercicio27LerValor {
	
	    public static void main(String[]args){

	        //Declarando valor

	        Scanner sc=new Scanner(System.in);
	        System.out.println("Digite um valor: ");
	        int numero = sc.nextInt();
	        // resultado
	        if (numero > 0) {
	            System.out.println("O n�mero � positivo");
	        } else if (numero < 0) {
	            System.out.println("O n�mero � negativo");
	        } else {
	            System.out.println("O n�mero � igual a zero");
	        }

	    }
	}

