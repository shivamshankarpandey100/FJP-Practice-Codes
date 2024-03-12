import java.io.*;
import java.util.*;

public class Main186{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code

    int val = 1;
    Stack<Integer> st = new Stack<>();

    for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);

        if(ch == 'd'){
            st.push(val);
            val++;
        }else{
            st.push(val);
            val++;

            while(st.size() > 0){
                int ans = st.pop();
                System.out.print(ans);
            }
        }
    }

    st.push(val);
    while(st.size() > 0){
        int ans = st.pop();
        System.out.print(ans);
    }
 }
}