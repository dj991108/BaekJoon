package silver;

import java.util.Scanner;
public class L4_2839 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int five;
		int three;
		int num = s.nextInt(); // if num = 103
		int res = sugar(num); // 100
		
		if(res == -1) {
			System.out.println(res); // 나누어 떨어지지 않는 수
		}
		else if(res == -2) {
			System.out.println(num/3); // 최소공배수 이전 처리
		}
		else {
			five = res/5; // 무게 5 개수 == 20
			three = (num - res) / 3; // 무게 3 개수 == 1
			System.out.println(five+three);
		}
	}
	
	public static int sugar(int num) { //5배수를 리턴
		
		int f_mul;
		int n;
		
		if(num < 15 && num % 3 == 0) {
			return -2;
		}
		n = num / 5;
		f_mul = n * 5;
		if(f_mul == num) { // 5의 배수인 경우
			return f_mul;
		}
		while(f_mul > 0 ) {
			if((num - f_mul) % 3 == 0) {
				return f_mul; //5배수 리턴
			}		
			f_mul -= 5;
		}
		return -1;
	}
}
