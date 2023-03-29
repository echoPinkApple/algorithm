package org.echo.arithmetic;

import java.util.ArrayList;
import java.util.List;

public class Test06 {

    public static void main(String[] args) {
        Test06 test06 = new Test06();
        test06.selfDividingNumbers(20, 22);
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();
        while(left<=right){
            if(isSelfDivid(left)){
                res.add(left);
            }            
            left++;
        }
        return res;
    }

    public boolean isSelfDivid(int num){
        while(num!=0){
            int tmpNum=num%10;
            if(tmpNum==0){
                return false;
            }
            if((num%tmpNum)!=0){
                return false;
            }
            num=num/10;
        }
        return true;
    }
}
