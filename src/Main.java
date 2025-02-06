import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner escolhaUsuario = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 5) {
        System.out.println("\n-----Menu-----");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplição");
        System.out.println("4 - Divisão");
        System.out.println("5 - Saida");
        System.out.println("\nEscolha uma opção: ");
        escolha = escolhaUsuario.nextInt();

        if (escolha == 1) {
            System.out.println("Digite um numero: ");
            int numeroAdicao = escolhaUsuario.nextInt();
            System.out.println("Digite um numero: ");
            int numeroAdicao2 = escolhaUsuario.nextInt();
            int resultado = numeroAdicao + numeroAdicao2;
            System.out.println("Resultado: " + resultado);
        }
        else if (escolha == 2) {
            System.out.println("Digite um numero: ");
            int numeroSubtracao = escolhaUsuario.nextInt();
            System.out.println("Digite um numero: ");
            int numeroSubtracao2 = escolhaUsuario.nextInt();
            int resultado = numeroSubtracao - numeroSubtracao2;
            System.out.println("Resultado: " + resultado);

        }
        else if (escolha == 3) {
            System.out.println("Digite um numero: ");
            int numeroMultipliacao = escolhaUsuario.nextInt();
            System.out.println("Digite um numero: ");
            int numeroMultipliacao2 = escolhaUsuario.nextInt();
            int resultado = numeroMultipliacao * numeroMultipliacao2;
            System.out.println("Resultado: " + resultado);

        }
        else if (escolha == 4) {
            System.out.println("Digite um numero: ");
            int numeroDivisao = escolhaUsuario.nextInt();
            System.out.println("Digite um numero: ");
            int numeroDivisao2 = escolhaUsuario.nextInt();
            int resultado = numeroDivisao / numeroDivisao2;
            System.out.println("Resultado: " + resultado);

        }
        else if (escolha == 5) {
            System.out.println("Saindo...");
            break;
        }
        }

    }
}
