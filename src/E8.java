public class E8 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] array1 = new int[5], array2 = new int[5], array3 = new int[10];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do primeiro array: ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do segundo array: ");
            array2[i] = scanner.nextInt();
        }

        // Preenchendo o terceiro array com os elementos dos dois primeiros
        for (int i = 0; i < 5; i++) {
            array3[i] = array1[i];
            array3[i + 5] = array2[i];
        }
        java.util.Arrays.sort(array3);

        System.out.print("O terceiro array, que contém os elementos dos dois primeiros, é: " + java.util.Arrays.toString(array3));

    }
}
