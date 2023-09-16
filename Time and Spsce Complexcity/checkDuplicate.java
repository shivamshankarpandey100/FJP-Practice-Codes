import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in)
        int n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);//nlogn

        //Array.sort(arr) is use to sort the array
        int dup=-1;
        for(int i=1;i<arr.length-2;i++){
            if(arr[i]==arr[i+1]){
                dup=arr[i];
                break;
            }
        }
        System.out.println(sup);
    }
}