package Faccat;
import java.util.Scanner;

public class Exercicio09 {
	  public static void main (String[]args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Qual o seu sal�rio total?: ");
	      float salariototal = sc.nextFloat();
	      System.out.println("Percentual de reajuste: ");
	      float porcentagemreajuste = sc.nextFloat();
	      float reajuste = (porcentagemreajuste*salariototal)/100;
	      float valorfinal = salariototal + reajuste;
	      System.out.println("O sal�rio total � de: " + salariototal +
	          "\n O reajuste ficar�: " + reajuste +
	          "\n O sal�rio total ser�: " + valorfinal);
	      sc.close();
	    }
	  }
