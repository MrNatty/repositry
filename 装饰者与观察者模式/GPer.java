package com.mr.util.observe.observe2;

import com.google.common.eventbus.Subscribe;

/**
 * Created by ddqqs on 2019/3/18.
 */
public class GPer {
    @Subscribe
    public void s(QueueMsg msg){
        System.out.println(msg.getUsername()+"再GPer生态圈发布了一篇文章:"+msg.getContext()+";\n时间是："+msg.getTime());
        Teacher teacher = new Teacher();
        teacher.y("帅哥");
    }
}
