import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        printMazePaths(0,0,dr-1,dc-1,"");
    }
    public static void printMazePaths(int sr,int sc,int dr, int dc, String psf){
       if(sr>dr || sc>dc){
        return;
       }
       if(sr==dr && sc==dc){
        System.out.println(psf);
        return;      
        }

       printMazePaths(sr,sc+1,dr,dc,psf+"h");
       printMazePaths(sr+1,sc,dr,dc,psf+"v");
    }
}