package Demo;

import java.util.*;

public class BFSGraph {
	static void bfs(
			ArrayList<ArrayList<Integer>> graph,
			int start) {
		
		boolean[] visited = new boolean[graph.size()];
		
		Queue<Integer> queue = new LinkedList<>();
		
		visited[start] = true;
		
		queue.add(start);
		
		while (!queue.isEmpty()) {
			
			int current = queue.poll();
			
			System.out.print(current + " ");
			
			for (int neighbour : graph.get(current)) {
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
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
		
		graph.get(0).add(1);
		graph.get(0).add(2);
		
		graph.get(1).add(3);
		graph.get(1).add(4);
		
		graph.get(2).add(5);
		
		bfs(graph, 0);
	}
}