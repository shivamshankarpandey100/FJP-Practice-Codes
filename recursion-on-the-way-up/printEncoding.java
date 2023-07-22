import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       printEncodings(str,"");
    }
    public static void printEncodings(String str,String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }


      char ch=str.charAt(0);
      if(ch=='0'){
        return;
      }
        int num=ch-'0';
        char chtobeadded=(char)('a'+num-1);
      printEncodings(str.substring(1),asf+chtobeadded);


        if(str.length()>1){
            char ch2=str.charAt(1);
            int num2=ch2-'0';
            int fnum=num*10+num2;
            if(fnum<=26){
                char ch2tobeadded=(char)('a'+fnum-1);
                printEncodings(str.substring(2),asf+ch2tobeadded);
            }
            
        }
    }
}