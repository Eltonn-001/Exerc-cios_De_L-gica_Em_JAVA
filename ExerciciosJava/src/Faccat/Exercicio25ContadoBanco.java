package Faccat;
import java.util.Scanner;

public class Exercicio25ContadoBanco {
	
	    public static void main(String[]args){
	        Scanner sc= new Scanner (System.in);

	        System.out.println("Numero da conta do cliente: ");
	        int numeroConta = sc.nextInt();

	        System.out.println("Digite o seu saldo: ");
	        float Saldo = sc.nextFloat();

	        System.out.println("Digite o seu d�bito: ");
	        float Debito = sc.nextFloat();

	        System.out.println("Digite o seu cr�dito: ");
	        float Credito = sc.nextFloat();

	        //Declara��es de numero de conta, d�bito e cr�dito

	        float saldoAtual = Saldo - (Debito + Credito);  //calculo do saldo

	        if (saldoAtual >=0){
	            System.out.println("Seu saldo � positivo");
	        } else{
	            System.out.println("Seu saldo � negativo");
	        }
	    }
	}
