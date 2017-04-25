package com.vonzhou.learn.section11.aspectj;

import com.vonzhou.learn.section11.aspectj.domain.Foo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.dao.DataAccessException;

/**
 * 在配置文件中声明一个bean可以，
 * 而在这里使用注解Component，切面并没有执行
 * 为何？
 *
 * @version 2017/4/24.
 */
@Aspect
public class FooAop {
    @Before("com.vonzhou.learn.section11.aspectj.SystemArchitecture.dataAccessOperation())")
    public void doAccessCheck() {
        System.out.println("dao access check.....");
    }

    @AfterReturning(pointcut = "com.vonzhou.learn.section11.aspectj.SystemArchitecture.dataAccessOperation())", returning = "retVal")
    public void afterRet(Object retVal) {
        System.out.println("【afterRet】" + retVal);
    }

    @AfterThrowing(pointcut = "com.vonzhou.learn.section11.aspectj.SystemArchitecture.dataAccessOperation())", throwing = "ex")
    public void doRecoveryActions(DataAccessException ex) {
        System.out.println("【doRecoveryActions】如何挽救...?");
        // ...
    }

    @After("com.vonzhou.learn.section11.aspectj.SystemArchitecture.dataAccessOperation())")
    public void doReleaseLock() {
        System.out.println("【doReleaseLock】 ....");
    }

    @Around("com.vonzhou.learn.section11.aspectj.SystemArchitecture.businessService()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(pjp.getArgs());
        System.out.println(pjp.getThis());
        System.out.println(pjp.getTarget());
        System.out.println(pjp.getSignature());
        System.out.println(pjp.toString());

        // start stopwatch
        System.out.println("stopwatch begin...");
        Object retVal = pjp.proceed();
        System.out.println("stopwatch stop...");
        // stop stopwatch
        return retVal;
    }

    @Before("com.vonzhou.learn.section11.aspectj.SystemArchitecture.businessService() && @annotation(auditable)")
    public void audit(Auditable auditable) {
        int code = auditable.value();
        System.out.println("audit :" + code);
        // ...
    }

}
