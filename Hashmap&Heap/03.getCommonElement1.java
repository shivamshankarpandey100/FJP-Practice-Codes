import java.util.*;

public class Main152{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int n1=sc.nextInt();
    int[] arr1= new int[n1];
    for(int i=0;i<arr1.length();i++){
        arr1[i]=sc.nextInt();
    }

    int n2=sc.nextInt();
    int[] arr2= new int[n2];
    for(int i=0;i<arr2.length();i++){
        arr2[i]=sc.nextInt();
    }
HashMap<Integer, Integer> fmap=new HashMap<>();
    for(int val:arr1){
        if(fmap.containsKey(val)==false){
            fmap.put(val,1);
            
        }else{
            int of=fmap.get(val);
            int nf=of+1;
            fmap.put(val,nf);
        }
    }

    for(int val:arr2){
        if(fmap.containsKey(val)==true){
            System.out.println(val);
            fmap.remove(val);
        }
    }
}

}