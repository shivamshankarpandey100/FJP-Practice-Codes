import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int twodarr[][]=new int[i][j];

        for(int i=0;i<twodarr.length;i++){
            for(int j=0;j<twodarr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int s=sc.nextInt();
        int r=sc.nextInt();
        //make a 1d array and fill it with the ring(Spiral display)
            int[] onedarr=fillOnedArray(twodarr,s);

        //rotate the 1d array
            rotate(onedarr);


        //fill the ring back from the rotated array
        fillTwodArray(onedarr,twodarr,s);

        for(int i=0;i<twodarr.length;i++){
            for(int j=0;j<twodarr[i].length;j++){
                System.out.print(twodarr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[] fillOnedArray(int[][]twodarr,int s){
        int rows=twodarr.length;
        int cols=twodarr[0].length;

        int rmin=s-1;
        int cmin=s-1;
        int rmax=rows-s;
        int cmax=cols-s;

        int sz=2*rmax + 2*cmax-2*rmin-2*cmin;

        int[] onedarr=new int[sz];

        int idx=0;

        //left wall
        for(int i=rmin,j=cmin; i<=rmax;i++){
            twodarr[i][j]=onedarr[idx];
            idx++;
        }
        cmin++;

        //botomwall
        for(int i=rmax,j=cmin;j<=cmax;j++){
            twodarr[i][j]=onedarr[idx];
            idx++;
        }
        rmax--;

        //rightwall
        for(int i=rmax,j=cmax;i>=rmin;i--){
            twodarr[i][j]=onedarr[idx];
            idx++;
        }
        cmax--;


        //topwall
        for(int i=rmin,cmax;j>=cmin;j--){
            twodarr[i][j]=onedarr[idx];
            idx++;
        }
        rmin++;

    }


    public static void fillTwodArray(int [] onedarr,int[][]twodarr,int s){
        
    }





    public static void rotate(int[] onedarr,int r){
        r=r%onedarr.length;
        if(r<0){
            r+=onedarr.length;
        }

        reverse(onedarr,0,onedarr.length-r-1);
        reverse(onedarr,onedarr.length-r;onedarr.length-1);
        reverse(onedarr,0,onedarr.length-1);
    }






    public static void reverse(int[]onedarr,int left, int right ){
        while(left<right){
            int temp=onedarr[left];
            onedarr[left]=onedarr[right];
            onedarr[right]=temp;
            left++;
            right--;
        }
    }
}

