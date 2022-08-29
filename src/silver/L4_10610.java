package silver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class L4_10610 {


public static final int MAX = 100000;
    
    public static String str;
    public static int[] numCountArr;
    public static long strLen;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str= sc.nextLine();
        
        strLen = str.length();
        numCountArr = new int[10];
        long total = 0;
        for(int i=0; i < strLen; i++) {
            int tNum = Integer.parseInt(str.substring(i, i+1));
            numCountArr[tNum] += 1;
            total+=tNum;
        }
            if(!str.contains("0") || total % 3 != 0) {
            System.out.println("-1");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            while(numCountArr[i] > 0) {
                sb.append(i);
                numCountArr[i]--;
            }
        }
        System.out.println(sb.toString());
    }
	
	/*		정수버전
	 * 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextInt();
		int i=0;
		List<Long> num = new ArrayList<>();
		while(N != 0) {
			num.add(i, N % 10); 
			N = N/10;
			i++;
		}
		num.sort(Comparator.reverseOrder());
		long sum = 0;
		long res = 0;
		for(int j=0; j<num.size(); j++) {
			sum += num.get(j);
		}
		if((sum%3 == 0) && num.get(num.size()-1)==0){
			num.sort(Comparator.naturalOrder());
			while(true) {
				for(int k=0; k<num.size(); k++) {
					res += (num.get(k)*Math.pow(10, k));
				}
				System.out.println(res);
				break;
			}
		}
		else {
			System.out.println(-1);
		}*/ 
	}

