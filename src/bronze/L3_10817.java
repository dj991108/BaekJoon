package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class L3_10817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int arr[] = {in.nextInt(), in.nextInt(), in.nextInt()};
        
		Arrays.sort(arr);	//정렬 메소드 (기본이 오름차순이다.)
        
		System.out.println(arr[1]);

	}

}
