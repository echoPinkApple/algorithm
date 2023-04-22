import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=剑指 Offer II 059 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 059] 数据流的第 K 大数值
 */

// @lc code=start
class KthLargest {

    PriorityQueue<Integer> queue;
    int k=0;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        queue=new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
        }
    }
    
    public int add(int val) {
        queue.offer(val);
        while(queue.size()>k){
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
// ["KthLargest", "add", "add", "add", "add", "add"][[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]\n
// @lcpr case=end

 */

