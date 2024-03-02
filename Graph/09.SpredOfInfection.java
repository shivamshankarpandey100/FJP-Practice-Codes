import java.io.*;
import java.util.*;

public class Main167 {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   static class Pair{
      int vtx;
      int time;

      Pair(int vtx, int time){
         this.vtx = vtx;
         this.time = time;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      // write your code here
      int count = 0;
      ArrayDeque<Pair> queue = new ArrayDeque<>();
      queue.add(new Pair(src, 1));
      boolean [] visited = new boolean[vtces];

      while(queue.size() > 0){
         Pair rem = queue.remove();
         if(visited[rem.vtx] == true){
            continue;
         }

         visited[rem.vtx] = true;

         if(rem.time > t){
            break;
         }
         count++;
         for(Edge e: graph[rem.vtx]){
            if(visited[e.nbr] == false){
               queue.add(new Pair(e.nbr, rem.time + 1));
            }
         }
      }

      System.out.println(count);
   }

}