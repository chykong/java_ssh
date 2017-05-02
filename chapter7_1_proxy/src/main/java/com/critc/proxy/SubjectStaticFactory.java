package com.critc.proxy;

/**
 * Created by 孔垂云 on 2017/5/2.
 */
public class SubjectStaticFactory {
    //客户类调用此工厂方法获得代理对象。
    //对客户类来说，其并不知道返回的是代理类对象还是委托类对象。
    public static Subject getInstance() {
        return new ProxySubject(new RealSubject());
    }
}
