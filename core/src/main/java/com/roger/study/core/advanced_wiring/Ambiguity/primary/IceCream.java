package com.roger.study.core.advanced_wiring.Ambiguity.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    //将该bean设置为首选的bean,若自动装载时出现多个匹配的bean ,则会选择这个
public class IceCream implements Dessert {
}
