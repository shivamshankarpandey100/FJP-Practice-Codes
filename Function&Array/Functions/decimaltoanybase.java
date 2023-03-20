import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int b = sc.nextInt ();
    int dn=getValueInBase(n, b);
   
  }
  public static int getValueInBase(int n, int b){
    int dn=0;
    int tp=1;
    while(n>0){
        int rem=n%b;
        n=n/b;
        dn=dn+rem*tp;
        tp=tp*10;
    }
    return dn;
  }
  
}