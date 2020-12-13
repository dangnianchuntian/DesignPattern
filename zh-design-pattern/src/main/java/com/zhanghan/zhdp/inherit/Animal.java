package com.zhanghan.zhdp.inherit;

public abstract class Animal {

    protected String name;

    protected int shoutNum = 3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShoutNum() {
        return shoutNum;
    }

    public Animal() {
        this.name = "无名";
    }

    public void setShoutNum(int shoutNum) {
        if (shoutNum > 10) {
            this.shoutNum = 10;
        } else {
            this.shoutNum = shoutNum;
        }
    }

    public String shout() {
        String result = "";
        for (int i = 0; i < shoutNum; i++) {
            result = result + getShoutSound() + " ";
        }
        return "我的名字叫" + name + " " + result;
    }

    public abstract String getShoutSound();

}
