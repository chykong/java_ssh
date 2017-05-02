package com.critc.proxy;

/**
 * Created by 孔垂云 on 2017/5/2.
 */
public class Client1 {
    public static void main(String[] args) {
        Subject proxy = SubjectStaticFactory.getInstance();
        proxy.dealTask("DBQueryTask");
    }
}
