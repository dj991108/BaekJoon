package silver;

import java.util.Scanner;

public class L2_16953 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int count=0;
		
		while(B!=A) {
			
			if(B%A==0 || B%10==1) { //오류
				if(B%2 == 0) {
					B = B/2;
					count++;
				}
				else if(B%10 == 1) {
					B = B-1;
					B = B/10;
					count++;
				}
			}
			else {
				count = -2;
				break;
			}
			
			/*
			if(B<=0){
				count = -2;
				break;
			}
			*/
		}
		System.out.println(count+1);
	}
}
