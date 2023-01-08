package gold;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class L5_13164 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int K = s.nextInt();

		int[] arr = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0 ; i<N ; i++) {
			stack.push(arr[i]);
		}		
		
		// K를 큰수부터 줄이는 방식
		
		if( K%N != 0) {
			
		}

		



	}

}
