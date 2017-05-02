package com.critc.proxy;

/**
 * Created by 孔垂云 on 2017/5/2.
 */
public class Client {
    public static void main(String[] args) {
        Subject proxy = DynProxyFactory.getInstance();
        proxy.dealTask("DBQueryTask");
    }
}
