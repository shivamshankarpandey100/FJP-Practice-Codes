import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    int nst=1;
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n/2;j++){
           if(i==n/2+1){
               System.out.print("*\t"); 
           }
           else{
                System.out.print("\t");
           }
          
       }
       for(int j=1;j<=nst;j++){
           System.out.print("*\t");
       }
       System.out.println();
       if(i<=n/2){
           nst++;
          
       }
       else{
           nst--;
       }
       
    }
  }
}