package org.echo.arithmetic;

import lombok.Setter;
import org.echo.arithmetic.domain.ListNode;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @projectName: algorithm
 * @package: org.echo.arithmetic
 * @className: BeanTest
 * @author: xin
 * @description: bean
 * @date: 2023/3/8 11:00
 * @version: 1.0
 */
@Service
public class BeanTest {
    @Bean
    public ListNode listNode(){
        return new ListNode(10);
    }
}
