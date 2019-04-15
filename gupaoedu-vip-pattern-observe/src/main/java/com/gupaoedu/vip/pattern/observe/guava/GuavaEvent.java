package com.gupaoedu.vip.pattern.observe.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){

        System.out.println("执行subscribe方法，参数为：" + str);
    }
}
