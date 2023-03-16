/*
 * @lc app=leetcode.cn id=504 lang=java
 * @lcpr version=21801
 *
 * [504] 七进制数
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        StringBuilder builder=new StringBuilder();
        boolean flag=false;
        if(num==0){
            return "0";
        }
        if(num<0){
            flag=true;
            num=-num;
        }
        while(num!=0){
            int temp=num%7;
            builder.append(temp);
            num=num/7;
        }
        if(flag){
            builder.append("-");
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
// 100\n
// @lcpr case=end

// @lcpr case=start
// -7\n
// @lcpr case=end

 */


