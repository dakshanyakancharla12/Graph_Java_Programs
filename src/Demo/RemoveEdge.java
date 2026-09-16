package Demo;

import java.util.*;

public class RemoveEdge {
	static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	static void removeEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
		graph.get(u).remove(Integer.valueOf(v));
		graph.get(v).remove(Integer.valueOf(u));
	}
	static void display(ArrayList<ArrayList<Integer>> graph) {
		for(int i = 0; i < graph.size(); i++) {
			System.out.print(i + " -> ");
			for(int neighbour : graph.get(i)) {
				System.out.print(neighbour + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int vertices = 5;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 3);
		System.out.println("Before removing:");
		display(graph);
		removeEdge(graph, 0, 1);
		System.out.println("\nAfter removing:");
		display(graph);
	}
}