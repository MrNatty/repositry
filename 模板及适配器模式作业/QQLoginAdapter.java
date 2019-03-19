package com.mr.util.adapter;

import strategy2.ResultMsg;

/**
 * Created by ddqqs on 2019/3/19.
 */
public class QQLoginAdapter implements LoginAdapter {
    @Override
    public boolean support(Object o) {

        return  o instanceof QQLoginAdapter;
    }

    @Override
    public ResultMsg login(String id) {
        System.out.println("qq登陆");
        return null;
    }
}
