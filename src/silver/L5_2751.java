package silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class L5_2751 {

	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = in.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(in.nextInt());
		}
		//Collections 패키지 사용
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}

} 
