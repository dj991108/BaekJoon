package silver;

import java.util.Arrays;
import java.util.Scanner;

public class L4_11399 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] atm = new int[N];
		int tsum = 0;
		int psum = 0;
		
		for(int i=0 ; i<N ; i++) {
			atm[i] = s.nextInt();
		}
		Arrays.sort(atm);
		for(int j=0; j<N; j++) {
			psum += atm[j];
			tsum += psum;
		}
		System.out.println(tsum);
	}
}