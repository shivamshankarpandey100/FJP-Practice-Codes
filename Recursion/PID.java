import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n+1;
        PID(i,n);
    }
    public static void PID(int i ,int n){
        if(n==0){    
            return;
        }
        System.out.println(i-n);
        PID(i,n-1);
        System.out.println(i-n);
    }
}