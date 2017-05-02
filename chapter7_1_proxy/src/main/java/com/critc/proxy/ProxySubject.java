package com.critc.proxy;

/**
 * Created by 孔垂云 on 2017/5/2.
 * 　代理类，实现了代理接口。
 */
public class ProxySubject implements Subject {
    //代理类持有一个委托类的对象引用
    private Subject delegate;

    public ProxySubject(Subject delegate) {
        this.delegate = delegate;
    }

    /**
     * 将请求分派给委托类执行，记录任务执行前后的时间，时间差即为任务的处理时间
     *
     * @param taskName
     */
    @Override
    public void dealTask(String taskName) {
        long stime = System.currentTimeMillis();
        //将请求分派给委托类处理
        delegate.dealTask(taskName);
        long ftime = System.currentTimeMillis();
        System.out.println("执行任务耗时" + (ftime - stime) + "毫秒");

    }
}