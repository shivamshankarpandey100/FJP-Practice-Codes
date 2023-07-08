import java.util.*;
public class Main{
    public static void main(String[][]args){
        string s1="hello";
        System.out.println(s1);

        System.out.println(10+20+"hello"+10+20);
        String s="hello";
        System.out.println(s.substring(1,3));
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(0));
        System.out.println(s.substring(3));
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            System.out.println(ch);
        }
    }
}