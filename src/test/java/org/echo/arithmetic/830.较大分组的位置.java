import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=830 lang=java
 * @lcpr version=21901
 *
 * [830] 较大分组的位置
 */

// @lc code=start
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int slow=0;
        int fast=0;
        int length=s.length();
        List<List<Integer>> res=new ArrayList<>();
        while(fast<length){
            if(s.charAt(fast)==s.charAt(slow)){
                fast++;
                continue;
            }
            else if( (fast-slow)>=3){
                List<Integer> list=new ArrayList<>();
                list.add(slow);
                list.add(fast-1);
                res.add(list);
                slow=fast;
            }
            else{
                slow=fast;
            }
        }
        if(s.charAt(slow)==s.charAt(fast-1) && (fast-slow)>=3){
            List<Integer> list = new ArrayList<>();
            list.add(slow);
            list.add(fast - 1);
            res.add(list);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abbxxxxzzy"\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n
// @lcpr case=end

// @lcpr case=start
// "abcdddeeeeaabbbcd"\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n
// @lcpr case=end

 */


