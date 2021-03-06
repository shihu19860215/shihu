package com.shihu.demo.dubbo;

import com.shihu.demo.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main1 {
	public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
        System.out.println("end");
	}
}
