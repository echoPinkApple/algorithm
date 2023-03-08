/*
 * @lc app=leetcode.cn id=374 lang=java
 * @lcpr version=21801
 *
 * [374] 猜数字大小
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left=0;
        int right=n;
        while(left<=right){
            int mid=(left+right)>>>1;
            int res=guess(mid);
            if(res==-1){
                right=mid-1;
            }
            else if(res==1){
                left=mid+1;
            }
            else if(res==0){
                return mid;
            }
        }
        return -1;
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
// 10\n6\n
// @lcpr case=end

// @lcpr case=start
// 1\n1\n
// @lcpr case=end

// @lcpr case=start
// 2\n1\n
// @lcpr case=end

// @lcpr case=start
// 2\n2\n
// @lcpr case=end

 */


