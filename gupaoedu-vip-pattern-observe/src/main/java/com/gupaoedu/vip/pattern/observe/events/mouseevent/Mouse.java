package com.gupaoedu.vip.pattern.observe.events.mouseevent;

import com.gupaoedu.vip.pattern.observe.events.core.EventListener;

public class Mouse extends EventListener {

    public void clcik(){
        System.out.println("调用鼠标的单击方法click");
        this.trigger(MouseEventType.ON_CLLICK);
    }

    public void blur(){
        System.out.println("调用鼠标的失去焦点方法blur");
        this.trigger(MouseEventType.ON_BLUR);
    }
}
