package com;

import java.util.List;

public interface ContactsService {
    void addContact(Contact contact);
    void delContact(Contact contact);
    void clearAll();
    List<Contact> getAllContacts();
}
