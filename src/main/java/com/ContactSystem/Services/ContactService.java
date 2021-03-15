package com.ContactSystem.Services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ContactSystem.Entities.Contact;

// Interface created to achieve Loose Coupling
public interface ContactService 
{
   public List<Contact> getContacts();
   public Contact getContact(long Phone);
   public Contact addContact(Contact con);
   public Contact updateContact(Contact contact);
   public void removeContact(long parseLong);
}
