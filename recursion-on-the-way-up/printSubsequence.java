import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        printSS(st,"");
    }
    public static void printSS(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch=str.charAt(0);
        str=str.substring(1);
        printSS(str,ans+ch);
        printSS(str,ans);
    }
}