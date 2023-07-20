import java.util.*;
import java.io.*;
public class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printPermutations(str,"");
        

    }


    public static void printPermutations(String str,String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }


        for(int i=0;i<str.length();i++){
            chsr ch=str.charAt(i);
            String prei=str.substring(0,i);
            String posti=str.substring(i+1);
            Stringnewstr=prei+posti;

            str=prei+posti;
            printPermutations(newstr,asf+ch)
        }

    }
}