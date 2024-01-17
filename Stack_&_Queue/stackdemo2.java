import java.util.*;
public class Main{
    public static void main(String[] args){
        Stack<String> stack= new Stack<>();
        stack.push("hello");
        stack.push("my");
        stack.push("Name");
        stack.push("is");
        stack.push("Shivam Shankatr Pandey");
        String r=stack.peek();
        System.out.println(r);
        while(stack.size()>0){
            String tos=stack.peek();
            System.out.println(tos);
            stack.pop();
        }
    }
}