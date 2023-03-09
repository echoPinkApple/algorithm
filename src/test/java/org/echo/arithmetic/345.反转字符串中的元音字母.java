import java.util.HashSet;
import java.util.Set;
/*
 * @lc app=leetcode.cn id=345 lang=java
 * @lcpr version=21801
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {

    static Set<Character> hashSet=new HashSet<>();
    static{
        hashSet.add('a');
        hashSet.add('e');
        hashSet.add('i');
        hashSet.add('o');
        hashSet.add('u');
        hashSet.add('A');
        hashSet.add('E');
        hashSet.add('I');
        hashSet.add('O');
        hashSet.add('U');

    }
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] res=new char[right+1];
        while(left<=right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            boolean conditionL=Solution.hashSet.contains(l);
            boolean conditionR=Solution.hashSet.contains(r);
            if(conditionL&&conditionR){
                res[left]=r;
                res[right]=l;
                left++;
                right--;
            }
            else if(conditionL&&(!conditionR)){
                res[right]=r;
                right--;
            }
            else if((!conditionL)&& conditionR){
                res[left]=l;
                left++;
            }
            else if((!conditionL)&&(!conditionR)){
                res[left]=l;
                res[right]=r;
                left++;
                right--;
            }
        }
        
        return String.valueOf(res);
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// "hello"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n
// @lcpr case=end

 */


