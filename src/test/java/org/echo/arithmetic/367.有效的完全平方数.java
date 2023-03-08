import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=367 lang=java
 * @lcpr version=21801
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    static Set<Integer> set=new HashSet<>();
    static{
        for (int i = 0; i < 46341; i++) {
            set.add(i*i);
        }
    }
    public boolean isPerfectSquare(int num) {
       return Solution.set.contains(num);
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
// 16\n
// @lcpr case=end

// @lcpr case=start
// 14\n
// @lcpr case=end

 */


