import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    private Queue<Integer> queue=new LinkedList<>();
    private int topElement;
    public MyStack() {

    }
    
    public void push(int x) {
        queue.offer(x);
        topElement=x;
    }
    
    public int pop() {
        int size=queue.size();
        while(size>2){
            queue.offer(queue.poll());
            size--;
        }

        topElement=queue.peek();
        queue.offer(queue.poll());
        return queue.poll();
    }
    
    public int top() {
        return topElement;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

