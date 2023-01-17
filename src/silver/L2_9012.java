package silver;

import java.util.Scanner;
import java.util.Stack;

public class L2_9012 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			System.out.println(bracket(in.next()));	// nextLine()쓰면 안된다.
		}
		
	}
	
	public static String bracket(String s) {
		 
		Stack<Character> stack = new Stack<>();
 
		for (int i = 0; i < s.length(); i++) {
 
			char c = s.charAt(i);
 
			if (c == '(') {
				stack.push(c);
			}
 
			else if (stack.empty()) {
				return "NO";
			}
			else {
				stack.pop();
			}
		}
 
 
		if (stack.empty()) {
			return "YES";
		} 
		else {
			return "NO";
		}
	}

}
