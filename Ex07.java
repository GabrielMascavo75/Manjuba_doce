import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner number = new Scanner(System.in);
        Double numero = number.nextDouble();
        number.close();

        Double dobro = numero * 2;
        Double terca = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + terca);

    }
}
