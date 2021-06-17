package com.bingo.design.builder;

import lombok.Getter;

/**
 * @author:yaobin
 * @date:2021/4/16,16:52
 */
public class Master {
    String name;

    public Master(String name) {
        this.name = name;
    }

    public Master() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
