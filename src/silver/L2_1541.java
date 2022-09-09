package silver;

import java.util.Scanner;
import java.util.Stack;
import javax.script.ScriptException;
import java.util.List;
import java.util.ArrayList;

public class L2_1541 {
	
	public static void main(String[] args)throws ScriptException {
		
		//ArrayList로 받고 -위차 찾아서 삽입 하고 다 끝나면 그걸 한문장의 String으로 변환 한 후 작업
		Scanner s = new Scanner(System.in);
		
		// String 입력받은걸 char배열로 변환
		String Eq = s.next();
		
		List<Character> fw = new ArrayList<>(); 
		for(char ch: Eq.toCharArray()) {
			fw.add(ch);
		}
		
		int count = 0;
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
		
		StringBuilder sb = new StringBuilder();
		 for (Character ch: fw) {
	            sb.append(ch);
	        }
		String str = sb.toString();	    
	    Calc cal = new Calc();
	    cal.run(str);	
	}

}
class Calc {
    public void run(String s) {
    	resultPrint(organize(s));
   }
 // ================== 중위식 문자열을 후위식 표현으로 바꿔줌 ==================
    public String[] organize(String s) {
    	boolean isBracket = false;
		
		if(s.charAt(0)=='(') {
			isBracket=true;
		}
		
		s = s.replace("(", " ( ");
    	s = s.replace(")", " ) ");
    	s = s.replace("+", " + ");
    	s = s.replace("-", " - ");
    	s = s.replace("/", " / ");
    	s = s.replace("*", " * ");
    	s = s.replace("  ", " ");
    	String[] str = s.split(" ");
    	    	
        ArrayList<String> sb = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        
        

        for (int i = 0; i < str.length; i++) {
            String now = str[i];

            switch (now){
                case "+":
                case "-":
                case "*":
                case "/":
                    while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
                        sb.add(stack.pop());
                    }
                    stack.push(now);
                    break;
                case "(":
                    stack.push(now);
                    break;
                case ")":
                    while(!stack.isEmpty() && !stack.peek().equals("(")){                    	                              	
                    		sb.add(stack.pop());                  	
                    }
                    stack.pop();
                    break;
                default:
                    sb.add(now);
            }
        }

        while (!stack.isEmpty()) {
            sb.add(stack.pop());
        }
        
        if(isBracket) {
        	sb.remove(0);}
        
        String[] result = new String[sb.size()];

        for(int i = 0; i < sb.size(); i++) {      
        	result[i]=sb.get(i); 
        }
        
        return result;
    }
    
 // ========================== 우선순위 부여 ==========================
    
    public int priority(String operator){

        if(operator.equals("(") || operator.equals(")")){
            return 0;
        } else if (operator.equals("+") || operator.equals("-")) {
            return 1;
        } else if (operator.equals("*") || operator.equals("/")) {
            return 2;
        }
        return -1;
    }
 // =========================== 후위식 계산 ===========================
    
    public void resultPrint(String[] str) {
    	
    	Stack<Integer> stack = new Stack<>();
	    
	    for (String x : str) {
	      
	      if (!x.equals("+")&&!x.equals("-")&&!x.equals("*")&&!x.equals("/")) { 
	    	  stack.push(Integer.parseInt(x));
	      }else {
	        
	        int a = stack.pop();
	        int b = stack.pop();
	        
	        switch (x) {
	          case "+":
	        	  stack.push(b+a);
	            break;
	          case "-":
	        	  stack.push(b-a);
	            break;
	          case "*":
	        	  stack.push(b*a);
	            break;
	          case "/":
	        	  stack.push(b/a);
	            break;
	        }
	      }
	    }	
	    System.out.println(stack.pop());
	 }
}
