package com.bingo.design.builder;

/**
 * @author:yaobin
 * @date:2021/4/16,16:53
 */

public class Screen {
    String name ;


    public Screen() {
    }

    public Screen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
