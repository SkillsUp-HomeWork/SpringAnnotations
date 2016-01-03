package com.controller;

import com.dao.ContactDao;
import com.entity.MappedContact;
import com.model.Contact;
import com.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 04.01.2016.
 */
@Controller
public class AppController {

    @Autowired
    ContactService contactService;

    @RequestMapping(value="/",method = RequestMethod.GET )
    public String main() {
        return "index";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> showContacts(){
        return contactService.getAllContacts();
    }
}