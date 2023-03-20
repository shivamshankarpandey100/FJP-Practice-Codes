import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int b = sc.nextInt ();
    int dn=getValueInBase(n, b);
   System.out.println(dn);
  }
  public static int getValueInBase(int n, int b){
    int dn=0;
    int bp=1;
    while(n>0){
        int rem=n%10;
        n=n/10;
        dn=dn+rem*bp;
        bp=bp*b;
    }
    return dn;
  }
  
}