package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ContactsService contactsService = context.getBean(ContactsService.class);
        System.out.println(contactsService.getAllContacts().get(0));

    }
}
