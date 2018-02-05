import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {
	Queue<Integer> q;
    /** Initialize your data structure here. 
     * @return */
    public void MyStack() {
        q= new LinkedList<Integer>();  //Queue is abstract; cannot be instantiated use LinkedList
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++){ //NOT q.size();
            q.add(q.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
