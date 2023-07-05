public class Manzano02D {
    public static void main(String[] args) {
        // Ler as notas
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Calcular a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verificar se o aluno foi aprovado
        if (media >= 5) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else {
            System.out.println("O aluno foi reprovado com média " + media);
        }

        scanner.close();
    }
}
