import java.util.Scanner;

public class Manzano01F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        String a = scanner.next();

        System.out.print("Digite o valor de B: ");
        String b = scanner.next();

        String temp = a;
        a = b;
        b = temp;

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        scanner.close();
    }
}
