package com.roger.study.core.advanced_wiring.Ambiguity.qualifier.annotation;


import com.roger.study.core.advanced_wiring.Ambiguity.primary.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {

    private Dessert dessert;

    @Autowired  //若由多个可选bean会出现异常
    @Creamy
    @Cold     //指定bean为iceCream
    public void setDessert(Dessert dessert){
        this.dessert=dessert;
    }
}
