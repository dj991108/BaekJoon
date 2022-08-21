package lv_6;
import java.util.Scanner;

public class Lv6_2941 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(Croatia(s.next()));
	}
	
	public static int Croatia(String alpha) {

		int len = alpha.length();
		int count=0;
		for(int i=0; i<alpha.length(); i++) {
			try {
				// c ~
				if(alpha.charAt(i) == 'c') {
					if(alpha.charAt(i+1) == '=') {
						count++;
					}
					else if(alpha.charAt(i+1) == '-') {
						count++;
					}
				}
				
				// d ~
				else if(alpha.charAt(i) == 'd') {
					if(alpha.charAt(i+1) == 'z') {
						if(alpha.charAt(i+2) == '=') {
							count++;
						}
					}
					else if(alpha.charAt(i+1) == '-') {
						count++;
					}
				}
				
				// lj
				else if(alpha.charAt(i) == 'l') {
					if(alpha.charAt(i+1) == 'j') {
						count++;
					}
				}
				
				// nj
				else if(alpha.charAt(i) == 'n') {
					if(alpha.charAt(i+1) == 'j') {
						count++;
					}
				}
				
				// s=
				else if(alpha.charAt(i) == 's') {
					if(alpha.charAt(i+1) == '=') {
						count++;
					}
				}
				// z=
				else if(alpha.charAt(i) == 'z') {
					if(alpha.charAt(i+1) == '=') {
						count++;
					}
				}
			}catch(Exception e) {
				break;
				}
			}
		return len-count;
		}
	}
