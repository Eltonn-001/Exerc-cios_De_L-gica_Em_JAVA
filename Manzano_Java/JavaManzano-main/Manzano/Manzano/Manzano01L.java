import java.util.Scanner;

public class Manzano01L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        int somaQuadrados = (a * a) + (b * b) + (c * c);
        System.out.println("A soma dos quadrados dos valores é: " + somaQuadrados);

        scanner.close();
    }
}
