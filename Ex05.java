import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a 1 nota: ");
        double primeiranota = scanner.nextDouble();

        System.out.println("Informe a 2 nota: ");
        double segundanota = scanner.nextDouble();

        double media = (primeiranota + segundanota) / 2;
        System.out.println("A média entre "+ primeiranota + " e " + segundanota+ " é " + media);

        scanner.close();
    }
}
