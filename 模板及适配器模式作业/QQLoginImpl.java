package com.mr.util.adapter;

import strategy2.ResultMsg;

/**
 * Created by ddqqs on 2019/3/19.
 */
public class QQLoginImpl implements LoginAdapter {



    @Override
    public boolean support(Object o) {
        return false;
    }

    @Override
    public ResultMsg login(String id) {
        return null;
    }
}
