package com.dao;

import com.entity.MappedContact;
import java.util.List;

/**
 * Created by admin on 03.01.2016.
 */
public interface ContactDao {
    void save(MappedContact contact);
    
    List findAll();
}
