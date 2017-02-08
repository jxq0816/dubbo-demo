package com.jxq.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by boxiaotong on 2017/2/8.
 */
public class ClientMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        context.start();
        DubboService service = (DubboService) context.getBean("dubboService");
        System.out.println(service.sayHello("world"));
        context.close();
    }
}
