package org.echo.arithmetic;

public class StringTest1 {
    public static void main(String[] args) {
        String s="abcdef";
        String reverseStr = reverseStr(s, 2);
        System.out.println("hello");
        System.out.println(reverseStr);
    }
    public static String reverseStr(String s, int k) {
        char[] res=new char[s.length()];
        for (int i = 0; i <= s.length()/(2*k)+1; i++) {
            if(s.length()-(i*2*k)>=2*k){
                reverseK(res, s, i*2*k, i*2*k+k-1);
                for (int j = i*2*k+k; j < i*2*k+2*k; j++) {
                    res[j]=s.charAt(j);
                }
            }
            else if(s.length()-(i*2*k)>=k){
                reverseK(res, s, i*2*k, i*2*k+k-1);
                for (int j = i*2*k+k; j < s.length(); j++) {
                    res[j]=s.charAt(j);
                }
            }
            else if(s.length()-(i*2*k)<k){
                reverseK(res, s, i*2*k, s.length()-1);
            }
        }
        return String.valueOf(res);
    }
    public static void reverseK(char[] res,String s,int start,int end){
        while(start<=end){
            res[start]=s.charAt(end);
            res[end]=s.charAt(start);
            start++;
            end--;
        }
    }
}
