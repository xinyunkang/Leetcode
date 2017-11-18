import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
	
	Deque<Integer> stack;
	int minValue;

	public MinStack() {
		stack = new LinkedList<Integer>();
		minValue=Integer.MAX_VALUE;  //NO need for secondMinValue.
	}

	public void push(int x) {	
		if(x<=minValue) {        //0. Remember to add =, not only <
			stack.add(minValue); //1. add the old minValue to stack
			minValue=x;			//2. assign x to be the new minValue
		}		
		stack.add(x);           //3. add the x to the stack
		
	}

	public void pop() {
		if(top()==minValue) {    
			stack.removeLast();  //1. remove the minvalue from the stack
			minValue=top();      //2. get the former pushed old minValue
		}	
		stack.removeLast();		//3. remove the old minValue from stack
	}

	public int top() {
		return stack.getLast();
	}

	public int getMin() {
		return minValue;
	}

	public static void main(String[] args) {
		//test1
//		stack stack = new stack();
//		stack.push(-2);
//		stack.push(0);
//		stack.push(-3);
//		System.out.println(stack.getMin());   //--> Returns -3.
//		stack.pop();
//		System.out.println(stack.top());      //--> Returns 0.
//		System.out.println(stack.getMin());   //--> Returns -2.
//		
		
		//test2
//		MinStack stack = new MinStack();
//		stack.push(-2);
//		stack.push(0);
//		stack.push(-1);
//		System.out.println(stack.getMin());   //--> Returns -2.
//		System.out.println(stack.top());      //--> Returns -1.
//		stack.pop();		
//		System.out.println(stack.getMin());   //--> Returns -2.
		
		
		//test3
		MinStack stack = new MinStack();
		stack.push(0);
		stack.push(1);
		stack.push(0);
		System.out.println(stack.getMin());   //--> Returns 0.
		stack.pop();						
		System.out.println(stack.getMin());   //--> Returns 0.

	}

}
