import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] Args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();




        HashMap<Character, Integer> fmap=new HashMap();
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(fmap.containsKey(ch)==false){
                fmap.put(ch,1);
            }
            else{
                int of=fmap.get(ch);
                int nf=of+1;
                fmap.put(ch,nf);
            }
        }
        char mfch=ch.charAt(0);
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i)
            if(fmap.get(ch)>fmap.get(mfch)){
                mfch=ch;
            }
        }
        System.ouut.println(mfch);
        


    }
}