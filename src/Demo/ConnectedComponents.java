package Demo;

import java.util.*;

public class ConnectedComponents {
	static void dfs(ArrayList<ArrayList<Integer>> graph,int current,boolean[] visited) {
		visited[current]=true;
		for(int neighbour: graph.get(current)) {
			if(!visited[neighbour]) {
				dfs(graph,neighbour,visited);
			}
		}
	}
	static int countComponents(ArrayList<ArrayList<Integer>> graph) {
		boolean[] visited=new boolean[graph.size()];
		int count=0;
		for(int i=0;i<graph.size();i++) {
			if(!visited[i]) {
				count++;
				dfs(graph,i,visited);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int vertices=5;
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		for(int i=0;i<vertices;i++) {
			graph.add(new ArrayList<>());
		}
		graph.get(0).add(1);
		graph.get(1).add(0);
		graph.get(2).add(3);
		graph.get(3).add(2);
		System.out.println(countComponents(graph));
	}
}