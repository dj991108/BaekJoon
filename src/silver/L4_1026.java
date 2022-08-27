package silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class L4_1026 {	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			A[i] = s.nextInt();
		}
		for(int i=0 ; i<N ; i++) {
			B[i] = s.nextInt();
		}
		
		int[] C = Arrays.copyOf(B, B.length);
		Arrays.sort(C);
		Integer[] D = new Integer[N];
		for(int j =0; j<N; j++) {
			D[j] = A[j];
		}
		Arrays.sort(D,Collections.reverseOrder());
		int sum=0;
		int gob=0;
		for(int i=0; i<N; i++) {
			gob = C[i] * D[i];
			sum += gob;
		}
		System.out.println(sum);
	}
}
