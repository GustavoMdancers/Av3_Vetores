public class E9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> valores = new java.util.ArrayList<>();

        int[] array1 = new int[6], array2 = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do primeiro array: ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("------------------------------");
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do segundo array: ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("------------------------------");

        // Preenchendo o ArrayList com os elementos comuns aos dois arrays
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (array1[i] == array2[j] && !valores.contains(array1[i])) {
                    valores.add(array1[i]);
                }
            }
        }

        if (valores.isEmpty()) {
            System.out.println("Não há números comuns entre os dois arrays.");
        } else {
            System.out.println("Valores do array 1: " + java.util.Arrays.toString(array1));
            System.out.println("Valores do array 2: " + java.util.Arrays.toString(array2));
            System.out.println("Os números comuns entre os dois arrays são: " + valores);
        }
    }
}
