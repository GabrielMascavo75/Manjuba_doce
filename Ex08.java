import java.util.Scanner;

public class Ex08 {
    public static void main(String [] args) {
        System.out.println("Digite uma distância em metros: ");
        Scanner metro = new Scanner(System.in);
        int medida = metro.nextInt();
        metro.close();

        int conversor = medida * 100;
        System.out.println("Distância de " + conversor + " Cm");
    }
}
