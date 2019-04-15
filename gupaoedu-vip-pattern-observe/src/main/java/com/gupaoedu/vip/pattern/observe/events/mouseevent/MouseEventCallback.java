package com.gupaoedu.vip.pattern.observe.events.mouseevent;

import com.gupaoedu.vip.pattern.observe.events.core.Event;

/**
 * 自己写的逻辑，用于回调
 */
public class MouseEventCallback {

    public void onClick(Event event){
        System.out.println("===========触发鼠标单击事件==========" + "\n" + event);
    }

    public void onBlur(Event event){
        System.out.println("===========触发失去焦点事件==============" + "\n" + event);
    }
}
