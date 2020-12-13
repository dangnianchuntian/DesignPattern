package com.zhanghan.zhdp.factory.function;

public class Client {

    public static void main(String[] args) {
        IFactory factory = new SubFactory();
        Operation operation = factory.createOperation();
        operation.setNumberA(5);
        operation.setNumberB(4);
        Integer result = operation.getResult();
        System.out.println(result);
    }
}
