package com.critc.cglib;

/**
 * Created by 孔垂云 on 2017/5/2.
 * 调用cglib生成的动态代理
 */
public class Client {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        //通过生成子类的方式创建代理类
        Subject proxyImp = (DealSubject) proxy.getProxy(DealSubject.class);
        proxyImp.dealTask("test");
    }
}
