import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> ss=gss(str);
        System.out.println(ss);
        
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        
        char ch=str.charAt(0);
        String ros=str.subString(1);
        ArrayList<String> rres=gss(ros);
        ArrayList<String> mres= new ArrayList<>();
        for(String rstr:rres){
            mres.add("-"+rstr);
        }

            for(String rstr:rres){
                mres.add(ch+rstr);
            }
            return mres;
        
    }

}