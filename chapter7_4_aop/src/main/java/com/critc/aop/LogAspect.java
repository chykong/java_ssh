package com.critc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by 孔垂云 on 2017/5/6.
 */
@Aspect
public class LogAspect {

    /**
     * 方法开始前执行
     */
    @Before("execution(* com.critc.service..*.*(..)) ")
    private void beforeMethod() {
        System.out.println("the Method begins........");
    }

    /**
     * 方法结束后执行
     */
    @After("execution(* com.critc.service..*.*(..)) ")
    private void afterMethod() {
        // TODO Auto-generated method stub
        System.out.println("The Method after ................");
    }

    /**
     * 返回后执行
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "execution(* com.critc.service..*.*(..)) ", returning = "result")
    public void AfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("The Method after ................" + result);
    }

    /**
     * 抛出异常执行
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "execution(* com.critc.service..*.*(..)) ", throwing = "e")
    public void AfterThrowing(JoinPoint joinPoint, Exception e) {
        System.out.println("The Method afterThrowing................"
                + e.getMessage().toString());
    }

    /**
     * 环绕执行
     * @param pjp
     * @return
     */
    @Around(value = "execution(* com.critc.service..*.*(..)) ")
    public Object aroundTest(ProceedingJoinPoint pjp) {
        String methodName = pjp.getSignature().getName();
        Object object = null;
        try {
            // 前置通知
            System.out.println("The Method " + methodName + "before................");
            // object = pjp.proceed();
            object = "view/index";
            // 返回通知
            System.out.println(object);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            // 异常通知
            System.out.println(e.getMessage().toString());
        }
        System.out.println("The Method " + methodName + "after................");
        return object;
    }

}
