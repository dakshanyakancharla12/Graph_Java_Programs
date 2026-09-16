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
			
			
		}
	}
}