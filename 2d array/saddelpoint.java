import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                 arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            //find the lowes value in row 
            int min=arr[i][0];
            int psj=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    pst=j;
                }
            }


            //confirm it is maximum in column
            boolean isSaddle=true;
            for(int i=0;i<arr.length;i++){
                if(arr[i][psj]>min){
                    isSaddle=false;
                    brake;
                }
            }
            if(isSaddle==true){
                System.out.println(min);
                return
            }
        
        }
        System.out.println("Invalid input");
    }
}