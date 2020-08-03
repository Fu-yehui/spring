package com.roger.study.core.advanced_wiring.Ambiguity.qualifier;


import com.roger.study.core.advanced_wiring.Ambiguity.primary.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {

    private Dessert dessert;

    @Autowired  //若由多个可选bean会出现异常
    @Qualifier("cold")   //指定注入bean   将具有与所指限定符ID相同的bean注入其中
    //bean默认限定符为bean ID
    public void setDessert(Dessert dessert){
        this.dessert=dessert;
    }
}
