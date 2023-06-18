 import java.util.*;
 public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                System.out.println(arr[i][j]);
            }
            
            }
            else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.println(arr[i][j]);
                }
            }
         }

        }
 }