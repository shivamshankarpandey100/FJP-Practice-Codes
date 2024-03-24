import java.util.*;

public class Main202 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int [] dp = new int[n + 1];
        dp[n] = 1;

        for(int i = n - 1; i >= 0; i--){
            dp[i] = 0;

            for(int j = i + 1; j <= i + arr[i]; j++){
                if(j < dp.length){
                    dp[i] = dp[i] + dp[j];
                }
            }
        }

        System.out.println(dp[0]);

        sc.close();
    }

}