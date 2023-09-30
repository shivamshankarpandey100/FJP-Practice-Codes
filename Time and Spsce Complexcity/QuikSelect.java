import java.io.*;
import java.util.*;

public class Main {

  public static int quickSelect(int[] arr, int lo, int hi, int k) {
    if(lo==hi){
        return arr[lo];
    }
    //write your code here
    int pivot = arr[hi];
    int pidx=partition(arr,lo,hi,pivot);
    if(k==pidx){
        return pivot;
    }else if(k>pidx){
        return quickSelect(arr,pidx+1,hi,k);
    }else{
        return quickSelect(arr,lo,pidx-1,k);
    }
  }
  public Static int partition(int[] arr,int lo,int hi,int pivot){
    int i=0;
    int j=0;
    while(i<arr.length){
        if(arr[i]>pivot){
            i++;
        }
        else{
            swap(arr,i,j);
            i++;
            j++;
        }
       }
     return j-1;//j is the first larger and j-1 is where privot inventualy is
  }

 

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    System.out.println(quickSelect(arr,0,arr.length - 1,k - 1));
  }

}