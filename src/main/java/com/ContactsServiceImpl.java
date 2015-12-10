package com;

import org.springframework.core.env.Environment;
import java.util.List;

public class ContactsServiceImpl implements ContactsService {

    private Environment environment;

    private ContactsDAO contactsDAO;

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

    public void setContactsDAO(ContactsDAO contactsDAO) {
        this.contactsDAO = contactsDAO;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
