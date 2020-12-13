package com.zhanghan.zhdp.factory.simple;


public class Man implements Cloneable {

    private int age = 20;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Man clone() throws CloneNotSupportedException{
        return (Man)super.clone();
    }


    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}
