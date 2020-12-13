package com.zhanghan.zhdp.factory.function;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
