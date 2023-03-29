import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=728 lang=java
 * @lcpr version=21901
 *
 * [728] 自除数
 */

// @lc code=start
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();
        while(left<=right){
            if(isSelfDivid(left)){
                res.add(left);
            }            
            left++;
        }
        return res;
    }

    public boolean isSelfDivid(int num){
        int copeNum=num;
        while(num!=0){
            int tmpNum=num%10;
            if(tmpNum==0){
                return false;
            }
            if((copeNum%tmpNum)!=0){
                return false;
            }
            num=num/10;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n22\n
// @lcpr case=end

// @lcpr case=start
// 47\n85\n
// @lcpr case=end

 */


