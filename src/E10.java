public class E10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        // Ordenando o array em ordem crescente
        java.util.Arrays.sort(numeros);
        System.out.println("------------------------------");
        System.out.println("Números em ordem crescente:" + java.util.Arrays.toString(numeros));

        scanner.close();
    }
}
