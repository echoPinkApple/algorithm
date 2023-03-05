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
        List<Integer> list=new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
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
