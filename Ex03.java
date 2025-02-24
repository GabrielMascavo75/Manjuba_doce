import java.text.NumberFormat;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[]args){

        System.out.println("Informe o seu nome: ");
        Scanner nome = new Scanner(System.in);
        String nomefuncionario = nome.nextLine();

        System.out.println("Informe o seu salário: ");
        Scanner salario = new Scanner(System.in);
        Double salariofuncionario = salario.nextDouble();
        salario.close();
        System.out.println((" O funcionario " + nomefuncionario + " " + " tem o salario de " + NumberFormat.getCurrencyInstance().format(salariofuncionario)));
    }
}
