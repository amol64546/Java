import java.util.*;
class MyGraph{		

	HashMap<Character,ArrayList<Character>> graph;

	MyGraph(){			
		graph = new HashMap<>();
		
	}

    void addEdge(char x,char y){
    	ArrayList list1 = graph.getOrDefault(x,new ArrayList<Character>());
    	list1.add(y);
    	graph.put(x,list1);

    	ArrayList list2 = graph.getOrDefault(y,new ArrayList<Character>());
    	list2.add(x);
    	graph.put(y,list2);

    }
   
    void addEdgeDir(char x,char y){
    	ArrayList list = graph.getOrDefault(x,new ArrayList<Character>());
    	list.add(y);
    	graph.put(x,list);
    }

     
    void print(){
    	System.out.println(graph);
    }
   
}


public class GraphByList{
	public static void main(String[] args){
		MyGraph g = new MyGraph();

//        Scanner sc = new Scanner(System.in);
//        int edges = sc.nextInt();
//        for(int i=0; i<edges; i++){   
//          g.addEdge(sc.next().charAt(0),sc.next().charAt(0));
//        }

		g.addEdge('a','b');
		g.addEdge('a','d');
		g.addEdge('b','c');
		g.addEdge('b','d');
		g.addEdge('d','e');
		g.addEdge('e','c');		
		g.print();


	}
}
