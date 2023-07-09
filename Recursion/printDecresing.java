import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printDecrising(n);
    }
    public static void printDecrising(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecrising(n-1);
    }
}