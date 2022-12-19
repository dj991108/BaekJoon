package gold;

import java.util.Scanner;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class L4_1715 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		
		for (int i=0; i<n; i++) {
			pq.add(sc.nextLong());
		}
		
		long num = 0;
		while (pq.size() > 1) {
			long temp1 = pq.poll();
			long temp2 = pq.poll();
			
			num += temp1 + temp2;
			pq.add(temp1 + temp2); 
		}
		
		System.out.println(num);
		
//		Scanner s = new Scanner(System.in);
//		int N = s.nextInt();
//		long arr[] = new long[N];
//
//		for(int i=0; i<N; i++) {
//			arr[i] = s.nextInt();
//		}
//		Arrays.sort(arr);
//		
//		Stack<Long> stack = new Stack<>();
//		
//		long total = 0;
//		long sum = 0;	
//		int j = 0;
//		
//		stack.push(arr[j]);
//		
//		while(true) {
//			if(N==1) {
//				break;
//			}
//			try {
//				total = stack.pop() + arr[j+1];
//				sum += total;
//				stack.push(total);
//				j++;
//			}catch(Exception e) {
//				break;
//			}
//		}
//		System.out.println(sum);
	}
}
