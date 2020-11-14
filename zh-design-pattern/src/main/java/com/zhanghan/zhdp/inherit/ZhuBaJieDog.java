package com.zhanghan.zhdp.inherit;

public class ZhuBaJieDog extends Dog implements IChange {
    public ZhuBaJieDog(String name) {
        super(name);
    }

    @Override
    public String changeThing(String thing) {
        return super.shout() + " 我有三十六变,我可变出:" + thing;
    }
}
