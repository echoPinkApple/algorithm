/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp*temp;
            n=n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow=n;
        int fast=getNext(n);
        while(fast!=1 && slow!=fast){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        return fast==1;
    }
}
// @lc code=end

