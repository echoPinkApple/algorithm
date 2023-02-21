/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int index=digits.length-1;
        if(digits[index]!=9){
            digits[index]=digits[index]+1;
            return digits;
        }
        digits[index]=0;
        index--;
        int carry=1;
        while(carry==1 && index>=0){
            int temp=digits[index]+carry;
            digits[index]=temp%10;
            carry=temp/10;
            index--;
        }
        if(carry==1){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            return arr;
        }
        return digits;
    }
}
// @lc code=end

