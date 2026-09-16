package Demo;

import java.util.*;

public class DFSGraph {
	static void dfs(
			ArrayList<ArrayList<Integer>> graph,
			int current,
			boolean[] visited) {
		
		visited[current] = true;
		
		System.out.print(current + " ");
		
		for (int neighbour : graph.get(current)) {
			if (!visited[neighbour]) {
				dfs(graph, neighbour, visited);
			}
		}
	}
	
	public static void main(String[] args) {
		int vertices = 6;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}
		
		graph.get(0).add(1);
		graph.get(0).add(2);
		
		graph.get(1).add(3);
		graph.get(1).add(4);
		
		graph.get(2).add(5);
		
		boolean[] visited = new boolean[vertices];
		
		dfs(graph, 0 , visited);
	}
}	