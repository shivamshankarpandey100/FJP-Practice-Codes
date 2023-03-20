import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int sourceBase = sc.nextInt ();
    int destBase = sc.nextInt ();
    int ans=convertFromeb1tob2(n,sourceBase,destBase);
    System.out.println(ans);
  }
  public static int convertFromeb1tob2(int n, int b1, int b2){
    //b1todesimal
    int dec=getValueInDecimal(n,b1);
    int ans=getValueInBase(dec , b2);
    return ans;
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

  public static int getValueInDecimal(int n, int b){
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