package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by v.golub on 11.12.2015.
 */
@Configuration
public class JavaConfig {

    @Bean
    public ContactsDAO dao(){
        return new ContactsDAO();
    }

    @Bean(initMethod = "init")
    public ContactsService contactsService(){
        ContactsServiceImpl contactsService = new ContactsServiceImpl();
        contactsService.setEnvironment( "What here?" );
        return contactsService;
    }

}
