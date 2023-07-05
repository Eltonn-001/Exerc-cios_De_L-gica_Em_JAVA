public class Manzano02H {
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

        System.out.print("Digite o quinto valor: ");
        int e = scanner.nextInt();

        int maior = a;
        int menor = a;

        if (b > maior) {
            maior = b;
        } else if (b < menor) {
            menor = b;
        }

        if (c > maior) {
            maior = c;
        } else if (c < menor) {
            menor = c;
        }

        if (d > maior) {
            maior = d;
        } else if (d < menor) {
            menor = d;
        }

        if (e > maior) {
            maior = e;
        } else if (e < menor) {
            menor = e;
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        scanner.close();
    }
}
