import java.util.*;
class MyGraph{
	int size;	
	int[][] graph;

	MyGraph(int n){
		this.size = n;		
		graph = new int[n][n];
	}

    void addEdge(int x,int y){
    	graph[x][y] = 1;
    	graph[y][x] = 1;

    }
    void addEdge(int x,int y, int w){
    	graph[x][y] = w;
    }
    void addEdgeDir(int x,int y){
    	graph[x][y] = 1;
    	graph[y][x] = 1;
    }
    void addEdgeDir(int x,int y, int w){
    	graph[x][y] = w;
    	graph[y][x] = w;
    }

    void print(){
    	for(int[] adj: graph){
    		for(int ver: adj){
    			System.out.print(ver+" ");
    		}
    		System.out.println();
    	}
    }

    
}


public class GraphByMatrix{
	public static void main(String[] args){
		MyGraph g = new MyGraph(6);
		g.addEdge(0,1);
		g.addEdge(0,4);
		g.addEdge(1,3);
		g.addEdge(1,2);
		g.addEdge(2,5);
		g.addEdge(5,3);
		g.addEdge(5,4);
		g.print();
		


	}
}
