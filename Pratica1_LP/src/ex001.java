import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        System.out.print("Digite o valor de km por litro do veículo: ");
        double kmPorLitro = scanner.nextDouble();

        double consumoFinal = calcularConsumo(tempo, velocidadeMedia, kmPorLitro);

        System.out.printf("O consumo final de combustível é: %.2f litros%n", consumoFinal);

        scanner.close();
    }

    public static double calcularConsumo(double tempo, double velocidadeMedia, double kmPorLitro) {
        double distancia = tempo * velocidadeMedia;
        double consumo = distancia / kmPorLitro;
        return consumo;
    }
}
