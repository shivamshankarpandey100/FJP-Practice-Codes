import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    // write your code here

    //dates
    countSort(arr, 1000000, 100,32);//0 to 31 indexes
    //month
    countSort(arr,10000,100,13);//0 to 12 indexes
    //year
    countSort(arr,1,10000,2501);//0 to 2500 indexes
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    // write your code here
      int [] farr=new int[range];
        int [] ans=new int[arr.length];


        //collecting the frequencies
        for(int i=0;i<arr.length;i++){
            int val=arr[i]/div % mod;
            farr[val]++;
        }
        //convert the freq to psa
        for(int i=1;i<farr.length;i++){
            farr[i]+=farr[i-1];
        }

        //fill the ans
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i]/div%mod;
            int pos=farr[val];
            ans[pos-1]=arr[i];
            farr[val]--;
        }
        //fill the origenal array
        for(int i=0;i<ans.length;i++){
            arr[i]=ans[i];
        }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}