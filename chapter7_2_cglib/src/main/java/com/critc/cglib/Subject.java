package com.critc.cglib;

/**
 * Created by 孔垂云 on 2017/5/2.
 * 代理接口。处理给定名字的任务。
 */
public class Subject {
    /**
     * 执行给定名字的任务。
     *
     * @param taskName 任务名
     */
    public void dealTask(String taskName) {
        System.out.println("执行任务：" + taskName);
    }
}