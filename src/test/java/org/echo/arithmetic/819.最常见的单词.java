import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=819 lang=java
 * @lcpr version=21901
 *
 * [819] 最常见的单词
 */

// @lc code=start
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet=new HashSet<>();
        for (String bString : banned) {
            bannedSet.add(bString);
        }
        int slow=0;
        int fast=0;
        Map<String,Integer> map=new HashMap<>();
        while(fast<paragraph.length()){
            char tmp=paragraph.charAt(fast);
            if(!((tmp>='a' && tmp<='z') || (tmp>='A' && tmp<='Z'))){
                String subString=paragraph.substring(slow , fast).toLowerCase();
                if(!bannedSet.contains(subString)){
                    map.put(subString, map.getOrDefault(subString, 0)+1);
                }
                while(!((tmp>='a' && tmp<='z') || (tmp>='A' && tmp<='Z'))&&fast<paragraph.length()){
                    tmp=paragraph.charAt(fast);
                    slow=fast;
                    fast++;
                }
            }
            else{
                fast++;
            }
        }
        char last=paragraph.charAt(paragraph.length()-1);
        if((last>='a' && last<='z') || (last>='A' && last<='Z')){
            String substring = paragraph.substring(slow, fast).toLowerCase();
            if(!bannedSet.contains(substring)){
                map.put(substring, map.getOrDefault(substring, 0)+1);
            }
        }

        String res="";
        int max=0;
        for (String keySet : map.keySet()) {
            Integer integer = map.get(keySet);
            if(integer>max){
                max=integer;
                res=keySet;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "Bob []\n
// @lcpr case=end

 */


