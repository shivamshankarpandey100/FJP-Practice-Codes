import java.util.*;
public class Main{
    public static void main(String[]args){

        //it is for input od array and target
        Scanner sc=new Scanner(System.in);
        int tar=sc.nextInt();
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //sorting the array
        Arrays.sort(arr);

        //meet in middle 
        for(int i=0;i<arr.length;i++){
            int ntar=tar-arr[i];

            int j=i+1
            int k=arr.length-1;
            while(j<k){
                if(arr[j]+arr[k]<ntar){
                    j++;
                }
                else if(arr[j]+arr[k]>ntar){
                    k--;
                }
                else{
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]); 
                    j++;
                    k--;
                }
            }
        }

    }
}