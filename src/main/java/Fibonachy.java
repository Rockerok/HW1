public class Fibonachy {
//    рекурсия
    public static int fibonachi_rec(int fib){
        if (fib == 0){
            return 0;
        }
        if (fib == 1){
            return 1;
        }
        else{
            return fibonachi_rec(fib - 1) + fibonachi_rec(fib - 2);
        }
    }
    public static int fibonachi_cicle(int fib) {
        return fib;
    }
    }

