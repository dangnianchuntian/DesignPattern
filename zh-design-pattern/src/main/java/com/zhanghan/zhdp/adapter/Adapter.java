package com.zhanghan.zhdp.adapter;

/**
 * @Description: 适配器
 * @author: zhanghan
 * @date: 2021年02月02日 13:38
 */
public class Adapter implements Target {
    public Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.doSomething();
    }
}
