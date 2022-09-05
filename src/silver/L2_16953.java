package silver;

import java.util.Scanner;

public class L2_16953 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		int A = ss.nextInt();
		int B = ss.nextInt();
		int count=0;
		
		while(true) {
			
			if(B%2==0 || B%10==1) {
				if(B%2 == 0) {
					B = B/2;
					count++;
					if(B==A) break;
					if(B<A) {
						count = -2;
						break;
					}
				}
				else if(B%10 == 1) {
					B = B-1;
					B = B/10;
					count++;
					if(B==A) break;
					if(B<A) {
						count = -2;
						break;
					}
				}
			}
			else {
				count = -2;
				break;
			}
		}
		System.out.println(count+1); 
	}
}
