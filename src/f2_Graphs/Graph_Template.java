package f2_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Graph_Template {
	static class Edge {
		int src;
		int nbr;
		int wt;

		Edge(int src, int nbr, int wt) {
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}
		
		@Override
		public String toString() {
			return src + "-" + nbr + "@" + wt;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int vtces = Integer.parseInt(br.readLine());
		
		ArrayList<Edge>[] graph = new ArrayList[vtces];
		for (int i = 0; i < vtces; i++) {
			graph[i] = new ArrayList<>();
		}
		
		System.out.println("ArrayList Graph Just After Inilization :");
		printGraph(graph);

		int edges = Integer.parseInt(br.readLine());
		for (int i = 0; i < edges; i++) {
			String[] parts = br.readLine().split(" "); 
			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);
			int wt = Integer.parseInt(parts[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		
		System.out.println("ArrayList Graph Just After Filling Values Inilization :");
		printGraph(graph);
	}

	public static void printGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			System.out.println("Vertex " + i + " -> " + graph[i]);
		}
	}
}