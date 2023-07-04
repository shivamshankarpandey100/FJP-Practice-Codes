import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);


        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[][] one=new int[n1][m1];
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j]=sc.nextInt();
            }
        }

        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int[][] two=new int[n2][m2];
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                one[i][j]=sc.nextInt();
            }
        }
        if(m1!=n2){
            System.out.println("invalid input");
            return;
        } 

        int[][] prd=new int[n1][m2];
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                int val=0;
                for(int k=0;k<m1;k++){
                    val+=one[i][k]*two[k][j];
                }
                prd[i][j]=val;
            }
        }
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }
    }
}