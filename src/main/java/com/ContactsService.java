package com;

import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * Created by v.golub on 08.12.2015.
 */


public interface ContactsService {
    void addContact(Contact contact);
    void delContact(Contact contact);
    void clearAll();
    List<Contact> getAllContacts();
}
