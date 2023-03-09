package org.echo.arithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AddOneTest {
    public static void main(String[] args) {
        // int[] arr=new int[]{9,9,9};
        // int[] plusOne = plusOne(arr);
        // System.out.println(plusOne);
        // Arrays.stream(plusOne).forEach(System.out::println);
        // Stream.of(plusOne).forEach(System.out::println);
        // String s="A man, a plan, a canal: Panama";
        // test(s);
        // String s1="123467890";
        // String s2="345";
        // String addStrings = addStrings(s1, s2);
        // System.out.println(addStrings);
        int arrangeCoins = arrangeCoins(1804289383);
        System.out.println(arrangeCoins);
    }


    public static int arrangeCoins(int n) {
        int left=1;
        int right=n;
        while(left<=right){
            int mid=(left+right)>>>1;
            long sum =(1L+mid)*mid/2;
            if(sum==n){
                return mid;
            }
            else if(sum<n){
                left=mid+1;
            }
            else if(sum>n){
                right=mid-1;
            }
        }
        return left-1;

    }

    public static String addStrings(String num1, String num2) {
        int size1=num1.length()-1;
        int size2=num2.length()-1;
        StringBuilder builder=new StringBuilder();
        int carry=0;
        while(size1>=0 || size2>=0){
            char ch1='0';
            char ch2='0';
            if(size1>=0){
                ch1=num1.charAt(size1);
            }
            if(size2>=0){
                ch2=num2.charAt(size2);
            }
            int sum=ch1+ch2+carry-2*48;
            carry=sum/10;
            builder.append(sum%10);
            size1--;
            size2--;
        }
        return builder.reverse().toString();
    }

    public static boolean test(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (s.charAt(left) < 'A' || s.charAt(left) > 'x' || (s.charAt(left) > 'X' && s.charAt(left) < 'a')) {
                left++;
            }
            while (s.charAt(right) < 'A' || s.charAt(right) > 'x' || (s.charAt(right) > 'X' && s.charAt(right) < 'a')) {
                right--;
            }
            System.out.println("left="+s.charAt(left)+"   right="+s.charAt(right));
            System.out.println(Math.abs(s.charAt(left)-s.charAt(right)));
            if (s.charAt(left) != s.charAt(right) || Math.abs(s.charAt(left) - s.charAt(right)) != 32) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public  static int[] plusOne(int[] digits) {
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
            for(int i=1;i<arr.length;i++){
                arr[i]=digits[i-1];
            }
            return arr;
        }
        return digits;
    }
}
