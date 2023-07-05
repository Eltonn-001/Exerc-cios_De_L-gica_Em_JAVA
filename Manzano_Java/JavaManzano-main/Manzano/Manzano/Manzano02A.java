public class Manzano02A {
    public static void main(String[] args) {
        // Ler os dois valores
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = scanner.nextInt();

        // Verificar qual valor é maior
        int diferenca;

        if (a > b) {
            diferenca = a - b;
        } else {
            diferenca = b - a;
        }

        // Apresentar a diferença
        System.out.println("A diferença do maior pelo menor valor é: " + diferenca);

        scanner.close();
    }
}
