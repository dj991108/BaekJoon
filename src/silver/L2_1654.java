package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class L2_1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		 int K = Integer.parseInt(ss[0]);
		 int N = Integer.parseInt(ss[1]);
						
		long[] arr = new long[K];
		
		for(int i=0 ; i<K;  i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		int c=1;
		long sum=0;
		ArrayList<Integer> list = new ArrayList<Integer>();		
		Stack<Long> stack = new Stack<>();


		while(true) {
			
			sum = 0;
			
			for(int j=0 ; j<arr.length; j++) {
				stack.push(arr[j] / c);
			}
			
			while(!stack.isEmpty()) {
				sum += stack.pop();
			}
			
			if(sum == N) {
				list.add(c);
			}
			
			if(sum < N) {
				break;
			}
			c++;
			
		}
		Collections.sort(list, Collections.reverseOrder());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(list.get(0)+"\n");
		
		br.close();
		bw.close();
	}

}
