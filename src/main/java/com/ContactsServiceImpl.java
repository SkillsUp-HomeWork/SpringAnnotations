package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.List;

@Service
@PropertySource("classpath:contacts.properties")
public class ContactsServiceImpl implements ContactsService {

    @Autowired
    private Environment environment;

    @Autowired
    private ContactsDAO contactsDAO;

    @PostConstruct
    public void init(){

        String nameContact;
        String adressContact;

        for (int i = 1; true; i++){
            nameContact = environment.getProperty("contact"+i+".name");
            adressContact = environment.getProperty("contact"+i+".adress");

            if (nameContact != null ){
                addContact(new Contact(nameContact, adressContact));
            }else {
                break;
            }
        }
    }
    @Override
    public void addContact(Contact contact) {
        contactsDAO.add(contact);
    }

    @Override
    public void delContact(Contact contact) {
        contactsDAO.remove(contact);
    }

    @Override
    public void clearAll() {
        contactsDAO.clear();
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactsDAO.getAllContacts();
    }
}
