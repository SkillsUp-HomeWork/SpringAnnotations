package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ContactTests {
    @Test
    public void testContactName(){
        Contact mockContact = mock(Contact.class);
        String testName = "name";
        mockContact.setName(testName);
        verify(mockContact, times(1)).setName(testName);
    }
}
