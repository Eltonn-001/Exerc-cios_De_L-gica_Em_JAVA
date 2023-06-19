package Faccat;
import java.util.Scanner;

public class Exercicio23PesoIdealIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Qual seu sexo � M (masculino) ou F (feminino): ");
        char sexo = sc.next().charAt(0);

        System.out.println("Qual sua altura: ");
        float altura = sc.nextFloat();

        float pesoideal = 0;
        if (sexo == 'M') {
            pesoideal = (72.7f * altura) - 58;
            System.out.println("Ol� " + nome + ". Esse � seu peso ideal: " + pesoideal);
        } else {
            pesoideal = (62.1f * altura) - 44.7f;
            System.out.println("Ol� " + nome + ". Esse � seu peso ideal: " + pesoideal);
        }

        sc.close();
    }
}
