package com.ioc.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocExample {
    //object of interface = object of a class that implements that interface

    public static void main(String[] args) {
        //IOC : Inversion Of Control , we need to request things instead of managing them
        //Spring framework manages them.

        //load the xml : applicationIocLooseCoupling.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIocLooseCoupling.xml");

        // userManager fetching details from userDB
        UserManager userWithUserDB =  (UserManager) context.getBean("userManagerWithUserDB");
        String userInfo = userWithUserDB.getUserInfo();
        System.out.println("userInfo: " + userInfo);


        // userManager fetching details from anotherDB
        UserManager userWithAnotherDB =  (UserManager) context.getBean("userManagerWithAnotherDB");
        String userInfo1 = userWithAnotherDB.getUserInfo();
        System.out.println("userInfo1: " + userInfo1);

        // userManager fetching details from anotherDB
        UserManager userWithWebService =  (UserManager) context.getBean("userManagerWithWebService");
        String userInfo2 = userWithWebService.getUserInfo();
        System.out.println("userInfo2: " + userInfo2);


    }
}
