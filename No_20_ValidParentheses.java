package LeetCode;

import java.util.Stack;

//()[]{}

public class No_20_ValidParentheses {
	public boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        
        
        for(int i = 0; i < s.length(); i++) {
        	switch(s.charAt(i)){
        	case ')':
        		if(list.size() == 0 || list.peek().compareTo('(')!=0) {
        			return false;
        		}else {
        			list.pop();
        		}
        		break;
        		
        	case ']':
        		if(list.size() == 0 || list.peek().compareTo('[')!=0) {
        			return false;
        		}else {
        			list.pop();
        		}
        		break;
        	case '}':
        		if(list.size() == 0 || list.peek().compareTo('{')!=0) {
        			return false;
        		}else {
        			list.pop();
        		}
        		break;
        	default :
        		list.push(s.charAt(i));
        		break;
        	}
        }
        if(list.size() != 0) return false;
        return true;
    }

}

//Runtime: 1 ms, faster than 98.63% of Java 
//Memory Usage: 37 MB, less than 74.38% of Java
