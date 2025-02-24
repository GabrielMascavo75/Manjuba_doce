import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Insira os valores referentes a equação de segundo grau.");
        System.out.println("Digite o valor de A: ");
        Scanner a = new Scanner(System.in);
        int xisquadra = a.nextInt();

        System.out.println("Insira o valor de B: ");
        Scanner b = new Scanner(System.in);
        int bezaum = b.nextInt();

        System.out.println("Insira o valor de C: ");
        Scanner c = new Scanner(System.in);
        int cezaum = c.nextInt();
        c.close();

        int delta = (bezaum * bezaum) - 4 * xisquadra * cezaum;
        System.out.println("O valor de delta é " + delta);
    }
}