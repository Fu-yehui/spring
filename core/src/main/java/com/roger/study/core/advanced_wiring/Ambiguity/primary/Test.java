package com.roger.study.core.advanced_wiring.Ambiguity.primary;


import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    private Dessert dessert;

    @Autowired  //若由多个可选bean会出现异常
    public void setDessert(Dessert dessert){
        this.dessert=dessert;
    }
}
