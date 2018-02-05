import java.util.Stack;

public class ImplementQueueusingStacks {
	//O(n), O(1)
    Stack<Integer> s1;
    Stack<Integer> s2;
    int front;
    /** Initialize your data structure here. 
     * @return */
    public void MyQueue() {
        s1= new Stack<Integer>();
        s2= new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1.isEmpty()){
            front=x;
        }
       
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        
        s2.push(x);
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       int res= s1.pop();
        if(!s1.isEmpty()){
            front=s1.peek();
        }
        return res;
    }
    
    /** Get the front element. */
    public int peek() {
        return front;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }






/*
class MyQueue2 {

    //O(n), O(n)
    Stack<Integer> s1;
    Stack<Integer> s2;
    
    public MyQueue() {
        s1= new Stack<Integer>();
        s2= new Stack<Integer>();
    }
    
    
    public void push(int x) {
        s1.push(x);
    }
    
   
    public int pop() {
        if(!s2.isEmpty()){
            return s2.pop();
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }
    
   
    public int peek() {
        if(!s2.isEmpty()){
            return s2.peek();
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }
    
    
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
