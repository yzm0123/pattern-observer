package com.gupaoedu.vip.pattern.observe.events.mykeyboardevent;

public class MyKeyboardEventTest {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        KeyboardEventCallback keyboardEventCallback = new KeyboardEventCallback();
        keyboard.registEvent(KeyboardEventTypeConstant.KEY_UP,keyboardEventCallback);
        keyboard.up();

        keyboard.registEvent(KeyboardEventTypeConstant.KEY_DOWN,keyboardEventCallback);
        keyboard.down();
    }
}
