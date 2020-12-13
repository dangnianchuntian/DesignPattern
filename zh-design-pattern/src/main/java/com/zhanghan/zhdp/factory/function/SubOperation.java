package com.zhanghan.zhdp.factory.function;

public class SubOperation extends Operation {
    @Override
    public Integer getResult() {
        return this.numberA - this.numberB;
    }
}
