public class E2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> valores = new java.util.ArrayList<>();

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um número inteiro " + (i + 1) + " de 15: ");
            int valor = scanner.nextInt();
            valores.add(valor);
        }

        int maior = valores.get(0);
        for (int i = 1; i < valores.size(); i++) {
            if (valores.get(i) > maior) {
                maior = valores.get(i);
            }
        }
        //Outra maneira de encontrar o maior número
        //int maximo = java.util.Collections.max(valores);
        System.out.println("O maior número digitado é: " + maior);

    }
}
