import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=401 lang=java
 * @lcpr version=21801
 *
 * [401] 二进制手表
 */

// @lc code=start
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res=new ArrayList<>();
        for (int i = 0; i < 1024; i++) {
            int h=i>>6;
            int l=i&63;
            if(h<12 && l<60 && Integer.bitCount(i)==turnedOn){
                res.add(h+":"+(l<10?"0":"")+l);
            }
        }
        return res;
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
// 1\n
// @lcpr case=end

// @lcpr case=start
// 9\n
// @lcpr case=end

 */


