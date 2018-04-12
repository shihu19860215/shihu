package com.shihu.demo.mongodb.main;

import com.shihu.demo.mongodb.dao.MongoDBUserDao;
import com.shihu.demo.mongodb.model.Address;
import com.shihu.demo.mongodb.model.Corporation;
import com.shihu.demo.mongodb.model.MongoDBUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mongodb.xml");
        MongoDBUserDao mongoDBUserDao= (MongoDBUserDao) context.getBean("mongoDBUserDao");
        MongoDBUser mongoDBUser=new MongoDBUser();
        mongoDBUser.setUsername("小微");
        mongoDBUser.setPassword("123456");
        mongoDBUser.setAddressList(new LinkedList<Address>());
        Address address=new Address();
        address.setAddr("太阳宫");
        address.setDate(new Date());
        mongoDBUser.getAddressList().add(address);
        address.setAddr("望京");
        address.setDate(new Date());
        mongoDBUser.getAddressList().add(address);

        List<Corporation> l1=new LinkedList<>();
        l1.add(new Corporation("张三",60));
        l1.add(new Corporation("李四",40));

        List<Corporation> l2=new LinkedList<>();
        l2.add(new Corporation("张三",52));
        l2.add(new Corporation("李四",40));
        l2.add(new Corporation("王五",8));
        List<Corporation> l3=new LinkedList<>();
        l3.add(new Corporation("王五",100));
        mongoDBUser.setCorporationListList(new LinkedList<List<Corporation>>());
        mongoDBUser.getCorporationListList().add(l1);
        mongoDBUser.getCorporationListList().add(l2);
        mongoDBUser.getCorporationListList().add(l3);


        mongoDBUserDao.insert(mongoDBUser,"users");
        List<MongoDBUser> list=mongoDBUserDao.findAll("users");
        System.out.println(list.size());
    }
}
