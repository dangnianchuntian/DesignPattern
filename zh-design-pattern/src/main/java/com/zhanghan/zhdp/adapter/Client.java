package com.zhanghan.zhdp.adapter;

/**
 * @Description: 客户端
 * @author: zhanghan
 * @date: 2021年02月02日 13:39
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
