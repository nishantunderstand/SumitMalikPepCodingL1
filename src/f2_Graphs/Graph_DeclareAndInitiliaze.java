package f2_Graphs;

import java.util.ArrayList;

/**
 * You should always declare toString method
 * For Easier Printout Purpose.
 * {@link }
 */

public class Graph_DeclareAndInitiliaze {

	static class Edge {
		// Member Declare
		int src;
		int nbr;
		int wt;

		// Constructor Declare
		public Edge(int src, int nbr, int wt) {
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}

		@Override
		public String toString() {
			return "Edge{src=" + src + ", nbr=" + nbr + ", wt=" + wt + '}';
		}
	}

	public static void main(String[] args) {
		int vces = 7;
		ArrayList<Edge>[] graph = new ArrayList[vces];

		for (int i = 0; i < vces; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		// How to determine Adjaceny List / Matrix
		graph[0].add(new Edge(0, 3, 40));
		graph[0].add(new Edge(0, 1, 10));

		graph[1].add(new Edge(1, 0, 10));
		graph[1].add(new Edge(1, 2, 10));

		graph[2].add(new Edge(2, 3, 10));
		graph[2].add(new Edge(2, 1, 10));

		graph[3].add(new Edge(3, 0, 40));
		graph[3].add(new Edge(3, 2, 10));
		graph[3].add(new Edge(3, 4, 2));

		graph[4].add(new Edge(4, 3, 2));
		graph[4].add(new Edge(4, 5, 3));
		graph[4].add(new Edge(4, 6, 3));

		graph[5].add(new Edge(5, 4, 3));
		graph[5].add(new Edge(5, 6, 3));

		graph[6].add(new Edge(6, 5, 3));
		graph[6].add(new Edge(6, 4, 8));

		System.out.println("Print graph :");
		for (ArrayList<Edge> Edges : graph) {
			System.out.println(Edges);
		}
	}

}
