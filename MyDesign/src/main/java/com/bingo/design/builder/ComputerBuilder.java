package com.bingo.design.builder;

/**
 * @author:yaobin
 * @date:2021/4/16,16:46
 */

public abstract class ComputerBuilder {
    protected Computer computer;
    
    public Computer getComputer(){
        return computer;
    }
    
    public void buildComputer(){
        Computer computer = new Computer();
        System.out.println("生成了一台电脑");
    }
    
    //构建主板
    public abstract void buildMaster();
    //构建屏幕
    public abstract void buildScreen();
    //构建键盘
    public abstract void buildKeyboard();
    //构建鼠标
    public abstract void buildMouse();
    //构建音箱
    public abstract void buildAudio();
    
}

