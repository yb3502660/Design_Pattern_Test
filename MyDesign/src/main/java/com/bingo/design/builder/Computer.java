package com.bingo.design.builder;

/**
 * @author:yaobin
 * @date:2021/4/16,16:47
 */

public class Computer {
    /**
     * 屏幕
     */
    private Screen screen;
    /**
     * 音箱
     */
    private Audio audio;
    /**
     * 键盘
     */
    private KeyBoard keyBoard;
    /**
     * 鼠标
     */
    private Mouse mouse;
    /**
     * 主板
     */
    private Master master;

    public Computer() {
    }

    public Computer(Screen screen, Audio audio, KeyBoard keyBoard, Mouse mouse, Master master) {
        this.screen = screen;
        this.audio = audio;
        this.keyBoard = keyBoard;
        this.mouse = mouse;
        this.master = master;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }
}
