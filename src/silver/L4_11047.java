package silver;

import java.util.Scanner;

public class L4_11047 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		// N, K 입력
		int N = s.nextInt();
		int K = s.nextInt();
		int[] money = new int[N];
		
		for(int i=0; i <N; i++) {
			money[i] = s.nextInt();
		}
		for(int i=N-1; i>=0; i--) {
			if(K>=money[i]) {
				sum += K / money[i];
				K %= money[i];
			}
		}
		System.out.println(sum);
	}
}
