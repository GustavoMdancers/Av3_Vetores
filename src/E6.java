public class E6 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Cria uma lista de números inteiros pré-definidos
        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>(java.util.Arrays.asList(15, 30, 45, 60, 75, 90, 105, 120, 135, 150));

        // Exibe os números disponíveis e pede ao usuário para digitar o valor a ser removido
        System.out.println("Números disponíveis: " + numeros + "\n" + "Digite o valor que deseja remover: ");

        boolean input = false, fim = false; // Variáveis de controle para os loops

        while (!fim) { // Loop principal, continua até o usuário decidir parar
            while (!input) { // Loop para garantir uma entrada válida
                if (scanner.hasNextInt()) { // Verifica se a entrada é um número inteiro
                    int valor = scanner.nextInt(); // Lê o número digitado
                    if (numeros.contains(valor)) { // Verifica se o número está na lista
                        numeros.remove(Integer.valueOf(valor)); // Remove o número da lista
                        System.out.println("Número removido com sucesso! Números restantes: " + numeros);
                        input = true; // Sai do loop de entrada
                    } else {
                        System.out.println("Número não encontrado na lista."); // Mensagem se o número não estiver na lista
                    }
                }else {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro."); // Mensagem para entrada inválida
                    scanner.next(); // Limpa a entrada inválida
                }
            }
            // Pergunta ao usuário se deseja remover outro número
            System.out.println("Deseja remover outro número? (s/n)");
            String resposta = scanner.next(); // Lê a resposta do usuário
            if (resposta.equalsIgnoreCase("n")) { // Se a resposta for 'n', encerra o programa
                fim = true;
            } else if (resposta.equalsIgnoreCase("s")) { // Se a resposta for 's', permite nova remoção
                input = false; // Reseta o estado de input para permitir nova entrada
                System.out.println("Digite o valor que deseja remover: ");
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 's' ou 'n'."); // Mensagem para resposta inválida
            }
        }
        scanner.close(); // Fecha o Scanner ao final do programa
    }
}