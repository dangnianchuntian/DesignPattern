package com.zhanghan.zhdp.factory.function;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
