package com.services.impl;

import com.dao.ContactDao;
import com.entity.MappedContact;
import com.model.Contact;
import com.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactsServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public void addContact(Contact contact) {
        MappedContact mappedContact = new MappedContact();
        mappedContact.setFirstName(contact.getFirstName());
        mappedContact.setSecondName(contact.getSecondName());
        mappedContact.setLogin(contact.getLogin());
        mappedContact.setPassword(contact.getPassword());
        mappedContact.setRole(contact.getRole());
        mappedContact.setState(contact.isState());
        contactDao.save(mappedContact);
    }

    @Override
    public void delContact(Contact contact) {

    }

    @Override
    public void clearAll() {

    }

    @Override
    public List<Contact> getAllContacts() {
        List<MappedContact> mappedContacts = contactDao.findAll();
        List<Contact> contacts = new ArrayList<Contact>(mappedContacts.size());
        for (MappedContact mappedContact : mappedContacts) {
            Contact contact = new Contact();
            contact.setFirstName(mappedContact.getFirstName());
            contact.setSecondName(mappedContact.getSecondName());
            contacts.add(contact);
        }
        return contacts;
    }

}
