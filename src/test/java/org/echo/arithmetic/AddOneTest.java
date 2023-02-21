package org.echo.arithmetic;

import java.util.Arrays;
import java.util.stream.Stream;

public class AddOneTest {
    public static void main(String[] args) {
        int[] arr=new int[]{9,9,9};
        int[] plusOne = plusOne(arr);
        System.out.println(plusOne);
        Arrays.stream(plusOne).forEach(System.out::println);
        // Stream.of(plusOne).forEach(System.out::println);
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
