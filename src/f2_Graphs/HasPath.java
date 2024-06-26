package f2_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Flood Hill
 * Why did we declared Visited ?
 * So that we can keep track of it.
 * {@link }
 */
public class HasPath {
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

		System.out.println("ArrayList:After Creation");
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

		System.out.println("ArrayList:After Initilization");
		printGraph(graph);
		
		int src = Integer.parseInt(br.readLine());
		int dest = Integer.parseInt(br.readLine());
		System.out.println("Src:" + src);
		System.out.println("Dest:" + dest);
		
		boolean[] visited = new boolean[vtces];
		System.out.println("Arrays:Declaration"+Arrays.toString(visited));
		
		boolean path = hasPath(graph, src, dest, visited);
		System.out.println("Arrays:Before Completion of Program "+Arrays.toString(visited));
		System.out.println("Is there any Path --> "+path);
	}

	public static void printGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			System.out.println("Vertex " + i + " -> " + graph[i]);
		}
	}

	public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
		if (src == dest) {
			System.out.println("Arrays:Before Final Array"+Arrays.toString(visited));
			return true;
		}
		System.out.println("Current Source :"+src );
		System.out.println("Current Destination:"+dest );
		visited[src] = true; // It is used as Marker.
		System.out.println("Arrays:After Declaring Source True"+Arrays.toString(visited));
		for (Edge edge : graph[src]) // Need to Understand this 
		{
			if (visited[edge.nbr] == false) {
				boolean hasNbrPath = hasPath(graph, edge.nbr, dest, visited);
				
				if (hasNbrPath == true) {
					return true;
				}
			}

		}
		
		return false;
	}
}