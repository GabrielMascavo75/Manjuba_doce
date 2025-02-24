import java.text.NumberFormat;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Insira o preço do produto para ganhar a promoção: ");
        Scanner preco = new Scanner(System.in);
        Double valor = preco.nextDouble();
        preco.close();

        Double desconto = (valor * 5) / 100;
        Double descontado = valor - desconto;

        System.out.println("Com desconto de 5% você pagará " + NumberFormat.getCurrencyInstance().format(descontado));
    }
}
