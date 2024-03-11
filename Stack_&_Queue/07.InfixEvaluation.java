import java.io.*;
import java.util.*;

public class Main182 {
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code

    Stack<Integer> valstack = new Stack<>();
    Stack<Character> opstack = new Stack<>();

    for(int i = 0; i< exp.length(); i++){
        char ch = exp.charAt(i);

        if(ch == '('){
            opstack.push(ch);
        }
        else if(ch >= '0' && ch <= '9'){
            valstack.push(ch - '0');
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            while(opstack.size() > 0 && opstack.peek() != '(' && 
            precedence(opstack.peek()) >= precedence(ch)){
                doInfinx(opstack, valstack);
            }
            opstack.push(ch);
        }
        else if(ch == ')'){
            while(opstack.size() > 0 && opstack.peek() != '('){
                doInfinx(opstack, valstack);
            }
            opstack.push(ch);
        }

    }  

    while(opstack.size() > 0){
        doInfinx(opstack, valstack);
    }

    System.out.println(valstack.peek());

  }

  static void doInfinx(Stack<Character> opstack, Stack<Integer> valstack){
    char op = opstack.pop();
    int v2 = valstack.pop();
    int v1 = valstack.pop();
    int res = operation(v1, v2, op);
    valstack.push(res);
  }

  static int precedence(char op){
    if(op == '+'){
        return 1;
    }else if(op == '-'){
        return 1;
    }else if(op == '*'){
        return 2;
    }else{
        return 2;
    }
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