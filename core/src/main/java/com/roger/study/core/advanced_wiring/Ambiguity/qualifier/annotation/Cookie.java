package com.roger.study.core.advanced_wiring.Ambiguity.qualifier.annotation;

import com.roger.study.core.advanced_wiring.Ambiguity.primary.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("cold")
@Cold
public class Cookie implements Dessert {
}
