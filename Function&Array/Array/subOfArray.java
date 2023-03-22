import java.util.*;
import java.io.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] arr = new int [n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    //
    for(int si=0;si<arr.length;si++){
        for(int ei=si;ei<arr.length;ei++){
            for(int i=si;i<=ei;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println();

        }
    }
    
  }
}
  
