import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total=n*m;
        int count=1;



        while(count<=total){
            //left wall,downword
            for(int i=minr;i<=maxr && count<=total;i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            //bottom wall,rightword
            for(int j=minc;j<=maxc && count<=total;j++){
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;

            //right wall,upword
            for(int i=maxr;i>=minr && count<=total;i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            //top wall rightword
            for(int j=maxc;j>=minc && count<=total;j--){
                System.out.println(arr[minr][j]);
                count++;
            }
            minr--;
        }
    }

}