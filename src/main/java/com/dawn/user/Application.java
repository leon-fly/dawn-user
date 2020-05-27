package com.dawn.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/23
 */
@SpringBootApplication
@ComponentScan("com.dawn.user")
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class);
        System.out.println("start up ---------------");
//        UserDao userDao = applicationContext.getBean(UserDao.class);
//        UserPO userPO = UserPO.builder()
//                .userName("leonwang")
//                .idNo("110101199001015254")
//                .name("金不换")
//                .sex("M")
//                .email("king@sina.com")
//                .telephone("19921011100")
//                .build();
//        /*userPO.setIdNo("110101199001015254");
//        userPO.setName("金不换");
//        userPO.setEmail();*/
//        userDao.save(userPO);
//        System.out.println("----------------"+userPO.isNew());
    }
}
