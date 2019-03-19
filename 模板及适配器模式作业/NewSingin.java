package com.mr.util.adapter;

import strategy2.ResultMsg;

/**
 * Created by ddqqs on 2019/3/19.
 * 让新的功能类继承旧的功能类，在原有的基础功能上不违反开闭原则来进行功能的优化
 * 对项目进行了很好的扩展，为了实现单一职责原则，可以对不同的登陆方式进行分离
 */
public class NewSingin extends Singin implements LoginThird{


    public ResultMsg loginOrResister(String id){
        super.register();
        super.login();
        return  null;
    }

    @Override
    public ResultMsg qqLogin() {
        QQLoginAdapter qqLoginAdapter = new QQLoginAdapter();
        if(qqLoginAdapter.support(qqLoginAdapter)){//作用：qq登陆中只能由qq登陆，不可以让其他登陆（微信）
            return new ResultMsg();
        }
        return null;
    }

    @Override
    public ResultMsg weiXinLogin() {
        return null;
    }
//创建一个简单工厂，并判断是否符合要求
    private ResultMsg process(String k,Class<? extends LoginAdapter> laz){
        try {
            LoginAdapter loginAdapter = laz.newInstance();
           if( loginAdapter.support(loginAdapter)){
               return loginAdapter.login(k);
           }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
