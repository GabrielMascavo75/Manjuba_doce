import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos quilômetros andou com o carro?: ");
        int quilometros = scanner.nextInt();

        System.out.print("Quantos dias esteve com o carro?: ");
        int dias = scanner.nextInt();

        double precoPorKm = quilometros * 0.20;
        int precoPorDia = dias * 90;
        double total = precoPorKm + precoPorDia;

        System.out.printf("O total será de R$ %.2f%n", total);

        scanner.close();
    }
}