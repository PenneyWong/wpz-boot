package com.wpz.common.aop;

public class Boy implements Man {
    @Override
    public void buy(String price) {
        System.out.println("男孩花" + price + "元买了一个游戏机");
    }
}