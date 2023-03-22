import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    //Part 1...
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    //Part2.....
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
//Part3 for checking hight and print
    for(int ht=max;ht>=1;ht--){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=ht){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
  }
}
  
