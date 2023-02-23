package silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class L5_1427 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(!(N<10)) {
			arr.add(N%10); 
			N /= 10;	
		}
		arr.add(N);
		
		Collections.sort(arr, Collections.reverseOrder());
		
		for(int i=0 ; i < arr.size() ; i++) {
			System.out.print(arr.get(i));
		}
		
	}

}
