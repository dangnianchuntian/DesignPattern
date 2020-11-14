package com.zhanghan.zhdp.inherit;

public class MachineCat extends Cat implements IChange {

    public MachineCat(String name) {
        super(name);
    }

    @Override
    public String changeThing(String thing) {
        return super.shout() + " 我有万能的口袋,我可变出:" + thing;
    }
}
