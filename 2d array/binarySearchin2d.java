import java.util.*;
public class Main{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=arr[0].length;j++){
                arr[i][j]=sc.nextInt(); 
            }
        }
        int x=sc.nextInt();
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length && j>=0){
           if(x>arr[i][j]){
                i++;
           } 
           else if(x<arr[i][j]){
                j--;
           }
           else{
                System.out.println(i);
                System.out.println(j);
                return;
           }
        }
        System.out.println("not found");
    }
}