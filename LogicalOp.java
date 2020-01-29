package tema3;

public class LogicalOp {

    public static void numaratoare(int x){
        for ( int i = x; i <100; i++ ){
            System.out.println(i);}
    }

    public static void numaratoare2(int x){
        for (int j = x; j>-100; j--){
            System.out.println(j);
        }
    }

    public static void numaratoare3(int x, int y){
        if (x < y){
        for( int i = x; i <= y; i++ ){
            System.out.println(i);
        }}else{
            for(int j = x; j>=y; j--){
                System.out.println(j);
            }
        }

    }

    public static void par(){
        for (int i = 0; i <=100; i++)
            if(i%2 == 0){
                System.out.println(i);
            }else{}
    }

    public static void impar(){
        for (int j = 0; j<= 100; j++){
            if ( j %2 != 0){
                System.out.println(j);
            }else{}
        }
    }

    public static int adunare(int x) {
        for (int i = x; i <= 100; i++) {
            x +=i;
        }
        System.out.println("adunarea numerelor este " + x );
        return x;
    }

    public static int media(int x){
       int j = 0;
        for (int i = x; i<= 100; i++){
            x+=i;
            j++;
        }
        int media = x/j;
        System.out.println("Media este: " + media);
        return media;
    }


    public static void tipar(){
        int i;
        int j;
        for ( i = 1; i < 8; i++){
            for ( j =1 ; j <=8-i; j ++) {
                System.out.println("*");

            }

        }
    }

}
