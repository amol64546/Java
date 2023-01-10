import java.util.*;

public class MyGraph {

    
    static void print(int[][] graph) {
        for (int[] x : graph) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }
      

  public static void main(String[] args) throws java.lang.Exception {
       
       Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();	      
	        int [][] graph = new int[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                graph[i][j]=sc.nextInt();
	            }
	        }
		// print();
      
        boolean[] visited = new boolean[n];

        dfs(graph,0,visited);
      
  }
    
     static void dfs(int [][] graph, int src, boolean[] visited){
        visited[src] = true;
        System.out.print(src+" ");
        
        int[] nbr = graph[src];
        
        for(int j=0; j<graph.length; j++){
            if( nbr[j] != 0 && !visited[j]){
                dfs(graph,j,visited);
            }
        }
    }
    
    
    
       
    
}
