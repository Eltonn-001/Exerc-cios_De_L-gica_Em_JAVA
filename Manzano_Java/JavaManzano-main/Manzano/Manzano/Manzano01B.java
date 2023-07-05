import java.util.Scanner;

public class Manzano01B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * (5/9.0);

        System.out.printf("A temperatura em Celsius é: %.2f°C", celsius);

        scanner.close();
    }
}
