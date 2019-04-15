package com.gupaoedu.vip.pattern.observe.gpadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable O, Object arg) {
        GPer gPer = (GPer) O;
        Question question = (Question) arg;


        System.out.println("=================================");
        System.out.println(name + "老师，你好：\n" +
            "你收到了一个来自《" + gPer.getName() + "》的提问，希望你解答，内容如下：\n" + question.getContent() + "\n"
        + "提问者：" + question.getName()+"同学");
    }
}
