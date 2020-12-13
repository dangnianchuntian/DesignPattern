package com.zhanghan.zhdp.factory.simple;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Integer a = 3;
        Integer b = a;
        a = 4;
        System.out.println(a);  //4
        System.out.println(b);  //3

        Man c = new Man();  //20
        Man d = c;
        d.setAge(30);

        System.out.println(c.getAge());  //25
        System.out.println(d.getAge());  //25

        Man e = new Man();  //20
        Man f = new Man();

        f = e.clone();   //20
        e.setAge(25);

        System.out.println(e.getAge());  //25
        System.out.println(f.getAge());  //20
    }
}
