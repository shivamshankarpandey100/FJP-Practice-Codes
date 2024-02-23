import java.util.*;

public class Main154{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int  i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt(); 
    }

    HashMap<Integer, Boolean> map = new HashMap<>();
    for(int val:arr){
        map.put(val,true);
    }
    for(int val:arr){
        if(mao.containsKey(val-1)==true){
            map.put(val,false);
        }
    }
    for(int val:arr){
        if(map.get(val)==true){
            int tsp=val;
            int tlen=1;
            while(map.containsKey(tsp+tlen)==true){
                tlen++;
            }
            if(tlen>mlen){
                msp=tsp;
                mlen=tlen;
            }
        }
    }
    for(int i=0; i<mlen; i++){
        System.out.println(msp+i);
    }

 }

}