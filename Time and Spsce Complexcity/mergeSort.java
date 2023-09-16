import java.util.*;
public class Main{
    public static void main(String[]args){

        //it is for input od array and target
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    arr=mergeSort(arr,0,arr.length-1);
    for(int val:arr){
        System.out.print(val+"");

    }
    System.out.println(".");
       
    }
    public static int[] mergeSort(int[]arr,int lo, int hi){
        //base case
        if(lo==hi){
            int[] ba=new int[1];
            ba[0]=arr[lo];
            return ba;
        }

        int mid=(lo+hi)/2;
        int[] fsh=mergeSort(arr,lo,mid);
        int[] ssh=mergeSort(arr,mid+1,hi);
        int[] fsa=merge2sortedarrays(fsh,ssh);
        return fsa;
    }
    public static int[] merge2sortedarrays(int[] a, int[] b){
    //write your code here
    int [] ans= new int[a.length+b.length];
    int i=0;
    int j=0;
    int k=0;
    while(i<a.length && j<b.length){
        if(a[i]<b[i]){
            ans[k]=a[i];
            k++;
            i++;
        }
        else{
            ans[k]=b[j];
            k++;
            j++;
        }
        if(i==a.length){
            while(j<b.length){
        ans[k]=b[j];
            k++;
            j++;
        }
        
    }
    else if(j==b.length){
         while(i<a.length){
        ans[k]=a[i];
            k++;
            i++;
        }
    }
    }
    
    return ans;
  }
}