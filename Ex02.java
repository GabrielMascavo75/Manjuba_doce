import java.util.Scanner;

public class Ex02 {
    public static void main(String[]args) {

        System.out.println("Informe o seu nome: ");
        Scanner no = new Scanner(System.in);
        String nome = no.nextLine();
        no.close();
        System.out.println("Olá " + nome + ", é um prazer te conhecer");


    }
}