/*
 * @lc app=leetcode.cn id=557 lang=java
 * @lcpr version=21801
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String reverseString = reverse(split[i]);
            builder.append(reverseString);
            if(i!=split.length-1){
                builder.append(" ");
            }
        }
        return builder.toString();
    
    }
    public String reverse(String s){
        char[] res=new char[s.length()];
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            res[left]=s.charAt(right);
            res[right]=s.charAt(left);
            left++;
            right--;
        }
        return new String(res);
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// "Let's take LeetCode contest"\n
// @lcpr case=end

// @lcpr case=start
// "God Ding"\n
// @lcpr case=end

 */


