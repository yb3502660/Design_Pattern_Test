package com.bingo.design.builder;

/**
 * 惠普电脑构建
 * 
 * @author:yaobin
 * @date:2021/4/16,16:53
 */

public class HPComputerBuilder extends ComputerBuilder{
    
    
    @Override
    public void buildMaster() {
        
        computer.setMaster(new Master("惠普主板"));
    }

    @Override
    public void buildScreen() {
        computer.setScreen(new Screen("惠普屏幕"));
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyBoard(new KeyBoard("惠普键盘"));
    }

    @Override
    public void buildMouse() {
        computer.setMouse(new Mouse("惠普鼠标"));
    }

    @Override
    public void buildAudio() {
        computer.setAudio(new Audio("惠普音箱"));
    }
}
