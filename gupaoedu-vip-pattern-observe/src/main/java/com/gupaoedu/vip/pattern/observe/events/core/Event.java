package com.gupaoedu.vip.pattern.observe.events.core;

import java.lang.reflect.Method;

/**
 * 监听器的一种包装，标准事件源格式的定义
 */
public class Event {

    //事件源，事件是由谁发起的，保存起来
    private Object source;

    //事件触发，要通知谁，目标
    private Object target;

    //事件触发，要做什么动作，回调。目标对象的方法
    private Method callback;

    //事件名称
    private String trigger;

    //触发事件时间
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public Method getCallback() {
        return callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event:{"+ "\n" +
                "\t\n source=" + source +
                "\t\n target=" + target +
                "\t\n callback=" + callback +
                "\t\n trigger=" + trigger +
                "\t\n time=" + time +
                "}";
    }
}
