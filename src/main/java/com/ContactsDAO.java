package com;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactsDAO {
    private List<Contact> contacts = new ArrayList<Contact>();

    public void add(Contact contact){
        contacts.add(contact);
    }

    public void remove(Contact contact){
        contacts.remove(contact);
    }

    public List<Contact> getAllContacts(){
        return contacts;
    }

    public void clear(){
        contacts.clear();
    }
}
