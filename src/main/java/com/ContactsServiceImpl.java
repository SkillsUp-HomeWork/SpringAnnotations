package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by v.golub on 08.12.2015.
 */
@Service
public class ContactsServiceImpl implements ContactsService {
    private List<Contact> contacts = new ArrayList<Contact>();
    @Value("${contact1.name}")
    private  String name;

    @PostConstruct
    public void init(){
        contacts.add(new Contact(name, null));
    }
    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void delContact(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public void clearAll() {
        contacts.clear();
    }

    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }
}
