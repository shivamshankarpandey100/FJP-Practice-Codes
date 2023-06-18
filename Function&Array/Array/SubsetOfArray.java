//array code 
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int lim=(1<<n);//bracket is mendit
    for(int i=0;i<lim;i++){
        int dec=i;
        //binary of the decimal and if rem is 0 dont other wise print element 
        String str="";
        for(int j=0;j<arr.length;j++){
            int rem=dec%2;
            dec=dec/2;
            if(rem==0){
                str="-\t"+str;
            }
            else{
                str=arr[arr.length-1-j]+"-\t"+str;
            }
        }
        System.out.println(str);
    }

 }

}