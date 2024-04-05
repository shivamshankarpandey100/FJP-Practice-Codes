import java.util.*;

public class Main210 {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();

    int old_Zero = 1;
    int old_One = 1;

    for(int i = 2; i <= n; i++){
        int nOne = old_One + old_Zero;
        int nZero = old_One;
        
        old_Zero = nZero;
        old_One = nOne;
    }

    int oneside = old_One + old_Zero;
    int totalWays = oneside * oneside;

    System.out.println(totalWays);

    sc.close();
 }

}