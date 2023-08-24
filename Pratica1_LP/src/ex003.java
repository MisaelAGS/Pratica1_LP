import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int numeroVogais = contarVogais(frase);

        System.out.println("O número de vogais na frase é: " + numeroVogais);

        scanner.close();
    }

    public static int contarVogais(String frase) {
        String vogais = "aeiouAEIOU";
        int contador = 0;

        for (char letra : frase.toCharArray()) {
            if (vogais.indexOf(letra) != -1) {
                contador++;
            }
        }

        return contador;
    }
}
