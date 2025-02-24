import java.util.Scanner;

public class Ex04 {
    public static void main(String[]args) {
        Scanner number = new Scanner (System.in);
        System.out.println("Insira o 1° número: ");
        int primeironum = number.nextInt();
        System.out.println("Insira o 2° número:");
        int segundonum = number.nextInt();

        int soma = primeironum + segundonum;

        System.out.println("A soma é: " + soma);
        if (soma != 0) {
            System.out.println("O valor " + "é diferente de 0");

        } else {
            System.out.println("A soma é igual a " + soma);
        }

    }
}
