import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=748 lang=java
 * @lcpr version=21901
 *
 * [748] 最短补全词
 */

// @lc code=start
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] count=new int[26];
        for (int i = 0; i < licensePlate.length(); i++) {
            char tmp=licensePlate.charAt(i);
            if(tmp>='A' && tmp<='Z'){
                count[tmp-'A']++;
            }
            else if(tmp>='a' && tmp<='z'){
                count[tmp-'a']++;
            }
        }
        int need=0;
        for (int i = 0; i < count.length; i++) {
            if(count[i]>0){
                need++;
            }
        }
        String res="";
        for (String w : words) {
            int[] tmpCount=Arrays.copyOf(count, count.length);
            int match=0;
            for (int i = 0; i < w.length(); i++) {
                char tmp=w.charAt(i);
                if(tmp>='A' && tmp<='Z'){
                    tmpCount[tmp-'A']--;
                    if(tmpCount[tmp-'A']==0){
                        match++;
                    }
                }
                else if(tmp>='a' && tmp<='z'){
                    tmpCount[tmp-'a']--;
                    if(tmpCount[tmp-'a']==0){
                        match++;
                    }
                }
                if(need==match){
                    res = res=="" || w.length() < res.length() ? w : res;
                    continue;
                }
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1s3 PSt"\n["step", "steps", "stripe", "stepple"]\n
// @lcpr case=end

// @lcpr case=start
// "1s3 456"\n["looks", "pest", "stew", "show"]\n
// @lcpr case=end

 */


