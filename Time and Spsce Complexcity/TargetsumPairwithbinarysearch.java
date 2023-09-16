import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int tar=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //sorting


        Arrays.sort(arr);//nlogn


        //binarysearch of the compliment
       for(int i=0;i<arr.length;i++){
        int theOthernumber=tar-arr[i];

        if(theOthernumber<arr[i]){
            break;
        }


        //binary search the new target
        int left=0;
        int right=arr.length-1;
         while(left<=right){
            int mid=(left+right)/2;
            if(theOthernumber<arr[mid]){
                right=mid-1;
            }
            else if(theOthernumber>arr[mid]){
                left=mid+1;
            }
            else{
                System.out.println(arr[i]+""+arr[mid]);
                break;
            }
         }
       }
    }
}