package STUDY;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class NUM155_MinStack {
	Stack<Integer> minStack;
	 int min= Integer.MIN_VALUE;
	 public MinStack() {
	        //this is stack,,
		  minStack= new Stack<Integer>();
		 
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
	         Object[] array=minStack.toArray();
	         Arrays.sort(array);
	         int minn=(int) array[0];
	         return minn;
	    }
	    //Runtime: 275 ms, faster than 5.67% of Java online submissions for Min Stack.
	    //Memory Usage: 43.3 MB, less than 17.83% of Java online submissions for Min Stack.
	    //과도한 형변환이 런타임에 이상을 준거같다. 일단 내일 다시 수정예정
}
