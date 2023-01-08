package silver;

import java.util.Arrays;
import java.util.Scanner;

public class L4_1920 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr_n = new int[N];

		for(int i=0 ; i<N ; i++) {
			arr_n[i] = s.nextInt();
		}
		Arrays.sort(arr_n);
		
		int M = s.nextInt();
		int[] arr_m = new int[M];

		for(int i=0 ; i<M ; i++) {
			arr_m[i] = s.nextInt();
		}		
		for(int i=0 ; i<M; i++) {
			if(Arrays.binarySearch(arr_n, arr_m[i]) >= 0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");				
			}
		}
	}
}
