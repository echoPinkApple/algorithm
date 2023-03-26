import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=599 lang=java
 * @lcpr version=21801
 *
 * [599] 两个列表的最小索引总和
 */

// @lc code=start
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        int minIndex = Integer.MAX_VALUE;
        for (int index1 = 0; index1 < list1.length; index1++) {
            for (int index2 = 0; index2 < list2.length; index2++) {
                if (list1[index1].equals(list2[index2])) {
                    int sumIndex = index1 + index2;
                    if (sumIndex < minIndex) {
                        minIndex = sumIndex;
                        res.clear();
                        res.add(list1[index1]);
                    } else if (sumIndex == minIndex) {
                        res.add(list1[index1]);
                    }
                }
            }
        }
        return (String[]) res.toArray(new String[0]);
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * // ["Shogun", "Tapioca Express", "Burger King" ["Piatti",
 * "The Grill at Torrey Pines", "HungryHunter Steakhouse", "Shogun"]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // ["Shogun", "Tapioca Express", "Burger King" ["KFC", "Shogun",
 * "Burger King"]
 * // @lcpr case=end
 * 
 */
