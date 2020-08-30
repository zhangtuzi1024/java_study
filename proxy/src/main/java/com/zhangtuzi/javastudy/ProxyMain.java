package com.zhangtuzi.javastudy;

import com.zhangtuzi.javastudy.demo.*;

public class ProxyMain {

    public static void main(String[] args) {
        //静态代理
        SmsService smsService = new SmsServiceImpl();
        StaticSmsProxy smsProxy = new StaticSmsProxy(smsService);
        smsProxy.send("java");
        System.out.println();

        //JDK动态代理(被代理的类需要实现接口)
        smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
        System.out.println();

        //Cglib动态代理
        SmsServiceImpl aliSmsService = (SmsServiceImpl) CglibProxyFactory.getProxy(SmsServiceImpl.class);
        aliSmsService.send("java");
    }
}
