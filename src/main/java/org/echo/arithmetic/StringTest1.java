package org.echo.arithmetic;

public class StringTest1 {
    public static void main(String[] args) {
        // String s="abcdef";
        // String reverseStr = reverseStr(s, 2);
        // System.out.println("hello");
        // System.out.println(reverseStr);
        boolean checkRecord = checkRecord("ALLAPPL");
        System.out.println(checkRecord);
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

    public static boolean checkRecord(String s) {
        int absent=0;
        int late=0;
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if(temp=='A'){
                absent++;
                if(absent>=2){
                    return false;
                }
            }
            else if(temp=='L'){
                late++;
                i++;
                while(i<s.length() && s.charAt(i)=='L'){
                    late++;
                    i++;
                }
                if(late>=3){
                    return false;
                }
                else{
                    late=0;
                }
            }
        }
        return true;
    }
}
