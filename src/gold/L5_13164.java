package gold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class L5_13164 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int K = s.nextInt(); // 조 수

		int[] arr = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		ArrayList<Integer> diff = new ArrayList<Integer>();
		
		int d;
		for(int i=0; i<N-1; i++) {
			d = arr[i+1] - arr[i];
			diff.add(d);
		}

		Collections.sort(diff);
		
		int ans=0;
		for(int j=0; j<N-K; j++) {   // 가장 큰 수 마지막 1개는 1개의 그룹으로 구분하고 나머지 작은 값의 그룹들을 합쳐나가는 방식 
			ans += diff.get(j);
		}
		
		System.out.println(ans);

		// https://dingdingmin-back-end-developer.tistory.com/entry/%EB%B0%B1%EC%A4%80-13164-%EC%9E%90%EB%B0%94-java-%ED%96%89%EB%B3%B5-%EC%9C%A0%EC%B9%98%EC%9B%90
	}

}
