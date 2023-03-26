import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=575 lang=java
 * @lcpr version=21801
 *
 * [575] 分糖果
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        for (int candyType2 : candyType) {
            set.add(candyType2);
        }
        int size=candyType.length/2;
        int setSize=set.size();
        if(setSize>=size){
            return size;
        }
        else {
            return setSize;
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
// [1,1,2,2,3,3]
// @lcpr case=end

// @lcpr case=start
// [1,1,2,3]
// @lcpr case=end

// @lcpr case=start
// [6,6,6,6]
// @lcpr case=end

 */


