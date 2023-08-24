import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();

        System.out.print("Digite o ano de fabricação: ");
        int anoFabricacao = scanner.nextInt();

        String situacao = "";
        if (anoFabricacao < 2010) {
            situacao = "Carro Velho";
        } else if (anoFabricacao >= 2011 && anoFabricacao <= 2022) {
            situacao = "Carro Semi novo";
        } else if (anoFabricacao == 2023) {
            situacao = "Carro Novo";
        }

        String placaModificada = substituirVogaisPorAsterisco(placa);

        System.out.println("Situação: " + situacao);
        System.out.println("Placa modificada: " + placaModificada);

        scanner.close();
    }

    public static String substituirVogaisPorAsterisco(String placa) {
        String vogais = "aeiouAEIOU";
        StringBuilder placaModificada = new StringBuilder();

        for (char letra : placa.toCharArray()) {
            if (vogais.indexOf(letra) != -1) {
                placaModificada.append('*');
            } else {
                placaModificada.append(letra);
            }
        }

        return placaModificada.toString();
    }
}
