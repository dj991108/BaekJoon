package silver;

import java.util.Arrays;
import java.util.Scanner;

public class L4_16435 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[] arr = new int[N];
	
		int snake = s.nextInt();
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		
		for(int j=0; j<arr.length; j++) {
			if( arr[j]<=snake ) {
				snake++;
			}
		}
		System.out.println(snake);
	}

}
