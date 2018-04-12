package com.shihu.demo.dubbo.api.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.shihu.demo.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;

public class DemoServiceImpl implements DemoService {
	private Logger logger=LoggerFactory.getLogger(DemoServiceImpl.class);

    public List<String> getPermissions(Long id) {
    	long start=System.currentTimeMillis();
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        long end=System.currentTimeMillis();
        logger.info("响应时间"+(end-start));
        System.out.println("响应时间"+(end-start));
        return demo;
    }

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
	}
}
