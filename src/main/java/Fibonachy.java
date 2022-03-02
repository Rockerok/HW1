public class Fibonachy {
    public static int rezalt=0;
    //    рекурсия
    public static int fibonachi_rec(int fib){
        if (fib == 0){
            return rezalt=0;
        }
        if (fib == 1){
            return rezalt = 1;
        }
        else{
            rezalt = fibonachi_rec(fib - 1) + fibonachi_rec(fib - 2);
            return rezalt;
        }
    }
    public static int fibonachi_cicle(int fib) {
            rezalt =0;
            int fib1 = 0;
            int fib2 = 0;
            for (int i = 0; i < fib-2; i++) {
                fib1 = i;
                fib2 = fib1+i;
                rezalt = fib1+fib2;
            }
        return rezalt;
    }
}

