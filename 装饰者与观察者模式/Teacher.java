package com.mr.util.observe.observe2;

import com.google.common.eventbus.Subscribe;

/**
 * Created by ddqqs on 2019/3/18.
 */
public class Teacher {

    @Subscribe
    public void  t(String name){

        System.out.println("@"+name+"老师，起床了.");
    }
    public void  y(String uname){

        System.out.println("还用说，当然是"+uname+"啊！");
    }
}
