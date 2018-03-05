/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganymedesoft.apsms.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UmAir
 */
@Repository
public class BaseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void save(Object object) throws Exception {
        getCurrentSession().save(object);
    }

    public void update(Object object) throws Exception {
        getCurrentSession().saveOrUpdate(object);
    }

    public List getAllRecords(Object type) throws Exception {
        return getCurrentSession().createQuery("from " + type.getClass().getName()).list();
    }

    public Object load(Object obj, Integer id) throws Exception {
        return getCurrentSession().load(obj.getClass(), id);
    }
    
    public Object get(Object obj, Integer id) throws Exception {
        return getCurrentSession().get(obj.getClass(), id);
    }
    
    public void delete(Object obj) {
        getCurrentSession().delete(obj);
    }
            
}
