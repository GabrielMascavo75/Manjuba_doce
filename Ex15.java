import java.text.NumberFormat;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Quantos dias você trabalhou nesse mês?: ");
        int dayswork = scanner.nextInt();

        int moneyday = 8 * 25;
        int totalgrana = moneyday * dayswork;
        scanner.close();

        System.out.println("Seu salário esse mês é de " + NumberFormat.getCurrencyInstance().format(totalgrana));
    }
}
