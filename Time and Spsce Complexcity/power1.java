import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();

        int xpn=power1(x,n);
        System.out.println(xpn);
    }
    public static int power1(int x, int n){
        if (n==0){
            return1;
        }
         int xpnm1=power1(x,n-1);
         int xpn=xpnm1*x;
         return xpn; 
    }

     public static int power2(int x, int n){
        if (n==0){
            return 1;
        }
         int xpb2=power1(x,n/2);
         int xpn=xpb2*xpb2;
         if(n%2==1){
            xpn=xpn*x;
         }
         return xpn; 
    }
}