package tema3;

public class main {
    public static void main(String[] args) {

        int x = 19;
        int y = 1;
        System.out.println("Numarul mai mare dintre cele doua este: " + checkbignr(x, y));
        LogicalOp op = new LogicalOp();
       // op.numaratoare(x);
       // op.numaratoare2(y);
        //op.numaratoare3(x,y);
       // op.par();
       // op.impar();
        //op.adunare(x);
       // op.media(y);
        op.tipar();

    }


    public static int checkbignr(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }

}