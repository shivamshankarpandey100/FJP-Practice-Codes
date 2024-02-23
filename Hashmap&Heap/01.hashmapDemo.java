import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] Args){
        HashMap<String, Integer> pmap=new HashMap();
        //add
        pmap.put("india",130);
        pmap.put("China",220);
        pmap.put("Aus",30);
        pmap.put("utopia",0);

        Syste.out.println(pmap);
        //for update the Value 
        pmap.put("Aus",51);
        Syste.out.println(pmap);

        //get
        int iPop=pmap.get("india");
        System.out.println(iPop);

        //Which is not in the table or When data not Available in it
        Integer usPop=pmap.get("us");
        Syste.out.println(usPop);
        //contains key use for check data is in the table or not
        Syste.out.println(pmap.containsKey("us")); 
        pmap.put("us",190);
        Syste.out.println(pmap.containsKey("us")); 
        
        //how to get all set of key and its Value

        set<String>keys=pmap.keySet();
        for(String key:keys){
            System.out.println(key);
            System.out.println(key+"----->"+pmap.get(key));
        }
        
        //-----> For remove keys
        pmap.remove("China");
        System.out.println(pmap);


    }
}