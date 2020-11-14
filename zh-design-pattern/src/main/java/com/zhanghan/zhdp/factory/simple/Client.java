package com.zhanghan.zhdp.factory.simple;

public class Client {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(2);
        operation.setNumberB(3);
        double result = operation.getResult();
        System.out.println(result);

    }
}
