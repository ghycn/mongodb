package com.org.hsd.web;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by Administrator on 2017/2/22.
 */
public class InitListener implements ApplicationListener<ContextRefreshedEvent> {
    /**
     * 启动加载执行
     */
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("------启动容器，自动加载------");
    }
}
