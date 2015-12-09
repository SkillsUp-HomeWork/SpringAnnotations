package com;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ContactsService contactsService = context.getBean(ContactsService.class);
        System.out.println(contactsService.getAllContacts());
        contactsService.clearAll();
        System.out.println(contactsService.getAllContacts());
        //q

    }
}
