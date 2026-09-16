package Demo;

import java.util.*;

public class DFSStack {
	
	static void dfs(
			ArrayList<ArrayList<Integer>> graph,
			int start) {
		
		boolean[] visited = new boolean[graph.size()];
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(start);
		
		while (!stack.isEmpty()) {
			int current = stack.pop();
			
			if (visited[current]) {
				continue;
			}
			
			visited[current] = true;
			
			System.out.print(current + " ");
			
			for (int neighbour : graph.get(current)) {
				if (!visited[neighbour]) {
					stack.push(neighbour);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int vertices = 6;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}
		
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 5);
		
		dfs(graph, 0);
	}
	
	static void addEdge(
			ArrayList<ArrayList<Integer>> graph,
			int u,
			int v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
}