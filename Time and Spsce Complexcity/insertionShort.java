import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       } 

       for(int i=1;i<=arr.length-1;i++){
        for(int j=i-1;j>=0;j--){
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
             else{
                break;
             }
        }
       }
       for(int val: arr){
        System.out.print(val+" ");
       }
       System.out.println(".");
    }
}
