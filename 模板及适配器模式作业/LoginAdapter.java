package com.mr.util.adapter;

import com.mr.util.AdapterPattern.Result;
import strategy2.ResultMsg;

/**
 * Created by ddqqs on 2019/3/19.
 */
public interface LoginAdapter {
    boolean support(Object o);
    ResultMsg login(String id);
}
