import java.io.*;

public class Main166 {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      // write your code here
      boolean [][] visited = new boolean[m][n];

      int count = 0;
      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(visited[i][j] == false && arr[i][j] == 0){
                count++;
                fillComp(arr, visited, i, j);
            }
        }
      }
      System.out.println(count);
   }

   static void fillComp(int [][] arr, boolean[][] visited, int i, int j){
    if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length){
        return;
    }
    if(visited[i][j] == true || arr[i][j] == 1){
        return;
    }

    visited[i][j] = true;
    fillComp(arr, visited, i + 1, j);
    fillComp(arr, visited, i - 1, j);
    fillComp(arr, visited, i, j + 1);
    fillComp(arr, visited, i, j - 1);
   }

}