package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.mockito.Mockito.*;
/**
 * Created by admin on 13.12.2015.
 */
@RunWith(JUnit4.class)
public class ContactTests {
    @Test
    public void testContactName(){
        Contact mockContact = mock(Contact.class);
        String testName = "name";
        mockContact.setName(testName);
        verify(mockContact, times(1)).setName(testName);

    }
}
