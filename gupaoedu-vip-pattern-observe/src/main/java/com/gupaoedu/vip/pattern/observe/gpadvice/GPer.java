package com.gupaoedu.vip.pattern.observe.gpadvice;

import java.util.Observable;

/**
 * JDK提供的一种观察者实现方式，
 * 被观察者
 */
public class GPer extends Observable {

    private String name = "GPer生态圈";

    private static GPer gPer = null;

    private GPer(){}

    public static GPer getInstance(){
        if (gPer == null){
            gPer = new GPer();
        }
        return gPer;
    }

    public void publishQuestion(Question question){

        System.out.println(question.getName() + "在"+ this.name + "提交了一个问题。");
        setChanged();
        notifyObservers(question);//将问题通知观察者
    }

    public String getName() {
        return name;
    }
}
