import java.util.*;
import java.io.*;

public class Main{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();

        printKPC(st,"");
    }

    static String[] arr={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str,String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char ch=str.chatrAt(0);
        str=str.substring(1);

        String tobeexpressed=arr[ch-'0'];

        for(int i=0;i<tobeexpressed.length();i++){
            char choices=tobeexpressed.charAt(i);

            printkpc(str,asf+choices);
        }


    }

}