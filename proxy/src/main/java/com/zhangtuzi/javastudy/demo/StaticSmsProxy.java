package com.zhangtuzi.javastudy.demo;

/**
 * 静态代理
 */
public class StaticSmsProxy implements SmsService {
    private final SmsService smsService;

    public StaticSmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    public String send(String message) {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("SmsProxy before method send");
        smsService.send(message);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("SmsProxy after method send");
        return null;
    }
}
