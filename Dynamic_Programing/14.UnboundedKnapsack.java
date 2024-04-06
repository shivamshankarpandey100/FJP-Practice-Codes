import java.util.*;

public class Main213 {

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

        int []dp = new int[cap + 1];

        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < weights.length; j++){
                int wt = weights[j];
                int val = values[j];

                if(i >= wt){
                    dp[i] = Math.max(dp[i], dp[i - wt] + val);
                }
            }
        }

        System.out.println(dp[cap]);

        sc.close();
    }
}