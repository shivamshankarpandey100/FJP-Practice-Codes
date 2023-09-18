import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fn=fib(n);
        System.out.println(fn);
    }
    public static int fib(int n){
    if(n==0 || n==1){
        return n;
    }
    int finnm1=fib(n-1);
    int finnm2=fib(n-2);
    int fibn =finnm1+finnm2;
    return fibn;
} 
}



