package Demo;

import java.util.*;

public class GraphBasic {
	static ArrayList<ArrayList<Integer>> createGraph(int vertices) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}
		return graph;
	}
	
	static void addEdge(
			ArrayList<ArrayList<Integer>> graph,
			int u,
			int v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	static void displayGraph(
			ArrayList<ArrayList<Integer>> graph) {
		
		for (int i = 0; i< graph.size(); i++) {
			System.out.print(i + "->");
			
			for (int neighbour : graph.get(i)) {
				System.out.print(neighbour + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int vertices = 5;
		
		ArrayList<ArrayList<Integer>> graph = createGraph(vertices);
		
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 2, 4);
		
		displayGraph(graph);
	}
}