import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=824 lang=java
 * @lcpr version=21901
 *
 * [824] 山羊拉丁文
 */

// @lc code=start
class Solution {
    private static final Set<Character> set=new HashSet<>();
    static{
        set.add('a');
        set.add('A');
        set.add('i');
        set.add('I');
        set.add('e');
        set.add('E');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
    }

    public String toGoatLatin(String sentence) {
        String[] split = sentence.split(" ");
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            char firstChar=split[i].charAt(0);
            if(set.contains(firstChar)){
                builder.append(split[i]);
                builder.append("ma");
            }
            else{
                builder.append(split[i].substring(1));
                builder.append(split[i].charAt(0));
                builder.append("ma");
            }
            for(int j=0;j<=i;j++){
                builder.append("a");

            }
            if(i<split.length-1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "I speak Goat Latin"\n
// @lcpr case=end

// @lcpr case=start
// "The quick brown fox jumped over the lazy dog"\n
// @lcpr case=end

 */


