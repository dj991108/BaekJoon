package silver;

import java.util.Scanner;

public class L4_2847 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		int N = s.nextInt();
		int arr[] = new int[N];
		int count = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = s.nextInt();
		}
		// 입력 완료 
		
		int big = arr[--N];
		
		while(true) {
			N--;
			if(N<0) {
				break;
			}
			else {
				while(big <= arr[N]) {
					arr[N]--;
					count++;
				}
				big = arr[N];
			}
		}
		System.out.println(count);
	}
}