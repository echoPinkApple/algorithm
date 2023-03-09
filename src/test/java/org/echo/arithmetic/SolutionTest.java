package org.echo.arithmetic;

import java.util.*;

public class SolutionTest {

    public static void main(String[] args) {
        SolutionTest SolutionTest = new SolutionTest();
        String s = "hello";
        String reverseVowels = SolutionTest.reverseVowels(s);
        System.out.println(reverseVowels);
    }

    static Set<Character> hashSet = new HashSet<>();
    static {
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
        int left = 0;
        int right = s.length() - 1;
        char[] res = new char[right + 1];
        while (left <= right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            boolean conditionL = SolutionTest.hashSet.contains(l);
            boolean conditionR = SolutionTest.hashSet.contains(r);
            if (conditionL && conditionR) {
                res[left] = r;
                res[right] = l;
                left++;
                right--;
            } else if (conditionL && (!conditionR)) {
                res[right] = r;
                right--;
            } else if ((!conditionL) && conditionR) {
                res[left] = l;
                left++;
            } else if ((!conditionL) && (!conditionR)) {
                res[left] = l;
                res[right] = r;
                left++;
                right--;
            }
        }
        return String.valueOf(res);
    }
}
