package org.echo.arithmetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ArithmeticApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ArithmeticApplication.class, args);
        for (String name : run.getBeanDefinitionNames()) {
            System.out.println(name);
        }

//        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanTest.class );
//        for (String name : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
    }

}
