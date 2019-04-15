package com.gupaoedu.vip.pattern.observe.events.mykeyboardevent;

import com.gupaoedu.vip.pattern.observe.events.mycore.MyEvent;

public class KeyboardEventCallback {

    public void onUp(MyEvent event){
        System.out.println("触发键盘弹起事件======，回调，KeyboardEventCallback.onUp()");
    }

    public void onDown(MyEvent event){
        System.out.println("触发键盘下压事件======，回调，KeyboardEventCallback.onDown()");
    }
}
