import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextLine();
        getStairPaths(n);
    }

    public static ArrayList<String> getStairPaths(int n) {
            if(n==0){
                ArrayList<String> bres=new ArrayList<>();
                bres.add("");
                return bres;

            }
            else if(n<0){
                ArrayList<String> bres=new ArrayList<>();
                return bres;
            }



        ArrayList<String>pathFromnm1=getStairPaths(n-1);
        ArrayList<String>pathFromnm2=getStairPaths(n-2);
        ArrayList<String>pathFromnm3=getStairPaths(n-3);
        
        ArrayList<String> pathFromN = new ArrayList<>();
        for(String pathFromnm1:pathsFromnm1){
            String pathFromn = 1+pathFromnm1;
            pathsFromn.add(pathfromn);

        }

         for(String pathFromnm2:pathsFromnm2){
            String pathFromn = 2+pathFromnm2;
            pathsFromn.add(pathfromn);
            
        }

         for(String pathFromnm3:pathsFromnm3){
            String pathFromn = 3+pathFromnm3;
            pathsFromn.add(pathfromn);
            
        }

    }

}