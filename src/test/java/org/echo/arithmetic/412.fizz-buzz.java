import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=412 lang=java
 * @lcpr version=21801
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer=new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            int a=i%3;
            int b=i%5;
            if(a==0 && b==0){
                answer.add("FizzBuzz");
            }
            else if(a==0){
                answer.add("Fizz");
            }
            else if(b==0){
                answer.add("Buzz");
            }
            else{
                answer.add(String.valueOf(i));
            }
        }
        return answer;
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
// 3
// @lcpr case=end

// @lcpr case=start
// 5
// @lcpr case=end

// @lcpr case=start
// 15
// @lcpr case=end

 */


