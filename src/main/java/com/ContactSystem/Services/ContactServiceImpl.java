package com.ContactSystem.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ContactSystem.Dao.contactDao;
import com.ContactSystem.Entities.Contact;

//To tell Springboot that this is Service class
@Service
public class ContactServiceImpl implements ContactService
{
	@Autowired
   contactDao conD;
   

	//Returns list of Contacts
	@Override
	public List<Contact> getContacts()
	{
		return conD.findAll();
	}

	@Override
	public Contact getContact(long Phone) 
	{
		return conD.getOne(Phone);
	}

	@Override
	public Contact addContact(Contact c) 
	{
		conD.save(c);
		return c;
	}

	@Override
	public void removeContact(long parseLong)
	{
		Contact entity = conD.getOne(parseLong);
		conD.delete(entity);
	}

	@Override
	public Contact updateContact(Contact con) 
	{
		conD.save(con);
		return con;
	}

	
   
}
