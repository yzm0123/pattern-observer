package com.gupaoedu.vip.pattern.observe.events;

import com.gupaoedu.vip.pattern.observe.events.mouseevent.Mouse;
import com.gupaoedu.vip.pattern.observe.events.mouseevent.MouseEventCallback;
import com.gupaoedu.vip.pattern.observe.events.mouseevent.MouseEventType;

public class MouseEventsTest {

    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();
        Mouse mouse = new Mouse();

        mouse.addListener(MouseEventType.ON_CLLICK,callback);
        mouse.clcik();

        mouse.addListener(MouseEventType.ON_BLUR,callback);
        mouse.blur();
    }
}
