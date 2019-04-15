package com.gupaoedu.vip.pattern.observe.events.mycore;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件监听器
 */
public class MyEventListener {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

    Map<String,MyEvent> eventMap = new HashMap<String, MyEvent>();

    /**
     * 1、注册事件
     * @param eventName
     * @param eventTarget
     * @param callback
     */
    public void registEvent(String eventName,Object eventTarget,Method callback){
        eventMap.put(eventName,new MyEvent(eventTarget,callback));
    }

    /**
     * 1、注册事件
     * @param eventName
     * @param eventTarget
     */
    public void registEvent(String eventName, Object eventTarget){
        try {
            String methodName = "on" + toUpperFirstCase(eventName);
            Method callback = eventTarget.getClass().getMethod(methodName,MyEvent.class);
            eventMap.put(eventName,new MyEvent(eventTarget,callback));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 首字母大写
     * @param eventName
     * @return
     */
    private String toUpperFirstCase(String eventName) {
        char[] chars = eventName.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    private void triggerEvent(MyEvent event){
        try {
            event.setEventDate(new Date());
            if(event.getCallback() != null){
                event.getCallback().invoke(event.getEventTarget(),event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void triggerEvent(String triggerName){

        if(!eventMap.containsKey(triggerName)){
            return;
        }
        MyEvent event = eventMap.get(triggerName);
        triggerEvent(event);
    }


}
