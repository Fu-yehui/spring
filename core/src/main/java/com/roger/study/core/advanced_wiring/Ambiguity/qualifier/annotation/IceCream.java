package com.roger.study.core.advanced_wiring.Ambiguity.qualifier.annotation;

import com.roger.study.core.advanced_wiring.Ambiguity.primary.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 自定义限定符，不耦合类名，防止重构IceCream类名时，破坏自动装配
 */

/**
 * 面向特性的限定符使得多个bean可能拥有相同的限定符
 * 为了防止自动装配不出现歧义，需要添加限定符来缩小限定符的范围
 * 但是Spring的@Qualifier注解并没有实现@Repeatable注解，所以无法出现重复的@Qualifier注解
 *
 * @Qualifier("cold")
 * @Qualifier("creamy")
 */


@Component
@Cold
@Creamy
public class IceCream implements Dessert {
}
