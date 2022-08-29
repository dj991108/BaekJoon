package silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class L4_2217 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		Integer[] loap = new Integer[N];
		for(int i=0 ; i<N; i++) {
			loap[i] = s.nextInt();
		}
		Arrays.sort(loap,Collections.reverseOrder()); // 오름차순
		
		int count=1;
		int[] zip = new int[N];
		for(int i=0; i<loap.length; i++) {
			zip[i] = loap[i] * count ;
			count++;
		}
		Arrays.sort(zip);
		System.out.println(zip[N-1]);
	}
}
