import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n<0){
            ArrayList<String> bps = new ArrayList<>();
            return bps;
        }else if(n==0){
            ArrayList<String>  bps=new ArrayList<>();
            bps.add("");
            return bps; 
        }


        ArrayList<String> pathsfromnm1=getStairPaths(n-1);
        
        ArrayList<String> pathsfromnm2=getStairPaths(n-2);
        
        ArrayList<String> pathsfromnm3=getStairPaths(n-3);
        
        ArrayList<String> pathsfromn=new ArrayList<>();
        for(String pathfromnm1:pathsfromnm1){
            pathsfromn.add("1"+pathfromnm1);
        }
        for(String pathfromnm2:pathsfromnm2){
            pathsfromn.add("2"+pathfromnm2);
        }
        for(String pathfromnm3:pathsfromnm3){
            pathsfromn.add("3"+pathfromnm3);
        }
        return pathsfromn;
    }

}