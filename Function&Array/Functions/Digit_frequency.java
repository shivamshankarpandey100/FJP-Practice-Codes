import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int d = sc.nextInt ();

    int f = getDigitFrequency(n, d);

    System.out.println(f);
  }
        
  public static int getDigitFrequency(int num, int dig){
      int f=0;
    while(num>0){
        int rem=num%10;
       num=num/10;
      
      if(rem==dig){
      f++;
      }
    }
    
    return f; 
  }
  
}