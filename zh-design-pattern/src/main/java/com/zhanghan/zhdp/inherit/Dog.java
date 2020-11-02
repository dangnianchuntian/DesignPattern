package com.zhanghan.zhdp.inherit;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
    }

    public String getShoutSound() {
        return "汪 ";
    }
}
