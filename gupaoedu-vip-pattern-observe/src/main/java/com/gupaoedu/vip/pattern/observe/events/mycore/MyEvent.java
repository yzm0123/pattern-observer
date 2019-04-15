package com.gupaoedu.vip.pattern.observe.events.mycore;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * 定义事件
 */
public class MyEvent {

    //事件源
    private Object eventSource;

    //事件要通知的目标对象
    private Object eventTarget;

    //事件通知目标对象做什么
    private Method callback;

    //事件名称
    private String triggerName;

    //事件发生时间
    private Date eventDate;

    public MyEvent(Object eventTarget, Method callback) {
        this.eventTarget = eventTarget;
        this.callback = callback;
    }

    public Object getEventSource() {
        return eventSource;
    }

    public void setEventSource(Object eventSource) {
        this.eventSource = eventSource;
    }

    public Object getEventTarget() {
        return eventTarget;
    }

    public void setEventTarget(Object eventTarget) {
        this.eventTarget = eventTarget;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
}
