public class E5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>();
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro (" + (i + 1) + " de 10): ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        for (int numero : numeros) {
            soma +=  numero;
        }

        double media = (double) soma / numeros.size();

        java.util.List <Integer> acimaDaMedia = new java.util.ArrayList<>();

        for (int calcMedia : numeros) {
            if (calcMedia > media) {
                acimaDaMedia.add(calcMedia);
            }
        }

        System.out.println("A média dos números digitados é: " + media);
        System.out.println(acimaDaMedia.size() + " números acima da média: " + acimaDaMedia);
    }
}
