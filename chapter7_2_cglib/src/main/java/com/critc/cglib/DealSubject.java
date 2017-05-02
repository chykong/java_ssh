package com.critc.cglib;

/**
 * Created by 孔垂云 on 2017/5/2.
 *需要被代理的类，实现Subject方法
 */
public class DealSubject implements  Subject {
    @Override
    public void dealTask(String taskName) {

        System.out.println("执行任务：" + taskName);
    }
}
