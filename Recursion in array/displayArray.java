import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int i){
        System.out.println(arr[i]);
        displayArr(arr,i+1);
    }

}