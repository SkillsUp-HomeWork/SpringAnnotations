package com;

import com.config.JavaConfig;
import com.entity.ContactRole;
import com.model.Contact;
import com.services.ContactService;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        ContactService contactService = context.getBean(ContactService.class);

        Contact contact = new Contact();
        contact.setFirstName("firstName");
        contact.setSecondName("secondName");
        contact.setState(true);
        contact.setRole(ContactRole.USER);
        contact.setLogin("login");
        contact.setPassword("password");

        contactService.addContact(contact);

        for (Contact savedContact : contactService.getAllContacts()) {
            System.out.println("Saved contact - " + savedContact);
        }
        //System.out.println(contactsService.getAllContacts());
        //contactsService.clearAll();
        //System.out.println(contactsService.getAllContacts());



    }
}
