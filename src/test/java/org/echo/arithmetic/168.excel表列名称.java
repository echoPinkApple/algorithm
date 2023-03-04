import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    Map<Integer,Character> map=new HashMap<>();
    public Solution(){
        Character temp='A';
        map.put(0, 'Z');
        for (int i = 1; i < 27; i++) {
            map.put(i, temp++);
        }
    }
    public String convertToTitle(int columnNumber) {
        StringBuilder builder=new StringBuilder();
        while(columnNumber!=0){
            int temp=columnNumber%26;
            if(temp==0){
                temp=26;
                columnNumber-=26;
            }
            builder.append(map.get(temp));
            columnNumber=(columnNumber)/26;
        }
        return builder.reverse().toString();
    }
}
// @lc code=end

