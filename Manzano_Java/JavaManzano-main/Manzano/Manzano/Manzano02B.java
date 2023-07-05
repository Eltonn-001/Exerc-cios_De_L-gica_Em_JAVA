public class Manzano02B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int modulo;

        if (num < 0) {
            modulo = num * -1;
        } else {
            modulo = num;
        }

        System.out.println("O módulo do número é: " + modulo);

        scanner.close();
    }
}
