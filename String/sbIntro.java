import java.util.*;
public class Main{
    public static void main(String[][]args){
        StringBuilder sb=new StringBuilder("hello");

        char ch=sb.charAt(0);
       System.out.println(ch);


       sb.setCharAt(0,'b');//change
        System.out.println(sb);

        sb.deleteCharAt(0);//delete
        System.out.println(sb);


        sb.insert(0,'t');//insert
        System.out.println(sb);

        string s=sb.toString();
        System.out.println(s);    }
}