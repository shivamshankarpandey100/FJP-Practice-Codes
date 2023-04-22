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
        int fi=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if (data>arr[mid]){
                l=mid+1;
            }
            else if(data<arr[mid]){
                h=mid-1;
            }
            else{
                fi=mid;
                h=mid-1;
                 
            }
            
        }
        System.out.println(fi);


        int l=0;
        int h=arr.length-1;
        int li=-1;

        while(l<=h){
            int mid=(l+h)/2;
            if (data>arr[mid]){
                l=mid+1;
            }
            else if(data<arr[mid]){
                h=mid-1;
            }
            else{
                li=mid;
                l=mid+1;
                 
            }
            
        }
        System.out.println(li);
    }
}
// if(data>arr[mid]){
//                 l=mid+1;
//             }
//             else if(data<arr[mid]){
//                 h=mid-1;
//             }
//             else{
//                 fountAt=mid;
//                 break;
//             }