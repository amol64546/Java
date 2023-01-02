import java.util.*;

class MyGraph{		
	HashMap<Character,ArrayList<Map.Entry<Character,Integer>>> graph;

	MyGraph(){			
		graph = new HashMap<>();		
	}

   
     void addEdge(char x,char y,int w){
    	ArrayList list1 = graph.getOrDefault(x,new ArrayList<Map.Entry<Character,Integer>>());
    	list1.add(Map.entry(y,w));
    	graph.put(x,list1);

    	ArrayList list2 = graph.getOrDefault(y,new ArrayList<Map.Entry<Character,Integer>>());
    	list2.add(Map.entry(x,w));
    	graph.put(y,list2);
    }

    void addEdgeDir(char x,char y,int w){
    	ArrayList list1 = graph.getOrDefault(x,new ArrayList<Map.Entry<Character,Integer>>());
    	list1.add(Map.entry(y,w));
    	graph.put(x,list1);
    }
    
    void print(){
    	System.out.println(graph);
    }    
}


public class WGraphByList{
	public static void main(String[] args){
		MyGraph g = new MyGraph();
		g.addEdge('a','b',2);
		g.addEdge('a','d',6);
		g.addEdge('b','c',1);
		g.addEdge('b','d',8);
		g.addEdge('d','e',2);
		g.addEdge('e','c',7);		
		g.print();

	}
}