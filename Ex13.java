import java.text.NumberFormat;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Insira o salário do funcionário: ");
        Scanner salatual = new Scanner(System.in);
        Double salario = salatual.nextDouble();
        salatual.close();

        Double aumento = (salario * 15) / 100;
        Double salnovo = salario + aumento;

        System.out.println("Parabéns você recebeu um aumento de 15% pássara a receber: " + NumberFormat.getCurrencyInstance().format(salnovo));

    }
}
