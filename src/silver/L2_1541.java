package silver;

import java.util.Scanner;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.List;
import java.util.ArrayList;

public class L2_1541 {

	public static void main(String[] args)throws ScriptException {
		
		//ArrayList로 받고 -위차 찾아서 삽입 하고 다 끝나면 그걸 한문장의 String으로 변환 한 후 작업
		Scanner s = new Scanner(System.in);
		
		// String 입력받은걸 char배열로 변환
		String Eq = s.next(); // next? nextLine?
		
		List<Character> fw = new ArrayList<>(); 
		for(char ch: Eq.toCharArray()) {
			fw.add(ch);
		}
		
		int count =0;
		while(true) {
			if(fw.get(count).equals('-')) {
				fw.add(count+1, '(');
				while(true) {
					count++;
					
					try{if(fw.get(count).equals(null)) { //예외처리로 
						fw.add(count, ')');
						break;
					}}catch(Exception e) {
						fw.add(count, ')');
						break;
					}
					
					if(fw.get(count).equals('-')) {
						fw.add(count, ')');
						break;
					}
				}
			}
			count++;
			try{if(fw.get(count).equals(null)) { //예외처리로
				break;
			}}catch(Exception e) {
				break;
			}
		}
		/*
		for(int i=0 ; i<fw.size(); i++) {
			System.out.println(fw.get(i));
		}
		*/
		StringBuilder sb = new StringBuilder();
		 for (Character ch: fw) {
	            sb.append(ch);
	        }
		String str = sb.toString();
	    System.out.println(str);
	    
	    
	    ScriptEngineManager ss = new ScriptEngineManager();
	    ScriptEngine engine = ss.getEngineByName("JavaScript");
	    int num = (int)engine.eval(str);
	    System.out.println(num);
		
	    
	    
	     /*
		// String to Integer
		String str = "0009";
		int j = Integer.parseInt(str);
		System.out.println(j);
		
		// 문자열 자르기
		String strr = "ABC-DE";
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			}
		*/
		
	}

}
