package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by v.golub on 11.12.2015.
 */
@Configuration
@PropertySource("classpath:contacts.properties")
public class JavaConfig {

    @Bean
    public ContactsDAO dao(){
        return new ContactsDAO();
    }

    @Bean(initMethod = "init")
    public ContactsService contactsService(){
        ContactsServiceImpl contactsService = new ContactsServiceImpl();
        contactsService.setContactsDAO(dao());
//        contactsService.setEnvironment( "What here?" );
        return contactsService;
    }

}
