import java.io.*;
import java.util.*;

public class Main185 {
  
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code

    Stack<Integer> vs = new Stack<>();
    Stack<String> is = new Stack<>();
    Stack<String> ps = new Stack<>();

    for(int i = exp.length() - 1; i >= 0; i--){
        char ch = exp.charAt(i);

        if(ch >= '0' && ch <= '9'){
            vs.push(ch - '0');
            is.push(ch + "");
            ps.push(ch + "");
        }
        else{
            int v1= vs.pop();
            int v2 = vs.pop();
            int ans = operation(v1, v2, ch);
            vs.push(ans);

            String iv1 = is.pop();
            String iv2 = is.pop();
            is.push("(" + iv1 + ch + iv2 + ")");

            String pv1 = ps.pop();
            String pv2 = ps.pop();
            ps.push(pv1 + pv2 + ch);
        }
    }

    System.out.println(vs.peek());
    System.out.println(is.peek());
    System.out.println(ps.peek());
 }

 static int operation(int v1, int v2, char op){
    if(op == '+'){
        return v1 + v2;
    }else if(op == '-'){
        return v1 - v2;
    }else if(op == '*'){
        return v1 * v2;
    }else{
        return v1 / v2;
    }
  }
}