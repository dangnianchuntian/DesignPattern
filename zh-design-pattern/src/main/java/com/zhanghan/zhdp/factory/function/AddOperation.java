package com.zhanghan.zhdp.factory.function;

public class AddOperation extends Operation {
    @Override
    public Integer getResult() {
        return this.numberA+this.numberB;
    }
}
