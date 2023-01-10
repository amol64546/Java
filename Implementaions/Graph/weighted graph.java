import java.util.*;
public class Main {
  
    
   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
	   int vertices = sc.nextInt();	      
       int edges = sc.nextInt();
       
       ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
       for(int i=0; i<vertices; i++){
           adj.add(new ArrayList<ArrayList<Integer>>());
       }
       
       for(int i=0; i<edges; i++){
           int u = sc.nextInt();
           int v = sc.nextInt();
           int wt = sc.nextInt();
           ArrayList<Integer> t1 = new ArrayList<>();
           ArrayList<Integer> t2 = new ArrayList<>();
           t1.add(v);
           t1.add(wt);
           t2.add(u);
           t2.add(wt);
           adj.get(u).add(t1);
           adj.get(v).add(t2);
       }

       int[] minDist = dijkstra(vertices,adj,0);
       System.out.println(Arrays.toString(minDist));
       
   }
    
      static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
 
	  int[] minDist = new int[V];
	  Arrays.fill(minDist, -1);
          
	  // PriorityQueue<Pair> q = new PriorityQueue<>((Pair a, Pair b) -> a.wt-b.wt);
	  PriorityQueue<Pair> q = new PriorityQueue<>();
	 
	  q.offer(new Pair(S,0));  
	  
	  while(!q.isEmpty()){
	      Pair p = q.poll();
		 
		  if(minDist[p.v]!=-1) continue;
		  minDist[p.v] = p.wt;
		
		  for(ArrayList<Integer> list : adj.get(p.v)){			  
				  int nbr = list.get(0);
				  int wt = list.get(1);
				q.offer(new Pair(nbr, wt + p.wt));
				 	  
		  }	
		   
	  }
	  return minDist;       
  }
    
     static class Pair implements Comparable<Pair> {
         int v, wt;     
         Pair(int v, int wt){
             this.v = v;
            this.wt = wt;            
        }
         @Override
        public int compareTo(Pair that){
            return this.wt - that.wt;
        }
   }
        
}
