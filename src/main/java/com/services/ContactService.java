package com.services;

import com.model.Contact;

import java.util.List;

public interface ContactService {
    void addContact(Contact contact);
    void delContact(Contact contact);
    void clearAll();
    List<Contact> getAllContacts();
}
