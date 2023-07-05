public class Manzano02C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else {
            System.out.println("Entre com a nota do exame:");
            double notaExame = scanner.nextDouble();

            double novaMedia = (media + notaExame) / 2;

            if (novaMedia >= 5) {
                System.out.println("O aluno foi aprovado em exame com média " + novaMedia);
            } else {
                System.out.println("O aluno foi reprovado com média " + novaMedia);
            }
        }

        scanner.close();
    }
}
