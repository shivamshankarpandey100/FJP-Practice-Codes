import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int str=sc.nextInt();
        ArrayList<String> words=getKPC(str);
        System.out.println(words);
    }

    public static String[] codes={".;","abc","efg","hij","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {

        if(str.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }


        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres=getKPC(ros);
        ArrayList<String> mres=new ArrayList<>();
        String code=codes[ch-48];
        for(int i=0;i<code.length();i++){
            char chi=code.charAt(i);
            for(String rstr:rres){
                mres.add(chi+rstr);
            }
        }
        return mres;
    }

}