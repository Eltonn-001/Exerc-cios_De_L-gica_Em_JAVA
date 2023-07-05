public class Manzano02G {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int c = scanner.nextInt();

        System.out.print("Digite o quarto valor: ");
        int d = scanner.nextInt();

        // Verificar quais valores são divisíveis por 2 e 3
        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println(a + " é divisível por 2 e 3");
        }

        if (b % 2 == 0 && b % 3 == 0) {
            System.out.println(b + " é divisível por 2 e 3");
        }

        if (c % 2 == 0 && c % 3 == 0) {
            System.out.println(c + " é divisível por 2 e 3");
        }

        if (d % 2 == 0 && d % 3 == 0) {
            System.out.println(d + " é divisível por 2 e 3");
        }

        scanner.close();
    }
}
