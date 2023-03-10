import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=455 lang=java
 * @lcpr version=21801
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gIndex=0;
        int sIndex=0;
        int res=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(gIndex<g.length){
            while(sIndex<s.length && g[gIndex]>s[sIndex]){
                sIndex++;
            }
            if(sIndex<s.length && g[gIndex]<=s[sIndex]){
                res++;
                sIndex++;
            }
            gIndex++;
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
// [1,2,3]\n[1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n[1,2,3]\n
// @lcpr case=end

 */


