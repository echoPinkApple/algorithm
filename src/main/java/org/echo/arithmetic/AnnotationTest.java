package org.echo.arithmetic;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashSet;

import org.echo.arithmetic.AnnotationTest.A2;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;

@A2(value = "main-a2",value2 = "main-value2")
public class AnnotationTest {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface A1{
        String value() default "a1";
    }

    @A1
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface A2{
        String value() default "a2";
        @AliasFor(annotation = A1.class,value = "value")
        String value2() default "value2";
    }

    public static void main(String[] args) {
        A1 mergedAnnotation = AnnotatedElementUtils.getMergedAnnotation(AnnotationTest.class, A1.class);
        System.out.println(mergedAnnotation );
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(AnnotationTest.class,A2.class));
    }
}
