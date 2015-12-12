package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by v.golub on 12.12.2015.
 */
@RunWith(JUnit4.class)
public class ContactTests {
    @Test
    public void testCreateContact(){
        String testName = "name";
        String testCity = "city";
        Contact contact = new Contact(testName, testCity);
        Assert.assertTrue(contact.getName().equals(testName));
        Assert.assertTrue(contact.getAdress().equals(testCity));
    }
}
