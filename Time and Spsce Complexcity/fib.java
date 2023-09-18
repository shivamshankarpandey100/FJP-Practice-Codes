import java.util.*;
public class Main{
    pusblic static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fn=fib(n);
        System.out.println(fibn);
    }
}



public static int fib(n){
    if(n==0 || n==1){
        return n;
    }
    int finnm1=fib(n-1);
    int finnm2=fib(n-2);
    int fibn =fibnm1+fibnm2;
    return fibn;
} 