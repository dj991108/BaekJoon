package silver;

import java.util.Scanner;

public class L3_1463 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int[] dp = new int[X+1];
		dp[0] = dp[1] = 0;
		
		 for (int i = 2; i <= X; i++) {
	            dp[i] = dp[i - 1] + 1; // 먼저 1을 빼준다 
	            if (i % 2 == 0) {
	            	dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 1을 뺀 값과 2로 나눈 값 중 최솟값을 dp[i]에 저장한다  
	            	// --> 첫번째 인자 dp[i] = 1로 나눈 값  ,  두번째 인자 dp[i/2] + 1 = 2로 나눈 값 
	            }
	            if (i % 3 == 0) {
	            	dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 1을 뺀 값과 2로 나눈 값 중 최소값인 dp[i] 와 3으로 나눈 값 중 최솟값을 dp[i]에 저장한다 
	            }
	            
	        }

//		 for(int j=0 ; j<dp.length; j++) {
//			 System.out.println(j+" : "+dp[j]);
//		 }
	     System.out.println(dp[X]);
		
	}

}
