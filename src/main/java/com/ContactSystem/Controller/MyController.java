package com.ContactSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ContactSystem.Entities.Contact;
import com.ContactSystem.Services.ContactService;

@RestController
@RequestMapping("/api")
public class MyController
{
	//Creates object of ContctService class to call it's getContacts method
	@Autowired
    ContactService contactS;
	
	
	//Get the List of Contacts
	@GetMapping("/contacts")
	public List<Contact> getContacts()
	{
	  return this.contactS.getContacts();	
	}
	
	//To get a specific contact with id
	@GetMapping("/contacts/{Phone}")
	public Contact getContact(@PathVariable String Phone)
	{
		return this.contactS.getContact(Long.parseLong(Phone));
	}
	
	//To add new Contact 
	@PostMapping("/contacts")
	public Contact addContact(@RequestBody Contact con)
	{
		return this.contactS.addContact(con);
	}
	
	//To update the existing contacts
	@PutMapping("/contacts")
	public Contact updateContact(@RequestBody Contact contact)
	{
		return this.contactS.updateContact(contact);
	}
	
	//To delete the existing contacts
	@DeleteMapping("/contacts/{Phone}")
	public ResponseEntity<HttpStatus> removeContact(@PathVariable String Phone)
	{
		try
		{
			this.contactS.removeContact(Long.parseLong(Phone));
			return new ResponseEntity<>(HttpStatus.OK);
			
			
		}catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
}
