public class E3 {
    public static void main(String[] args) {
        int inteiros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        java.util.ArrayList<Integer> pares = new java.util.ArrayList<>();

        for (int numero : inteiros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        System.out.println("Números pares encontrados: " + pares.toArray().length);
        System.out.println(pares);
    }
}
