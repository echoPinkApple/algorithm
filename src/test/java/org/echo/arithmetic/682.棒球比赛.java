import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=682 lang=java
 * @lcpr version=21901
 *
 * [682] 棒球比赛
 */

// @lc code=start
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            int size=list.size()-1;
            if("C".equals(operations[i])){
                list.remove(size);
            }
            else if("D".equals(operations[i])){
                list.add(list.get(size)*2);
            }
            else if("+".equals(operations[i])){
                list.add(list.get(size)+list.get(size-1));
            }
            else{
                list.add(Integer.parseInt(operations[i]));
            }
        }
        return list.stream().reduce(0,(cur,num)->cur+num);

    }
}
// @lc code=end



/*
// @lcpr case=start
// ["5","2","C","D","+"]
// @lcpr case=end

// @lcpr case=start
// ["5","-2","4","C","D","9","+","+"]
// @lcpr case=end

// @lcpr case=start
// ["1"]\n
// @lcpr case=end

 */


