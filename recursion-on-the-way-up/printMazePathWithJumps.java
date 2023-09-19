import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int row = sc.nextInt();
        int col=sc.nextInt();
        printMazePaths(1,1,row,col,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        for(int hss=1;hss<=dc-sc;hss++){
            printMazePaths(sr,sc+hss,dr,dc,psf+"h"+hss);
        }
        for(int vss=1;vss<=dr-sr;vss++){
            printMazePaths(sr+vss,sc,dr,dc,psf+"v"+vss);
        }
        for(int dss=1;dss<=dr-sr && dss<=dc-sc;dss++){
            printMazePaths(sr+dss,sc,dr,dc,psf+"d"+dss);
        }
    }

}