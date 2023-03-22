/*
 * @lc app=leetcode.cn id=541 lang=java
 * @lcpr version=21801
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] res=new char[s.length()];
        for (int i = 0; i <= s.length()/(2*k); i++) {
            if(s.length()-(i*2*k)>=2*k){
                reverseK(res, s, i*2*k, i*2*k+k-1);
                for (int j = i*2*k+k; j < i*2*k+2*k; j++) {
                    res[j]=s.charAt(j);
                }
            }
            else if(s.length()-(i*2*k)>=k){
                reverseK(res, s, i*2*k, i*2*k+k-1);
                for (int j = i*2*k+k; j < s.length(); j++) {
                    res[j]=s.charAt(j);
                }
            }
            else if(s.length()-(i*2*k)<k){
                reverseK(res, s, i*2*k, s.length()-1);
            }
        }
        return String.valueOf(res);
    }
    public void reverseK(char[] res,String s,int start,int end){
        while(start<=end){
            res[start]=s.charAt(end);
            res[end]=s.charAt(start);
            start++;
            end--;
        }
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
// "abcdefg"\n2\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n2\n
// @lcpr case=end

 */


