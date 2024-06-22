package f2_Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MultiSolver {
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

	static class Pair implements Comparable<Pair> {
		String pathSofar;
		int weightSofar;

		Pair(String psf, int wsf) {
			pathSofar = psf;
			weightSofar = wsf;
		}

		@Override
		public int compareTo(Pair other) {
			return this.weightSofar - other.weightSofar;
		}
	}

	// Why are we changing to Static ?
	static String spath;
	static int spathwt = Integer.MAX_VALUE;
	static String lpath;
	static int lpathwt = Integer.MIN_VALUE;
	static String cpath;
	static int cpathwt = Integer.MAX_VALUE;
	static String fpath;
	static int fpathwt = Integer.MIN_VALUE;
	static PriorityQueue<Pair> pq = new PriorityQueue<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int vtces = Integer.parseInt(br.readLine());
		ArrayList<Edge>[] graph = new ArrayList[vtces];
		for (int i = 0; i < vtces; i++) {
			graph[i] = new ArrayList<>();
		}
		int edges = Integer.parseInt(br.readLine());
		for (int i = 0; i < edges; i++) {
			String[] parts = br.readLine().split(" ");
			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);
			int wt = Integer.parseInt(parts[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		int src = Integer.parseInt(br.readLine());
		int dest = Integer.parseInt(br.readLine());
		int criteria = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		boolean[] visited = new boolean[vtces];

		MultiSolver(graph, src, dest, visited, criteria, k, src + "", 0);
	}

	public static void MultiSolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k,
			String psf, int wsf) {
		if (src == dest) {
			if (wsf < spathwt) {
				spathwt = wsf;
				spath = psf;
			}

			if (wsf > lpathwt) {
				lpathwt = wsf;
				lpath = psf;
			}
			if (wsf > criteria && wsf < cpathwt) {
				cpathwt = wsf;
				cpath = psf;
			}
			if (wsf < criteria && wsf > fpathwt) {
				fpathwt = wsf;
				fpath = psf;
			}

		}

		visited[src] = true;
		for (Edge edge : graph[src]) {
			if (visited[edge.nbr] == false) {
				MultiSolver(graph, edge.nbr, dest, visited, wsf, wsf, psf + "-" + edge.nbr, wsf);

			}
		}
		visited[src] = false;
	}
}