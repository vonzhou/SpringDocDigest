package com.vonzhou.learn.section11.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Supported Pointcut Designators
 * execution - for matching method execution join points, this is the primary pointcut designator you will use when working with Spring AOP
 * @annotation - limits matching to join points where the subject of the join point (method being executed in Spring AOP) has the given annotation
 * 
 * @version 2017/4/24.
 */
@Aspect
public class NotVeryUsefulAspect {
    @Pointcut("execution(* transfer(..))") // the pointcut expression
    private void anyOldTransfer() {
    }// the pointcut signature
}
