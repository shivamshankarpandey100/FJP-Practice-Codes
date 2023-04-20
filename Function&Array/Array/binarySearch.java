import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();

        int l=0;
        int h=arr.length-1;
        int fountAt=-1;
        while(l<=h){
            int mid=(l+h)/2;

            if(data>arr[mid]){
                l=mid+1;
            }
            else if(data<arr[mid]){
                h=mid-1;
            }
            else{
                fountAt=mid;
                break;
            }
        }
        System.out.println(fountAt);
    }
}