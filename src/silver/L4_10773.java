package silver;

import java.util.Scanner;
import java.util.Stack;

public class L4_10773 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();

		Scanner s = new Scanner(System.in);		
		int K = s.nextInt();
		int num;
		for(int i=0 ; i<K ; i++) {
			num = s.nextInt();
			if(num == 0) {
				stack.pop();
			}
			else {
				stack.push(num);
			}
		}
		int sum=0;
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);

	}

}
