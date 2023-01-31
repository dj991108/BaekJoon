package silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class L4_10816 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0 ; i<N ; i++) {
			list.add(s.nextInt());
		}
		
		int M = s.nextInt();
		int[] arr_m = new int[M];
		for(int i=0 ; i<M ; i++) {
			arr_m[i] = s.nextInt();
		}
		
		for(int j=0; j<M ; j++) {
			int count = 0;
			Iterator it = list.iterator();
			while (it.hasNext()) {
		           int n = (Integer) it.next();
		            if (n == arr_m[j]) {
		                it.remove();
		                count++;
		            }
		    }
			System.out.print(count+" ");
		}
		
	}

}
