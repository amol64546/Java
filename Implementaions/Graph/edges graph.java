import java.util.*;
public class Main {   
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
	   int vertices = sc.nextInt();	      
       int edges = sc.nextInt();
       
       ArrayList<ArrayList<Edge>> adj = new ArrayList<>();
       for(int i=0; i<vertices; i++){
           adj.add(new ArrayList<Edge>());
       }
     
       for(int i=0; i<edges; i++){
           int u = sc.nextInt();
           int v = sc.nextInt();       
            adj.get(u).add(new Edge(u, v));
            adj.get(v).add(new Edge(v, u));           
       }
       
        boolean[] visited = new boolean[vertices];
       int src = sc.nextInt();
       int dest = sc.nextInt();
       
       ArrayList<Integer> path = new ArrayList<>();
	   
	   boolean[] vis = new boolean[vertices];
       path.add(src);
       
	   dfs(adj ,src , dest , visited,path );
       
       for(ArrayList<Integer> list: allPaths){
           System.out.println(list);
       }
       
   }
    
    static ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
    
    
     public static void dfs(ArrayList<ArrayList<Edge>> adj, int src , int dest ,boolean[] visited,ArrayList<Integer> path){
         
		visited[src] = true;
		if(src==dest){
			allPaths.add(new ArrayList<>(path));	
		}
         
		ArrayList<Edge> list = adj.get(src);
         
		for(int i=0; i<list.size(); i++){          
			int vertex = list.get(i).nbr;
			if(!visited[vertex]){
				path.add(vertex);
				dfs(adj,vertex,dest,visited,path);
				path.remove(path.size()-1);
			}
		}
		visited[src] = false;
	}
   

        
}
