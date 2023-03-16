import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
     int nsp = n - 1;

    for (int i = 1; i <= n; i++)
      {
	for(int j=1;j<=nsp;j++){
	    System.out.print("\t");
	    }
	System.out.println("*\t");
	nsp--;
      }
  }
}