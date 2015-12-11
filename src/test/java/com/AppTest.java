package com;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

/**
 * Created by v.golub on 11.12.2015.
 */
@RunWith(JUnit4.class)
@Suite.SuiteClasses(AppTest.class)
public class AppTest {

    @Test
    public void test(){
        String name = "qwerty";
        Contact contact = new Contact(name, "city");
        Assert.assertEquals(contact.getName(), name);
    }
}
