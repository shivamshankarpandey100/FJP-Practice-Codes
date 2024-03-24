import java.util.*;

public class Main201 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int paths = jumps(n, new int[n + 1]);
        System.out.println(paths);

        sc.close();
    }

    static int jumps(int n, int [] strg) {
        if(n == 0){
            return 1;
        }else if(n < 0) {
            return 0;
        }

        if(strg[n] != 0){
            return strg[n];
        }

        int path1 = jumps(n -1 , strg);
        int path2 = jumps(n -2 , strg);
        int path3 = jumps(n -3 , strg);

        int tpaths = path1 + path2 + path3;

        strg[n] = tpaths;
        return tpaths;
    }

}