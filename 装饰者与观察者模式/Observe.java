package com.mr.util.observe.observe2;

import com.google.common.eventbus.EventBus;

import java.util.Date;

/**
 * Created by ddqqs on 2019/3/18.
 */
public class Observe {
    public static void main(String[] args) {
        QueueMsg queueMsg = new QueueMsg();
        queueMsg.setContext("谁是地球上最帅的男人？");
        queueMsg.setUsername("地球上最帅的男人");
        queueMsg.setTime(new Date());
        EventBus eventBus = new EventBus();

        eventBus.register(new Teacher());
        eventBus.register(new GPer());

        eventBus.post("tom");
        eventBus.post(queueMsg);
    }
}
