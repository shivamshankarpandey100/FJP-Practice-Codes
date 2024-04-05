import java.util.*;

public class Main209 {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();

    // int []dp0 = new int [n + 1];
    // int []dp1 = new int [n + 1];
    
    // dp0[1] = 1;
    // dp1[1] = 1;

    // for(int i = 2; i <= n; i++){
    //     dp1[i] = dp1[i - 1] + dp0[i - 1];
    //     dp0[i] = dp1[i - 1];
    // }
    // System.out.println(dp1[n] + dp0[n]);

    // sc.close();

    int old_Zero = 1;
    int old_One = 1;

    for(int i = 2; i <= n; i++){
        int nOne = old_One + old_Zero;
        int nZero = old_One;
        
        old_Zero = nZero;
        old_One = nOne;
    }

    System.out.println(old_One + old_Zero);

    sc.close();
   }

}