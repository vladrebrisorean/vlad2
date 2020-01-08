import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    System.out.println("Salut Vlad \n Te rog sa introduci 2 numere pentru a calcula suma:");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println(sum);

        System.out.println("Daca vrei sa facem o impartire, introdu 2 numere:");
        float i1 = in.nextInt();
        float i2 = in.nextInt();
        float imp = i1/i2;
        System.out.println(imp);
        System.out.println("Si acum tema la mate:");
        System.out.println("Rezultatul ecuatiei:-5 + 8 * 6 este:");
        int a = -5 + 8 * 6;
        System.out.println(a);
        System.out.println("Rezultatul ecuatiei: (55+9) % 9 este:");
        float b = (55 + 9) % 9;
        System.out.println(b);
        System.out.println("Rezultatul ecuatiei: 20 + -3*5 / 8  este:");
        float c = 20 + -3*5 / 8;
        System.out.println(c);
        System.out.println("Rezultatul ecuatiei: 5 + 15 / 3 * 2 - 8 % 3  este:");
        float d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(d);
    }
}