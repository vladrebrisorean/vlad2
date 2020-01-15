package tema2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Nume();

        Scanner in = new Scanner(System.in);
        // introducem numerele de la tastatura si apelam clasa adunare pentru a aduna cele  numere
        System.out.println("Sa incepem cu o adunare, te rog sa introduci 2 numere:");
        System.out.println("Primul numar:");
        float t = in.nextInt();
        System.out.println("Al doilea numar numar:");
        float u = in.nextInt();
        float ad = adunare(t, u);
        System.out.println(ad);
        //scaderea

        System.out.println("Daca doresti sa facem o scadere te rog sa introduci 2 numere:");
        double a = in.nextInt();
        double b = in.nextInt();
        double scadere = scad(a, b);
        System.out.println(scadere);
        //impartirea
        System.out.println("Hai sa facem si o impartire, te rog sa introduci 2 numere:");
        float c = in.nextInt();
        float d = in.nextInt();
        float x = impartire(c, d);
        System.out.println(x);
        //inmultirea
        System.out.println("Felicitari \n Musai sa facem si inmultire \n Mai pune 2 numere: ");
        long e = in.nextInt();
        long f = in.nextInt();
        long n = inmultire(e, f);
        System.out.println(n);
        // restul impartirii a doua numere, fie ele si reale
        System.out.println("Efectuam restul impartirii a doua numere:");
        long p = in.nextInt();
        long r = in.nextInt();
        long o = rest(p, r);
        System.out.println(o);

        //media a 3 numere
        System.out.println("Media a 3 numere introduse de tine este:");
        double m1 = in.nextInt();
        double m2 = in.nextInt();
        double m3 = in.nextInt();
        double m4= media(m1,m2,m3);
        System.out.println(m4);
//figurine
        System.out.println("   J    A    V     V    A   \n   J   A A    V   V    A A  \nJ  J  AAAAA    V V    AAAAA \n JJ  A     A    V    A     A");
        System.out.println(" \n\n ");
        System.out.println(" +'''''+ \n[| o o |]\n |  ^  | \n | '_' | \n +-----+ ");

        System.out.println("Transformam temeperatura din F in C. Te rog sa introduci temperatura in Fahrenheit: ");
        double temp = in.nextInt();
        double temp2 = celsius(temp);
        System.out.println(temp2);

        System.out.println("Acum transformam inch in metri. Te rog sa introduci o valoare:");
        double inch = in.nextInt();
        double inch2 = inch(inch);
        System.out.println(inch2);

        System.out.println("Te rog sa introduci distanta in metri:");
        double h = in.nextInt();
        System.out.println("Acum intervalul de timp in ore,minute,secunde:");
        int j = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        double viteza1 = viteza(h,j,k,l);
        System.out.println("Viteza in metri pe secunda este:" +viteza1 +" in KM/ORA = " +viteza1*3.6 +" iar in mile/ora este:" + viteza1*3.6 *0.621371192f); // pentru a calcula viteza din m/s in km/hr formula este *3.6 iar 1km/ora = 0.621371192 miles per hour
    }

    public static void Nume() {
        System.out.println("Salut \n Vlad");

    }

    public static float adunare(float a, float b) {
        float adunare = a + b;
        return adunare;
    }

    public static double scad(double a, double b) {
        double scad = a - b;
        return scad;
    }

    public static float impartire(float a, float b) {
        float impartire = a / b;
        return impartire;
    }

    public static long inmultire(long a, long b) {
        long inmu = a * b;
        return inmu;
    }
    public static double media (double a, double b, double c){
        double media = (a+b+c) /3;
        return media;
    }

    public static long rest(long a, long b) {
        long rest = a % b;
        return rest;
    }

    public static double celsius(double a) {
        double b = a - 32;
        float c = 5 / 9f;
        double celsius = b * c;
        return celsius;
    }

    public static double inch(double a) {
        double metri = a * 0.0254f;
        return metri;
    }

    public static double viteza(double a, int b, int c, int d) {
        if (b != 0) {
            c = b*60;
            if (c != 0) {
                d = c*60;
            }
        } else d = d;
        double v = a / d;
        return v;
    }
}

