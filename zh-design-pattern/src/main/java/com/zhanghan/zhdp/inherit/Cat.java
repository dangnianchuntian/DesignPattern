package com.zhanghan.zhdp.inherit;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }

    public String getShoutSound() {
        return "喵 ";
    }

}
