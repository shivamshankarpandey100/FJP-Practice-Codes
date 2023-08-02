import java.util.*;
public class Main{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int x=scn.nextInt();
        int n=sc.nextInt();
        int c=n;
        int pox=x;
        int ans=0;
        while(c>=1){
            int term=c*pox;
            ans+=term;
            c--;
            pox=pox*x;

        }
        System.out.println(ans);
    }
}