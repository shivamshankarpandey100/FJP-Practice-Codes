import java.io.*;
import java.util.*;

public class Main183 {
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code

    Stack<Character> ostack = new Stack<>();
    Stack<String> pre = new Stack<>();
    Stack<String> post = new Stack<>();

    for(int i = 0; i < exp.length(); i++){
        char ch = exp.charAt(i);

        if(ch == '('){
            ostack.push(ch);
        }
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
            pre.push(ch + "");
            post.push(ch + "");
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            while(ostack.size() > 0 && ostack.peek() != '(' && 
            precedence(ch) <= precedence(ostack.peek())){
                conversion(ostack, pre, post);
            }

            ostack.push(ch);
        }
        else if(ch == ')'){
            while(ostack.size() > 0 && ostack.peek() != '('){
                conversion(ostack, pre, post);
            }
            ostack.pop();
        }
    }

    while(ostack.size() > 0){
        conversion(ostack, pre, post);
    }

    System.out.println(post.peek());
    System.out.println(pre.peek());
 }
 static void conversion(Stack<Character> ostack, Stack<String> pre, Stack<String> post){
    char op = ostack.pop();

    String preval2 = pre.pop();
    String preval1 = pre.pop();
    pre.push(op + preval1 + preval2);

    String postval2 = post.pop();
    String postval1 = post.pop();
    post.push(postval1 + postval2 + op);
 }

 static int precedence(char ch){
    if(ch == '+'){
        return 1;
    }else if(ch == '-'){
        return 1;
    }else if(ch == '*'){
        return 2;
    }else{
        return 2;
    }
 }
}