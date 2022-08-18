package lv_6;

import java.util.Scanner;

public class Lv6_2941 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(Croatia(s.next()));
	}
	
	public static int Croatia(String alpha) {
		
		int count=0;
		
		String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		/*
		if(alpha.contains("c=")) { count++; }
		if(alpha.contains("c-")) { count++; }
		if(alpha.contains("dz=")) { count++; }
		if(alpha.contains("d-")) { count++; }
		if(alpha.contains("lj")) { count++; }
		if(alpha.contains("nj")) { count++; }
		if(alpha.contains("s=")) { count++; }
		if(alpha.contains("z=")) { count++; }
		*/
		
		return count;
		
	}

}
