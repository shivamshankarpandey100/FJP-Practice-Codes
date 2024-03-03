import java.io.*;
import java.util.*;

public class Main170 {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   static class Pair{
    int vtx;
    int level;

    Pair(int vtx, int level){
        this.vtx = vtx;
        this.level = level;
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      // write your code here
      Integer[] visited = new Integer[vtces];
      for(int i = 0; i < graph.length; i++){
        if(visited[i] == null){
            boolean isBip = IsCompBipartite(graph, visited, i);
            if(isBip == false){
                System.out.println(false);
                return;
            }

        }
      }
      System.out.println(true);
   }

   public static boolean IsCompBipartite(ArrayList<Edge>[] graph, Integer[] visited, int src){
    ArrayDeque<Pair> queue = new ArrayDeque<>();
    queue.add(new Pair(src, 1));

    while(queue.size() > 0){
        Pair rem = queue.remove();

        if(visited[rem.vtx] != null){
            int originalval = visited[rem.vtx];
            int newval = rem.level % 2;
            
            if(originalval != newval){
                return false;
            }
        }
        visited[rem.vtx] = rem.level % 2;

        for(Edge e : graph[rem.vtx]){
            if(visited[e.nbr] == null){
                queue.add(new Pair(e.nbr, rem.level + 1));
            }
        }
    }

    return true;
   }
}