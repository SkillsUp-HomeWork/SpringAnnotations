package com;

import com.config.JavaConfig;
import com.services.ContactService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
public class SpringAppTest {

    @Autowired
    private ContactService contactsService;

    @Test
    public void testStartContext(){
        System.out.println(contactsService.getAllContacts());
        Assert.assertEquals("1", "1");
    }
}

