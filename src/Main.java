import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escolhaUsuario = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 5) {
            System.out.println("\n----- Menu -----");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Saída");
            System.out.print("\nEscolha uma opção: ");
            escolha = escolhaUsuario.nextInt();

            if (escolha >= 1 && escolha <= 4) {
                int numero1 = lerNumero("Digite um número: ", escolhaUsuario);
                int numero2 = lerNumero("Digite outro número: ", escolhaUsuario);
                int resultado = 0;

                switch (escolha) {
                    case 1 -> resultado = numero1 + numero2;
                    case 2 -> resultado = numero1 - numero2;
                    case 3 -> resultado = numero1 * numero2;
                    case 4 -> {
                        if (numero2 == 0) {
                            System.out.println("Erro: Não é possível dividir por zero!");
                            continue;
                        }
                        resultado = numero1 / numero2;
                    }
                }

                System.out.println("Resultado: " + resultado);
            } else if (escolha == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        escolhaUsuario.close();
    }

    private static int lerNumero(String mensagem, Scanner scanner) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }
}
