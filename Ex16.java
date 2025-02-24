import java.util.Scanner;

public class Ex16 {
    public static void main (String[] args) {
        Scanner fumo = new Scanner(System.in);

        System.out.println("Quantos cigarros você fuma por dia? :");
        int cigarro = fumo.nextInt();

        System.out.println("Há quantos anos você fuma?: ");
        int ano= fumo.nextInt();
        fumo.close();

        int lose_minutes = cigarro * 10;
        int lose_years = (lose_minutes * 365) * ano;
        int lose_life = lose_years/1440;

        System.out.println("Você perdeu " + lose_life + " dias da sua vida até o momento, por favor pare!.");

    }
}
