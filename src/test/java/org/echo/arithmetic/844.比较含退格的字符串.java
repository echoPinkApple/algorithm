import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=844 lang=java
 * @lcpr version=21901
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp=s.charAt(i);
            if(tmp=='#' && !stack1.isEmpty()){
                stack1.pop();
            }
            else if(tmp!='#'){
                stack1.push(tmp);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char tmp=t.charAt(i);
            if(tmp=='#' && !stack2.isEmpty()){
                stack2.pop();
            }
            else if(tmp!='#'){
                stack2.push(tmp);
            }
        }
        if(stack1.size()!=stack2.size()){
            return false;
        }
        while(!stack1.isEmpty()){
            char tmp1=stack1.pop();
            char tmp2=stack2.pop();
            if(tmp1!=tmp2){
                return false;
            }
        }
        return true;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "ab#c"\n"ad#c"\n
// @lcpr case=end

// @lcpr case=start
// "ab##"\n"c#d#"\n
// @lcpr case=end

// @lcpr case=start
// "a##c"\n"#a#c"\n
// @lcpr case=end

 */


