package silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class L2_1260 {

	public static void main(String[] args) {	
		
	
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int V = s.nextInt();
		
		boolean visited[] = new boolean[N+1];  
		
		Arrays.fill(visited, false);
		
		int[][] adjArray = new int[N+1][N+1];
		
		for(int i = 0; i < M; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			
			adjArray[v1][v2] = 1;
			adjArray[v2][v1] = 1;
		}
		
		// DFS
		dfs_array_recursion(V, adjArray, visited);
		
		Arrays.fill(visited, false);
		System.out.println();
		
		// BFS
		bfs_array(V, adjArray, visited);
	}
	
	public static void dfs_array_recursion(int v, int[][] adjArray, boolean[] visited) {
		int I = adjArray.length - 1;
		visited[v] = true;
		System.out.print(v + " ");
		for(int i = 1; i <= I; i++) {
			if(adjArray[v][i] == 1 && !visited[i]) {
				dfs_array_recursion(i, adjArray, visited);
			}
		}

	}
	
	public static void bfs_array(int v, int[][] adjArray, boolean[] visited) {
		Queue<Integer> q = new LinkedList<>();
		int n = adjArray.length - 1;

		q.add(v);
		visited[v] = true;

		while (!q.isEmpty()) {
			v = q.poll();
			System.out.print(v + " ");

			for (int i = 1; i <= n; i++) {
				if (adjArray[v][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}

}
