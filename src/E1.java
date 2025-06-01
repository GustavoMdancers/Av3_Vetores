public class E1 {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos números é: " + soma);

    }
}
