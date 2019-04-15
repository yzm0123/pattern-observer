package com.gupaoedu.vip.pattern.observe.guava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {

    public static void main(String[] args) {
        GuavaEvent event = new GuavaEvent();

        //事件总线
        EventBus eventBus = new EventBus();
        //注册
        eventBus.register(event);

        //发送
        eventBus.post("Tom");
    }
}
