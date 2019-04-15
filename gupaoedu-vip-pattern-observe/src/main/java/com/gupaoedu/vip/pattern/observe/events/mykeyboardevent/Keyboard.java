package com.gupaoedu.vip.pattern.observe.events.mykeyboardevent;

import com.gupaoedu.vip.pattern.observe.events.mycore.MyEventListener;

public class Keyboard extends MyEventListener {

    public void up(){
        System.out.println("键盘弹起事件up");
        this.triggerEvent(KeyboardEventTypeConstant.KEY_UP);
    }

    public void down(){
        System.out.println("键盘下压事件down");
        this.triggerEvent(KeyboardEventTypeConstant.KEY_DOWN);
    }
}
