import java.util.Stack;

class MyQueue {

    // Stacks used to implement the queue
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    // Constructor for MyQueue
    public MyQueue() {
        // No initialization needed here
    }
    
    // Push element x to the back of queue
    public void push(int x) {
        // Always push new elements onto the first stack
        first.push(x);
    }
    
    // Removes the element from in front of queue and returns that element
    public int pop() {
        // Ensure the second stack has the current front of the queue
        peek();
        // Pop and return the front element from the second stack
        return second.pop();
    }
    
    // Get the front element
    public int peek() {
        // If the second stack is empty, transfer all elements from the first stack
        if (second.empty()) {
            while (!first.empty()) {
                second.push(first.pop());
            }
        }
        // The top of the second stack is the front of the queue
        return second.peek();
    }
    
    // Returns whether the queue is empty
    public boolean empty() {
        // The queue is empty if both stacks are empty
        return first.empty() && second.empty();        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
