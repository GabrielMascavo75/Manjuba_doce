package Exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        System.out.println("Digite a largura da parede em metros: ");
        Scanner width = new Scanner(System.in);
        int largo = width.nextInt();

        System.out.println("Digite o comprimento da parede em metros: ");
        Scanner length = new Scanner(System.in);
        int longo = length.nextInt();

        int area = largo * longo;
        int tinta = area / 2;

        System.out.println("Você precisará de " + tinta + " litros de tinta para pintar uma área de " + area + " m2");
    }
}
