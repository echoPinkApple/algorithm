/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0){
            List<Integer> res=new ArrayList<>();
            res.add(1);
            return res;
        }
        List<Integer> res=new ArrayList<>();
        res.add(1);
        List<Integer> before=getRow(rowIndex-1);
        for(int i=1;i<rowIndex;i++){
            res.add(before.get(i)+before.get(i-1));
        }
        res.add(1);
        return res;
    }
}
// @lc code=end

