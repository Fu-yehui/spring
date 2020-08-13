package com.roger.study.core.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

//    @DeclareParents(value="com.roger.study.core.aspect.Performance+",
//                    defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
