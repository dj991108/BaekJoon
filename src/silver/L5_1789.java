package silver;

import java.util.Scanner;

public class L5_1789 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long SS = s.nextLong();
		long count=0;
		long sum=0;
		while(true) {
			count++;
			sum += count;
			if(sum > SS) {
				count--;
				break;
			}
		}
		System.out.println(count);
	}
}
