import java.util.Scanner;

public class Manzano01M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        int soma = a + b + c;
        int quadradoSoma = soma * soma;

        System.out.printf("O quadrado da soma de A, B e C é: %d", quadradoSoma);

        scanner.close();
    }
}
