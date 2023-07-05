public class Manzano02E {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        // Calcular delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Verificar se é possível calcular as raízes
        if (a == 0 || delta < 0) {
            System.out.println("Não é possível calcular as raízes");
        } else {
            // Calcular as raízes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Apresentar as raízes
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        }

        scanner.close();
    }
}
