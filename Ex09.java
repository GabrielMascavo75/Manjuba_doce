package Exercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("Quantos reais você têm?: R$ ");
        Scanner real = new Scanner(System.in);
        Double money = real.nextDouble();
        real.close();

        Double dolar = money / 5.70;
        System.out.println("Com R$ " + money + " você comprar U$ " + dolar );

    }
}
