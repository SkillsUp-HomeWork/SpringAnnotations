package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by v.golub on 11.12.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTests {
    @Autowired
    private ContactsService contactsService;

    @Test
    public void testStartContext(){
    }

//    @Test
//    public void testAddContact(){
//        int prev = contactsService.getAllContacts().size();
//        contactsService.addContact(new Contact("test", "test"));
//        int curr = contactsService.getAllContacts().size();
//        Assert.assertFalse(curr == prev);
//    }
}
