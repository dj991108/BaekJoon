package silver;

import java.util.Arrays;
import java.util.Scanner;

public class L2_2606 {
	
	static int count = -1;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		
		boolean visited[] = new boolean[N+1];  
		
		Arrays.fill(visited, false);
		
		int[][] adjArray = new int[N+1][N+1];
		
		for(int i = 0; i < M; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			
			adjArray[v1][v2] = 1;
			adjArray[v2][v1] = 1;
		}
		
		dfs_array_recursion(1, adjArray, visited);
		
		System.out.print(count);

	}
	
	public static void dfs_array_recursion(int v, int[][] adjArray, boolean[] visited) {
		int I = adjArray.length - 1;
		visited[v] = true;
		count++;
		for(int i = 1; i <= I; i++) {
			if(adjArray[v][i] == 1 && !visited[i]) {
				dfs_array_recursion(i, adjArray, visited);
			}
		}

	}

}
