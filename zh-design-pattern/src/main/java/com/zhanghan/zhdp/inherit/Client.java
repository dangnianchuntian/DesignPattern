/*
 * Copyright (c) 2020. zhanghan_java@163.com All Rights Reserved.
 * 项目名称：Spring Boot实战解决高并发数据入库: Redis 缓存+MySQL 批量入库
 * 类名称：ArticleCountController.java
 * 创建人：张晗
 * 联系方式：zhanghan_java@163.com
 * 开源地址: https://github.com/dangnianchuntian/springboot
 * 博客地址: https://zhanghan.blog.csdn.net
 */

package com.zhanghan.zhdp.inherit;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        Animal xiaohua = new Cat("小花");
        list.add(xiaohua);
        Animal xiaoer = new Dog("小二");
        xiaoer.setShoutNum(5);
        list.add(xiaoer);

        for (Animal animal : list) {
            System.out.println(animal.shout());
        }

        List<IChange> iChangeList = new ArrayList<>();
        MachineCat machineCat = new MachineCat("叮当");
        iChangeList.add(machineCat);
        ZhuBaJieDog wheezingDog = new ZhuBaJieDog("猪八戒");
        iChangeList.add(wheezingDog);

        for (IChange iChange : iChangeList) {
            System.out.println(iChange.changeThing("变出各种东西"));
        }
    }
}
