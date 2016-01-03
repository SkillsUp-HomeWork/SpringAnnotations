package com;

import com.config.JavaConfig;
import com.services.ContactsService;
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
@ContextConfiguration(classes=JavaConfig.class)
public class SpringAppTest {

    @Autowired
    private ContactsService contactsService;

    @Test
    public void testStartContext(){
        System.out.println(contactsService.getAllContacts());
        Assert.assertEquals("1", "1");
    }
}

