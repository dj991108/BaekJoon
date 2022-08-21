package silver;

public class Lv5_4673 {
	
	public static int d(int num) {
		int sum = num;
		
		while(num !=0) {
			sum += (num%10); // 1의 자리수
			num = num/10; // 그 외
		}
		return sum;
	}
	
	public static void check(int c[]) {
		for(int i=1 ; i<=c.length; i++) {
			int n = d(i);
			
			if(n < c.length) {
				c[n] = -1;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[]c = new int[10001];
		check(c);
		
		for(int j=1; j<10001 ; j++) {
			
			if(c[j] != -1) {
				System.out.println(j);
			}
		}
	}
}
