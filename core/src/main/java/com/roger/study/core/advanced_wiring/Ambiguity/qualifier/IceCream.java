package com.roger.study.core.advanced_wiring.Ambiguity.qualifier;

import com.roger.study.core.advanced_wiring.Ambiguity.primary.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 自定义限定符，不耦合类名，防止重构IceCream类名时，破坏自动装配
 */


@Component
@Qualifier("cold")   //将bean:iceCream的限定符赋值为： cold

public class IceCream implements Dessert {
}
