public class E7 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int[] numeros = {10, 15, 20, 15, 30, 15, 10, 5, 20, 15, 10, 25, 30, 15, 10};

        System.out.println("Array de números: " + java.util.Arrays.toString(numeros));
        System.out.println("Insira um número inteiro para verificar se ele está repetido: ");
        int repetido = scanner.nextInt();

        java.util.ArrayList<Integer> numerosRepetidos = new java.util.ArrayList<>();

        for (int numero : numeros) {
            if (numero == repetido) {
                numerosRepetidos.add(numero);
            }
        }

        if (numerosRepetidos.isEmpty()) {
            System.out.println("O número " + repetido + " não está repetido no array.");
        } else {
            System.out.println("O número " + repetido + " está repetido " + numerosRepetidos.size() + " vezes no array." );
        }

    }
}
