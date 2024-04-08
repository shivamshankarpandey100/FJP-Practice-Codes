import java.util.*;

public class Main218 {
    static class Item implements Comparable<Item> {
        int val;
        int wt;
        double vwRatio;

        public int compareTo(Item o){
            if(this.vwRatio < o.vwRatio){
                return -1;
            }else if(this.vwRatio > o.vwRatio){
                return +1;
            }else {
                return 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Item[] items = new Item[n];
        for(int i = 0; i < n; i++){
            items[i] = new Item();
            items[i].val = sc.nextInt(); 
        }

        for(int i = 0; i < n; i++){
            items[i].wt = sc.nextInt();
            items[i].vwRatio = items[i].val * 1.0 / items[i].wt;
        }

        Arrays.sort(items);

        double vib = 0;
        int rc = sc.nextInt();

        int i = n - 1;

        while(rc > 0){
            if(rc >= items[i].val){
                vib += items[i].val;
                rc -= items[i].wt;
            }else{
                vib += (rc * items[i].val * 1.0) / items[i].wt;
                rc = 0;
                break;
            }
 
            i--;
        }

        System.out.println(vib);

        sc.close();

    }

}