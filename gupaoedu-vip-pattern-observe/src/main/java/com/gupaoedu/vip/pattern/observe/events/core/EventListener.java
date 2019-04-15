package com.gupaoedu.vip.pattern.observe.events.core;

import com.sun.xml.internal.ws.util.StringUtils;
import sun.applet.Main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/**
 * 监听器，它就是观察者
 */
public class EventListener {

    protected Map<String,Event> eventMap = new HashMap<String, Event>();

    public void addListener(String eventType,Object target){
        try {
            this.addListener(eventType,target,target.getClass().getMethod("on" + toUpperFirstCase(eventType),Event.class));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 首字母大写
     * @param eventType
     * @return
     */
    private static String toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    /**
     * 事件注册
     * @param eventType
     * @param target
     * @param callback
     */
    public void addListener(String eventType, Object target, Method callback){
        eventMap.put(eventType,new Event(target,callback));
    }

    /**
     * 触发事件
     */
    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        //发起回调
        try {
            if(event.getCallback() != null){
                event.getCallback().invoke(event.getTarget(),event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //事件名称触发
    protected void trigger(String trigger){
        if(!this.eventMap.containsKey(trigger)){
            return;
        }

        trigger(this.eventMap.get(trigger).setTrigger(trigger));
    }
}
