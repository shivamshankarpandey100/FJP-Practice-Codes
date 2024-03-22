import java.util.*;

public class Main200 {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fn = fib(n, new int[n + 1]);
    System.out.println(fn);

    sc.close();
 }

 static int fib(int n , int [] strg) {
    if(n == 0 || n == 1) {
        return n;
    }

    if(strg[n] != 0){
        return strg[n];
    }

    int fn1 = fib(n - 1, strg);
    int fn2 = fib(n - 2, strg);
    int fn = fn1 + fn2;

    strg[n] = fn;
    return fn;
 }
}