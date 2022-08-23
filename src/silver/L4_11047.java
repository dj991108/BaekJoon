package silver;

public class L4_11047 {

	
	public static void main(String[] args) {
		
		int K = 4750;
		int N = 3;
		int count = 0; 
		int sum = 0;
		// 인덱스 수정
		int[] money = {50000,10000,5000,1000,500,100,50,10,5,1}; // index 0~9
		// N, K 입력
		for(int i=N-1; i>=0 ; i--) {
			System.out.println(money[i]);
		}
		while(true) {
			if( K > money[count]) {
				break;
			}
			count++;
		}
		while(K>0) {	
				sum += K / money[count];
				K %= money[count];
				count++;
		}
		System.out.println(sum);
	}

}
