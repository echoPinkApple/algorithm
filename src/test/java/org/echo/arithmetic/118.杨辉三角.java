import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        res.add(temp);
        for (int i = 1; i < numRows; i++) {
            List<Integer> col=new ArrayList<>();
            col.add(1);
            for(int j=1;j<i;j++){
                col.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            col.add(1);
            res.add(col);
        }
        return res;
    }
}
// @lc code=end

