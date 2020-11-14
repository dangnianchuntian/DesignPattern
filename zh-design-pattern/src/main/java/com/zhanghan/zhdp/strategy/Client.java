package com.zhanghan.zhdp.strategy;

public class Client {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("满300减100");
        double result = cashContext.getResult(600);
        System.out.println(result);
    }
}
