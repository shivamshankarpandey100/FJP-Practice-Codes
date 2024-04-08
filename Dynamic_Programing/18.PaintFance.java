import java.util.*;

public class Main217 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cii = 0;
        int cij = k;
        int total = cii + cij;

        for(int i = 2; i <= n; i++){
            int ncii = cij * 1;
            int ncij = total * (k - 1);
            int ntotal = ncii + ncij;

            cii = ncii;
            cij = ncij;
            total = ntotal;
        }

        System.out.println(total);

        sc.close();
    }
}