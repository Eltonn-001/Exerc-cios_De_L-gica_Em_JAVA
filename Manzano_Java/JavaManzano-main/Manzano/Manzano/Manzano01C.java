import java.util.Scanner;

public class Manzano01C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da lata de óleo: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o raio da lata de óleo: ");
        double raio = scanner.nextDouble();

        double volume = altura * raio * raio * Math.PI;

        System.out.printf("O volume da lata de óleo é: %.2f cm³", volume);

        scanner.close();
    }
}
}
