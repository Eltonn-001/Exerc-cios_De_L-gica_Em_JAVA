public class Manzano02F {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        // Ordenar os valores em ordem crescente
        int[] valores = {a, b, c};

        Arrays.sort(valores);

        // Apresentar os valores em ordem crescente
        System.out.println("Os valores em ordem crescente são: " + valores[0] + ", " + valores[1] + " e " + valores[2]);

        scanner.close();
    }
}
