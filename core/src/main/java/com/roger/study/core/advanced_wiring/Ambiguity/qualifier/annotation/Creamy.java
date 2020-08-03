package com.roger.study.core.advanced_wiring.Ambiguity.qualifier.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 自定义限定符注解，使用@Cream注解，而不使用@Qualifier("creamy"),防止出现重复
 */
@Qualifier
public @interface Creamy {
}
