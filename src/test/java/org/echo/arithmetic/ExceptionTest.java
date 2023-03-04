package org.echo.arithmetic;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
//        Unsafe unsafe = Unsafe.getUnsafe();
//        int i = unsafe.addressSize();
//        int i1 = unsafe.pageSize();
//        System.out.println(i);
//        System.out.println(i1);
        System.out.println(2^2);
        System.out.println(2*2);
    }
    // ThreadPoolExecutor executor=new ThreadPoolExecutor(1,2,5, TimeUnit.MINUTES,new ArrayBlockingQueue<>(100));

}
