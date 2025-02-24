import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner calcu = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = calcu.nextInt();

        int antece = num - 1;
        int sucess = num + 1;
        System.out.println("O antecessor de " + num + " é " + antece );
        System.out.println("O sucessor de " + num + " é " + sucess);
        calcu.close();

    }
}
