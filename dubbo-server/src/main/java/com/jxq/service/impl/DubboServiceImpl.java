package com.jxq.service.impl;

import com.jxq.service.DubboService;

/**
 * Created by boxiaotong on 2017/2/8.
 */
public class DubboServiceImpl implements DubboService {
    public String sayHello(String name) {
        System.out.println("init : " + name);
        return "hello " + name;
    }
}
