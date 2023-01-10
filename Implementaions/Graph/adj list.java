import java.util.*;
public class Main {
    
    
    public static List<List<Integer>> buildGraph(List<List<Integer>> edgeGraph, int v, int e){
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }       
        
         for(int i=0; i<e; i++){
             int src = edgeGraph.get(i).get(0);
             int dest = edgeGraph.get(i).get(1);
           
             graph.get(src).add(dest);
             graph.get(dest).add(src);             
         }
        
        return graph;
    }
    
   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
	   int vertices = sc.nextInt();	      
       int edges = sc.nextInt();
       
       List<List<Integer>> edgeGraph = new ArrayList<>();
       
       for(int i=0; i<edges; i++){
           int u = sc.nextInt();
           int v = sc.nextInt();
           List<Integer> list = new ArrayList<>();
           list.add(u);
           list.add(v);
           edgeGraph.add(list);
       }

      
       
       List<List<Integer>> graph = buildGraph(edgeGraph,vertices,edges);
       
       //  for(List<Integer> list: graph){
       //     System.out.println(list);
       // }
       
       boolean[] visited = new boolean[vertices];
       
       for(int i=0; i<vertices; i++){
           if(!visited[i])
            dfs(graph,i,visited);
       }      
       
   }
    
    public static void dfs(List<List<Integer>> graph,int src,boolean[] visited){
        visited[src] = true;
        
        System.out.print(src+" ");
        
        List<Integer> nbrs = graph.get(src);
        for(int nbr: nbrs){
            if(!visited[nbr]){
                dfs(graph,nbr,visited);
            }
        }   
        
    }
}
