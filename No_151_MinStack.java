package LeetCode;

import java.util.Stack;

public class No_151_MinStack {
	Stack<Integer> minStack;
	
	public No_151_MinStack() {
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        minStack.push(x);
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
    	int min = Integer.MAX_VALUE;
        for(int i = 0; i < minStack.size(); i++) {
        	min = Math.min(min, minStack.get(i));
        }
        
        return min;
    }
}

//Runtime: 247 ms, faster than 6.19% of Java 
//Memory Usage: 41 MB, less than 38.13% of Java