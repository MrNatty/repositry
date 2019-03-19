package com.mr.util.adapter;

import strategy2.ResultMsg;

/**
 * Created by ddqqs on 2019/3/19.
 */
public class Singin {
    public ResultMsg login(){
        return null;
    };
    public ResultMsg register(){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setMsg("注册成功");
        resultMsg.setCode("200");
        return new ResultMsg();
    };
}
