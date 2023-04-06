import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=331 lang=java
 * @lcpr version=21901
 *
 * [331] 验证二叉树的前序序列化
 */

// @lc code=start
class Solution {
    public boolean isValidSerialization(String preorder) {
        int size=preorder.length();
        int start=0;
        Deque<Integer> stack=new LinkedList<>();
        stack.push(1);
        while(start<size){
            if(stack.isEmpty()){
                return false;
            }
            if(preorder.charAt(start)==','){
                start++;
            }
            else if(preorder.charAt(start)=='#'){
                int top=stack.pop()-1;
                if(top>0){
                    stack.push(top);
                }
                start++;
            }
            else {
                while(start<size && preorder.charAt(start)!=','){
                    start++;
                }
                int top=stack.pop()-1;
                if(top>0){
                    stack.push(top);
                }
                stack.push(2);
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "9,3,4,#,#,1,#,#,2,#,6,#,#"\n
// @lcpr case=end

// @lcpr case=start
// "1,#"\n
// @lcpr case=end

// @lcpr case=start
// "9,#,#,1"\n
// @lcpr case=end

 */


