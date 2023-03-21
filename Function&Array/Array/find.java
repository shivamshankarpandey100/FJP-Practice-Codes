import java.util.*;
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
    int n2=sc.nextInt();
    int foundAt=-1;
    for(int i=0;i<arr.length;i++){
        if(n2==arr[i]){
            foundAt=i;
            break;
        }
    }
    System.out.println(foundAt);
    
  }
}
  
