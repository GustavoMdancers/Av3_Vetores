public class E4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>();

        for (int i = 0; i < 8 ; i++) {
            System.out.println("Digite um número inteiro " + (i + 1) + " de 8: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.print("A ordem inversa dos números inseridos é: ");
        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.print(numeros.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
