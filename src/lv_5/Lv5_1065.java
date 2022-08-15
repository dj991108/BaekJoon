package lv_5;

import java.util.LinkedList;
import java.util.Scanner;

public class Lv5_1065 {

	private static LinkedList<Integer> stack = new LinkedList<>();
	private static LinkedList<Integer> seq = new LinkedList<>();
	static int count = 0;
	
	static boolean check(int i) {
		int count_2 = 0;
		while(i > 0) {
			stack.push(i%10);
			i /= 10;
		}
		while((!stack.isEmpty())){
			seq.push(stack.pop());
			count_2++;
		}
		
		while((!seq.isEmpty())) {
			try {
				if(seq.pop()-seq.peek() != seq.pop()-seq.peek()) {
					return false;
				}
			}catch(Exception e){
				return true;
			}
		}	
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1 ; i<= num ; i++) {
			if(check(i)) {
				count++;
			}
			if(count == 104) {
				System.out.println("!!"+i);
			}
		}
		System.out.println(count);
	}
}
