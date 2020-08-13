package com.roger.study.core.aspect.inject_aspect;

public aspect CriticAspect {
    public CriticAspect(){

    }

    pointcut performance():execution(* com.roger.study.core.aspect.Performance.perform(..));

//
//     afterReturning() :  performance(){
//        System.out.println(criticismEngine.getCriticism());
//    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine){
        this.criticismEngine=criticismEngine;
    }
}
