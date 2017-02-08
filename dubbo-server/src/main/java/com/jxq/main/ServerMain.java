package com.jxq.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by boxiaotong on 2017/2/8.
 */
public class ServerMain {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "applicationProvider.xml" });
        context.start();

        System.out.println("输入任意按键退出 ~ ");
        System.in.read();
        context.close();
    }
}
