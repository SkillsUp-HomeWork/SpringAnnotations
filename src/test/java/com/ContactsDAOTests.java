package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class ContactsDAOTests {
    @Test
    public void test(){
        ContactsDAO contactsDAO = new ContactsDAO();
        Assert.assertTrue(contactsDAO.getAllContacts().getClass() == List.class);
    }
}
