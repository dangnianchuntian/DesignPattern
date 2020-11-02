package com.zhanghan.zhdp.inherit;

public class WheezingDog extends Dog implements IChange {
    public WheezingDog(String name) {
        super(name);
    }

    @Override
    public String ChangeThing(String thing) {
        return super.shout() + " 我有超强嗅觉,我可变出:" + thing;
    }
}
