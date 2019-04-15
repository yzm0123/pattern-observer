package com.gupaoedu.vip.pattern.observe.gpadvice;

public class ObserverTest {
    public static void main(String[] args) {

        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        Teacher yang = new Teacher("杨");

        Question question = new Question();
        question.setName("yzm");
        question.setContent("how to study java well?");
        gPer.addObserver(tom);//@tom 观察者
        gPer.addObserver(mic);//@mic 观察者
        gPer.addObserver(yang);//@myang 观察者
        gPer.publishQuestion(question);


    }
}
