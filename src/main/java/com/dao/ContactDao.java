package com.dao;

import com.entity.MappedContact;
import java.util.List;

public interface ContactDao {
    void save(MappedContact contact);
    
    List findAll();
}
