/*
 * @lc app=leetcode.cn id=415 lang=java
 * @lcpr version=21801
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int size1=num1.length()-1;
        int size2=num2.length()-1;
        StringBuilder builder=new StringBuilder();
        int carry=0;
        while(size1>=0 || size2>=0){
            char ch1='0';
            char ch2='0';
            if(size1>=0){
                ch1=num1.charAt(size1);
            }
            if(size2>=0){
                ch2=num2.charAt(size2);
            }
            int sum=ch1+ch2+carry-2*48;
            carry=sum/10;
            builder.append(sum%10);
            size1--;
            size2--;
        }
        if(carry!=0){
            builder.append(carry);
        }
        return builder.reverse().toString();
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
// "11"\n"123"\n
// @lcpr case=end

// @lcpr case=start
// "456"\n"77"\n
// @lcpr case=end

// @lcpr case=start
// "0"\n"0"\n
// @lcpr case=end

 */


