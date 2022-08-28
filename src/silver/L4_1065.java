package silver;

import java.util.Scanner;

public class L4_1065 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print(arithmetic_sequence(s.nextInt()));

		
	}
 
	public static int arithmetic_sequence(int num) {
		int count = 0;
 
		if (num < 100) {
			return num;
		}
 
		else {
			count = 99;
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; 
				int ten = (i / 10) % 10; 
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { 
					count++;
				}
			}
		}
 
		return count;
	}
}
