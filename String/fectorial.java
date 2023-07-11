import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int nm1f=factorial(n-1);
        int nf=n*nm1f;
        return nf;
    }
}