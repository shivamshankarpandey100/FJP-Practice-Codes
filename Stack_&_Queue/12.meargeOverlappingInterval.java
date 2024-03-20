import java.io.*;
import java.util.*;

public class Main187 {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    static class Pair implements Comparable<Pair> {
        int start;
        int end;

        public int compareTo(Pair o){
            if(this.start != o.start){
                return this.start - o.start;
            }else{
                return this.end - o.end;
            }
        }
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        Pair[] pairs = new Pair[arr.length];
        for(int i = 0; i < pairs.length; i++){
            pairs[i] = new Pair();
            pairs[i].start = arr[i][0];
            pairs[i].end = arr[i][1];
        }

        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();

        for(int i = 0; i< pairs.length; i++){
            if(i == 0){
                st.push(pairs[0]);
            }else{
                Pair top = st.peek();
                Pair curr = pairs[i];

                if(curr.start > top.end){
                    st.push(curr);
                }else{
                    top.end = Math.max(curr.end, top.end);
                }
            }
        }

        Stack<Pair> rs = new Stack<>();
        while(st.size() > 0){
            rs.push(st.pop());
        }

        while(rs.size() > 0){
            Pair p = rs.pop();
            System.out.println(p.start + " " + p.end);
        }
    }

}