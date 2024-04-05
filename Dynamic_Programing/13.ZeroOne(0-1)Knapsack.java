import java.util.*;

public class Main212 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []values = new int[n];
        for(int i = 0; i < n; i++){
            values[i] = sc.nextInt();
        } 

        int []weights = new int[n];
        for(int i = 0; i < n; i++){
            weights[i] = sc.nextInt();
        } 

        int cap = sc.nextInt();

        int [][]dp = new int[n + 1][cap + 1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                int idx = i - 1;
                int wt = weights[idx];
                int val = values[idx];

                if(j >= wt){
                    dp[i][j] = Math.max(dp[i - 1][j] + 0, dp[i - 1][j - wt] + val);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][cap]);

        sc.close();
    }
}