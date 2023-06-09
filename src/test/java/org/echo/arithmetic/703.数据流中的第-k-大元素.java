import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=703 lang=java
 * @lcpr version=21901
 *
 * [703] 数据流中的第 K 大元素
 */

// @lc code=start
class KthLargest {
    PriorityQueue<Integer> queue;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        queue=new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        queue.offer(val);
        if(queue.size()>k){
            queue.poll();
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
// @lc code=end



/*
// @lcpr case=start
// 
// @lcpr case=end

 */


