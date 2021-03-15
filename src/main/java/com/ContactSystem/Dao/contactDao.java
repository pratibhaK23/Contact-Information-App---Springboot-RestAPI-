package com.ContactSystem.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ContactSystem.Entities.Contact;

//JpaRepository interface contains all the CRUD methods for handling database
public interface contactDao extends JpaRepository <Contact,Long>
{

}
